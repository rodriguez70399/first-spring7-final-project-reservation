package es.jmruirod.firstspring7finalprojectreservation.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import es.jmruirod.firstspring7finalprojectreservation.model.Flight;

/**
 * Implementación de la interfaz FlightServiceInterface que proporciona servicios relacionados con los vuelos en la aplicación.
 * 
 * @author Jose Manuel Ruiz Rodriguez
 */
@Service
public class FlightServiceInterfaceImplemented implements FlightServiceInterface
{
    @Autowired
    private RestTemplate template;

    private String url = "http://localhost:8081/";

    /**
     * Busca y devuelve una lista de vuelos con un número de asientos disponibles mayor que el valor proporcionado.
     *
     * @param seats El número de asientos disponibles que deben tener los vuelos en la lista.
     * @return Una lista de vuelos con un número de asientos disponibles mayor que el valor especificado.
     */
    @Override
    public List<Flight> findByAvailableSeats(int seats) 
    {
        return Arrays.asList(this.template.getForObject(url + "flights/" + seats, Flight[].class));
    }

    /**
     * Actualiza el número de asientos disponibles para un vuelo específico.
     *
     * @param id            El identificador único del vuelo que se actualizará.
     * @param availableSeats El nuevo número de asientos disponibles para el vuelo.
     */
    @Override
    public void updateAvailableSeats(long id, int availableSeats) 
    {
        this.template.put(url + "flight/" + id + "/" + availableSeats, null);
    }
}
