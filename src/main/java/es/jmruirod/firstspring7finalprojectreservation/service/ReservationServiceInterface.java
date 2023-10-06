package es.jmruirod.firstspring7finalprojectreservation.service;

import java.util.List;

import es.jmruirod.firstspring7finalprojectreservation.model.Reservation;
import es.jmruirod.firstspring7finalprojectreservation.model.dto.ReservationProjection;

public interface ReservationServiceInterface 
{
    public void create(Reservation reservation);
    public List<ReservationProjection> findByHotelId(long hotelId);    
}
