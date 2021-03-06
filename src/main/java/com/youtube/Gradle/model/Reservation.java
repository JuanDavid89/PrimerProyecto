package com.youtube.Gradle.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table (name = "RESERVATION")
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "RESERVATION_ID")
    private Long reservationId;

    @Column (name = "ROOM_ID")
    private Long roomId;

    @Column (name = "GUEST_ID")
    private Long guestId;

    @Column (name = "REST_DATE")
    private Date restId;

    public Reservation() {
    }

    public Reservation(Long reservationId, Long roomId, Long guestId, Date restId) {
        this.reservationId = reservationId;
        this.roomId = roomId;
        this.guestId = guestId;
        this.restId = restId;
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

    public Date getRestId() {
        return restId;
    }

    public void setRestId(Date restId) {
        this.restId = restId;
    }
}
