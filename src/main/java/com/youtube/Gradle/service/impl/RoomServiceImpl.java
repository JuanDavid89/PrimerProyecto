package com.youtube.Gradle.service.impl;

import com.youtube.Gradle.model.Room;
import com.youtube.Gradle.model.request.RoomRequest;
import com.youtube.Gradle.repository.RoomRepository;
import com.youtube.Gradle.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoomServiceImpl implements RoomService {

    private final RoomRepository roomRepository;

    @Autowired
    public RoomServiceImpl(RoomRepository roomRepository) {
        this.roomRepository = roomRepository;
    }

    @Override
    public List<Room> findall() {
        return roomRepository.findAll();
    }

    @Override
    public Room findOne(String numberRoom) {
        return roomRepository.findByRoomNumber(numberRoom);
    }

    @Override
    public Room save(RoomRequest room) {
        return roomRepository.save(mapperRoom(room));
    }

    @Override
    public Room update(Long id,RoomRequest room) {
        room.setRoomId(id);
        return roomRepository.existsById(id)? roomRepository.save(mapperRoom(room)) : null;
    }

    @Override
    public void delete(Long id) {
      if (roomRepository.existsById(id)) {
          roomRepository.deleteById(id);
      }

    }

    private Room mapperRoom(RoomRequest rq){
        Room room = new Room();
        room.setRoomid(rq.getRoomId());
        room.setName(rq.getName());
        room.setRoomNumber(rq.getRoomNumber());
        room.setBedinfo(rq.getBedInfo());
        return room;
    }
}
