package es.jmruirod.firstspring7finalprojectreservation.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import es.jmruirod.firstspring7finalprojectreservation.model.Reservation;
import es.jmruirod.firstspring7finalprojectreservation.model.dto.ReservationProjection;

public interface ReservationDao extends JpaRepository<Reservation, Long>
{
    public List<ReservationProjection> findByHotelId(Long hotelId);
}