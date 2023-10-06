package es.jmruirod.firstspring7finalprojectreservation.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import es.jmruirod.firstspring7finalprojectreservation.model.Reservation;
import es.jmruirod.firstspring7finalprojectreservation.model.dto.ReservationProjection;

/**
 * Interfaz que define métodos de acceso a datos para la entidad Reservation en la base de datos.
 * 
 * @author Jose Manuel Ruiz Rodriguez
 */
public interface ReservationDao extends JpaRepository<Reservation, Long>
{
    /**
     * Busca y devuelve una lista de proyecciones de reservas (ReservationProjection)
     * asociadas a un hotel específico identificado por su ID.
     *
     * @param hotelId El ID del hotel para el cual se desean obtener las reservas.
     * @return Lista de proyecciones de reservas (ReservationProjection) asociadas al hotel.
     */
    public List<ReservationProjection> findByHotelId(Long hotelId);
}
