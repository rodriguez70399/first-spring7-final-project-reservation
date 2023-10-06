package es.jmruirod.firstspring7finalprojectreservation.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.jmruirod.firstspring7finalprojectreservation.dao.ReservationDao;
import es.jmruirod.firstspring7finalprojectreservation.model.Reservation;
import es.jmruirod.firstspring7finalprojectreservation.model.dto.ReservationProjection;

@Service
public class ReservationServiceInterfaceImplemented implements ReservationServiceInterface
{
    @Autowired
    private ReservationDao reservationDao;

    @Override
    public void create(Reservation reservation) 
    {
        this.reservationDao.save(reservation);
    }

    @Override
    public List<ReservationProjection> findByHotelId(long hotelId) 
    {
        return this.reservationDao.findByHotelId(hotelId);        
    }
}
