package es.jmruirod.firstspring7finalprojectreservation.service;

import java.util.List;

import es.jmruirod.firstspring7finalprojectreservation.model.Reservation;
import es.jmruirod.firstspring7finalprojectreservation.model.dto.ReservationProjection;

/**
 * Interfaz que define los servicios disponibles para la gestión de reservas.
 * 
 * @author Jose Manuel Ruiz Rodriguez
 */
public interface ReservationServiceInterface 
{
    /**
     * Crea una nueva reserva en el sistema.
     *
     * @param reservation La reserva a crear.
     */
    public void create(Reservation reservation);

    /**
     * Busca y devuelve una lista de proyecciones de reservas (ReservationProjection)
     * asociadas a un hotel específico identificado por su ID.
     *
     * @param hotelId El ID del hotel para el cual se desean obtener las reservas.
     * @return Lista de proyecciones de reservas (ReservationProjection) asociadas al hotel.
     */
    public List<ReservationProjection> findByHotelId(long hotelId);    
}
