package com.youtube.Gradle.rest;

import com.youtube.Gradle.model.Room;
import com.youtube.Gradle.model.request.RoomRequest;
import com.youtube.Gradle.repository.RoomRepository;
import com.youtube.Gradle.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Objects;

@RestController
public class RoomController {

    private final RoomService roomService;

    @Autowired
    public RoomController(RoomService roomService) {
        this.roomService = roomService;
    }

    @GetMapping(value = "/rooms")
    public ResponseEntity<List<Room>> findAll() {
        List<Room> roomList = roomService.findall();
        return roomList.isEmpty() ?
                new ResponseEntity<>(null, HttpStatus.NOT_FOUND) :
                new ResponseEntity<>(roomList, HttpStatus.OK);
    }

    @GetMapping(value = "/rooms/{roomNumber}")
    public ResponseEntity<Room> findRoom(@PathVariable(value = "roomNumber") String roomNumber) {
        if (Objects.isNull(roomNumber)) {
            return new ResponseEntity<>(roomService.findOne(roomNumber), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping(value = "/rooms")
    public ResponseEntity<Room> saveRoom(@RequestBody RoomRequest roomRequest) {
        return new ResponseEntity<>(roomService.save(roomRequest), HttpStatus.CREATED);
    }

    @PutMapping(value = "/rooms/{id}")
    public ResponseEntity<Room> updateRoom(@Validated @PathVariable(value = "id") Long id, @RequestBody RoomRequest roomRequest) {
        return new ResponseEntity<>(roomService.update(id,roomRequest), HttpStatus.OK);
    }


    }


