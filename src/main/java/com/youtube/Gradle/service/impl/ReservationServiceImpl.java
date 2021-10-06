package com.youtube.Gradle.service.impl;

import com.youtube.Gradle.model.Reservation;
import com.youtube.Gradle.model.Room;
import com.youtube.Gradle.model.request.ReservationRequest;
import com.youtube.Gradle.model.request.RoomRequest;
import com.youtube.Gradle.repository.ReservationRepository;
import com.youtube.Gradle.repository.RoomRepository;
import com.youtube.Gradle.service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReservationServiceImpl implements ReservationService {

    private final ReservationRepository reservationRepository;

    @Autowired
    public ReservationServiceImpl(ReservationRepository reservationRepository) {
        this.reservationRepository = reservationRepository;}


    @Override
    public List<Reservation> findAll() {
        return reservationRepository.findAll();
    }
    @Override
    public Reservation findOne(Long id) {
        return reservationRepository.findById(id).get();
    }
    @Override
   public Reservation save(ReservationRequest reservation) {
        return reservationRepository.save(mapperReservation(reservation));
   }

    @Override
    public Reservation update(Long id, ReservationRequest reservation) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }

    private Reservation mapperReservation(ReservationRequest reservationRequest){
        Reservation reservation = new Reservation();
        reservation.setReservationId(reservationRequest.getReservationId());
        reservation.setRoomId(reservation.getRoomId());
        reservation.setGuestId(reservationRequest.getGuestId());
        reservation.setRestId(reservationRequest.getRestDate());

        return reservation;
    }
}
