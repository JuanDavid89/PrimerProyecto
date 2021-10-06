package com.youtube.Gradle.model.request;

import java.util.Date;

public class ReservationRequest {
    private Long reservationId;
    private Long roomId;
    private Long guestId;
    private Date restDate;

    public ReservationRequest() {
    }

    public ReservationRequest(Long reservationId, Long roomId, Long guestId, Date restDate) {
        this.reservationId = reservationId;
        this.roomId = roomId;
        this.guestId = guestId;
        this.restDate = restDate;
    }

    public Long getReservationId() {
        return reservationId;
    }

    public void setReservationId(Long reservationId) {
        this.reservationId = reservationId;
    }

    public Long getRoomId() {
        return roomId;
    }

    public void setRoomId(Long roomId) {
        this.roomId = roomId;
    }

    public Long getGuestId() {
        return guestId;
    }

    public void setGuestId(Long guestId) {
        this.guestId = guestId;
    }

    public Date getRestDate() {
        return restDate;
    }

    public void setRestDate(Date restDate) {
        this.restDate = restDate;
    }
}

