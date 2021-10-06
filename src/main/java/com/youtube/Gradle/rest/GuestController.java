package com.youtube.Gradle.rest;

import com.youtube.Gradle.model.Guest;
import com.youtube.Gradle.model.request.GuestRequest;
import com.youtube.Gradle.service.GuestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@RestController
@RequestMapping(value = "/guests")
public class GuestController {

    private final GuestService guestService;

    @Autowired
    public GuestController(GuestService guestService) {
        this.guestService = guestService;
    }
        @GetMapping
        public ResponseEntity<List<Guest>> findAll(){
            List<Guest> guestList = guestService.findAll();
            return guestList.isEmpty() ?
                    new ResponseEntity<>(null, HttpStatus.NOT_FOUND):
                    new ResponseEntity<>(guestList, HttpStatus.OK);
    }

    @GetMapping(value = "/{id}")
            public ResponseEntity<Guest> findGuest(@PathVariable(value = "id") Long id) {
           Optional<Guest> guest = guestService.findOne(id);
            if (guest.isPresent()) {
                return new ResponseEntity<Guest>(guest.get(), HttpStatus.OK);
            } else {
                return  new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
            }
    }

    @PostMapping
    public ResponseEntity<Guest> saveGuest(@RequestBody GuestRequest guestRequest){
        return  new ResponseEntity<>(guestService.save(guestRequest), HttpStatus.CREATED);
    }

    @PutMapping(value = "/{id}")
    public  ResponseEntity<Guest> updateGuest(@Validated @PathVariable(value = "id") Long id, @RequestBody GuestRequest guestRequest) {
        return new ResponseEntity<>(guestService.update(id, guestRequest), HttpStatus.OK);
    }

    @DeleteMapping(value = "/{id}")
    public void deleteGuest(@Validated @PathVariable(value = "id") Long id){
        guestService.delete(id);
    }

}
