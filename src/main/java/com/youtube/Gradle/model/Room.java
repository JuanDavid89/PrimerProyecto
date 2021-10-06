package com.youtube.Gradle.model;

import javax.persistence.*;

@Entity
@Table(name = "ROOM")
public class Room {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ROOM_ID")
    private Long roomid;

    @Column(name = "NAME")
    private String name;

    @Column(name = "ROOM_NUMBER")
    private String roomNumber;

    @Column(name = "BED_INFO")
    private String bedInfo;

    public Room() {
    }

    public Room(Long roomid, String name, String roomNumber, String bedinfo) {
        this.roomid = roomid;
        this.name = name;
        this.roomNumber = roomNumber;
        this.bedInfo = bedinfo;
    }

    public Long getRoomid() {
        return roomid;
    }

    public void setRoomid(Long roomid) {
        this.roomid = roomid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getBedinfo() {
        return bedInfo;
    }

    public void setBedinfo(String bedinfo) {
        this.bedInfo = bedinfo;
    }


}
