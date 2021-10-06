package com.youtube.Gradle.service;

import com.youtube.Gradle.model.Reservation;
import com.youtube.Gradle.model.Room;
import com.youtube.Gradle.model.request.ReservationRequest;
import com.youtube.Gradle.model.request.RoomRequest;

import java.util.List;

public interface ReservationService {
    public List<Reservation> findAll();
    public Reservation findOne(Long rid);
    public Reservation save(ReservationRequest reservation);
    public Reservation update(Long id,ReservationRequest reservation);
    public void delete(Long id);
}
