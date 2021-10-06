package com.youtube.Gradle.service;

import com.youtube.Gradle.model.Room;
import com.youtube.Gradle.model.request.RoomRequest;

import java.util.List;

public interface RoomService {
    public List<Room> findall();
    public Room findOne(String numberRoom);
    public Room save(RoomRequest room);
    public Room update(Long id,RoomRequest room);
    public void delete(Long id);
}
