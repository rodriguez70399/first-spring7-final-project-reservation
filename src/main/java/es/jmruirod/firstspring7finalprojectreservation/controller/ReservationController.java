package es.jmruirod.firstspring7finalprojectreservation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import es.jmruirod.firstspring7finalprojectreservation.model.Flight;
import es.jmruirod.firstspring7finalprojectreservation.model.Hotel;
import es.jmruirod.firstspring7finalprojectreservation.model.Reservation;
import es.jmruirod.firstspring7finalprojectreservation.model.TemporalReservation;
import es.jmruirod.firstspring7finalprojectreservation.service.FlightServiceInterface;
import es.jmruirod.firstspring7finalprojectreservation.service.HotelServiceInterface;
import es.jmruirod.firstspring7finalprojectreservation.service.ReservationServiceInterface;

@RestController
public class ReservationController 
{
    @Autowired
    private ReservationServiceInterface reservationService;

    @Autowired
    private HotelServiceInterface hotelService;

    @Autowired
    private FlightServiceInterface flightService;

    @PostMapping(value = "reservation", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> create(@RequestBody TemporalReservation temporalReservation)
    {
        List<Hotel> hotels = this.hotelService.findByAvailable();
        List<Flight> flights = this.flightService.findByAvailableSeats(temporalReservation.getReservationsNumber());
        Reservation reservation = null;
        Flight temporalFlight = null;

        if (!hotels.stream().anyMatch(hotel -> hotel.getId() == temporalReservation.getHotelId())) 
        {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("The hotel is not available or does not exist.");
        }

        if (!flights.stream().anyMatch(flight -> flight.getId() == temporalReservation.getFlightId())) 
        {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("The flight is not available or does not exist.");
        }

        temporalFlight = flights.stream().filter(flight -> flight.getId() == temporalReservation.getFlightId()).findFirst().get();
        reservation = new Reservation();
        reservation.setClientDni(temporalReservation.getClientDni());
        reservation.setClientName(temporalReservation.getClientName());
        reservation.setFlightId(temporalReservation.getFlightId());
        reservation.setHotelId(temporalReservation.getHotelId());

        this.reservationService.create(reservation);
        this.flightService.updateAvailableSeats(temporalReservation.getFlightId(), temporalFlight.getAvailableSeats() - temporalReservation.getReservationsNumber());

        return ResponseEntity.ok("Reservation made successfully.");
    }

    @GetMapping(value = "reservation/hotel/{name}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> getAvailableReservation(@PathVariable String name)
    {
        Hotel hotel = this.hotelService.findByName(name);
        return ResponseEntity.ok(this.reservationService.findByHotelId(hotel.getId()));
    }
}
