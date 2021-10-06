package com.youtube.Gradle.model.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RoomDto {
    private Long roomId;
    private String name;
    @JsonProperty("room_number")
    private String roomNumber;
    @JsonProperty("bed_info")
    private String bedInfo;

    public RoomDto() {
    }

    public RoomDto(Long roomId, String name, String roomNumber, String bedInfo) {
        this.roomId = roomId;
        this.name = name;
        this.roomNumber = roomNumber;
        this.bedInfo = bedInfo;
    }

    public Long getRoomId() {
        return roomId;
    }

    public void setRoomId(Long roomId) {
        this.roomId = roomId;
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

    public String getBedInfo() {
        return bedInfo;
    }

    public void setBedInfo(String bedInfo) {
        this.bedInfo = bedInfo;
    }
}
