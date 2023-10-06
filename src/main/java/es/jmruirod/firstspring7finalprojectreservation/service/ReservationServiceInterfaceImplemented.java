package es.jmruirod.firstspring7finalprojectreservation.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.jmruirod.firstspring7finalprojectreservation.dao.ReservationDao;
import es.jmruirod.firstspring7finalprojectreservation.model.Reservation;
import es.jmruirod.firstspring7finalprojectreservation.model.dto.ReservationProjection;

/**
 * Implementación de la interfaz ReservationServiceInterface para la gestión de reservas.
 * 
 * @author Jose Manuel Ruiz Rodriguez
 */
@Service
public class ReservationServiceInterfaceImplemented implements ReservationServiceInterface
{
    @Autowired
    private ReservationDao reservationDao;

    /**
     * Crea una nueva reserva en el sistema.
     *
     * @param reservation La reserva a crear.
     */
    @Override
    public void create(Reservation reservation) 
    {
        this.reservationDao.save(reservation);
    }

    /**
     * Busca y devuelve una lista de proyecciones de reservas (ReservationProjection)
     * asociadas a un hotel específico identificado por su ID.
     *
     * @param hotelId El ID del hotel para el cual se desean obtener las reservas.
     * @return Lista de proyecciones de reservas (ReservationProjection) asociadas al hotel.
     */
    @Override
    public List<ReservationProjection> findByHotelId(long hotelId) 
    {
        return this.reservationDao.findByHotelId(hotelId);        
    }
}
