package es.jmruirod.firstspring7finalprojectreservation.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import es.jmruirod.firstspring7finalprojectreservation.model.Hotel;

/**
 * Implementación concreta de la interfaz HotelServiceInterface que proporciona los métodos
 * para gestionar hoteles y manejar excepciones personalizadas.
 * 
 * @author Jose Manuel Ruiz Rodriguez
 */
@Service
public class HotelServiceInterfaceImplemented implements HotelServiceInterface
{
    @Autowired
    private RestTemplate template;

    private String url = "http://localhost:8080/";

    /**
     * {@inheritDoc}
     * 
     */
    @Override
    public List<Hotel> findByAvailable() 
    {
        return Arrays.asList(this.template.getForObject(url + "hotels", Hotel[].class));
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Hotel findByName(String name) 
    {
        return this.template.getForObject(url + "hotel/name/" + name, Hotel.class);
    }
}

