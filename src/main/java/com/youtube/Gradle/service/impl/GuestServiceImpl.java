package com.youtube.Gradle.service.impl;


import com.youtube.Gradle.model.Guest;
import com.youtube.Gradle.model.request.GuestRequest;
import com.youtube.Gradle.repository.GuestReposiroty;
import com.youtube.Gradle.service.GuestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GuestServiceImpl implements GuestService {

    private final GuestReposiroty guestReposiroty;

    @Autowired
    public GuestServiceImpl(final GuestReposiroty guestReposiroty) {
        this.guestReposiroty = guestReposiroty;
    }

    @Override
    public List<Guest> findAll() {
        return guestReposiroty.findAll();
    }

    @Override
    public Optional<Guest> findOne(Long id) {
        return guestReposiroty.findById(id);
    }

    @Override
    public Guest save(GuestRequest guest) {
        return guestReposiroty.save(mapperGuest(guest));
    }


    @Override
    public Guest update(Long id, GuestRequest guest) {
        return guestReposiroty.existsById(id)? guestReposiroty.save(mapperGuest(guest)) : null;
    }

    @Override
    public void delete(Long id) {
        if (guestReposiroty.existsById(id)){
            guestReposiroty.deleteById(id);
        }

    }
    private Guest mapperGuest(GuestRequest gq) {
        Guest guest = new Guest();
        guest.setId(gq.getId());
        guest.setFirstName(gq.getFirstName());
        guest.setLastName(gq.getLastName());
        guest.setEmailAddress(gq.getEmailAddress());
        guest.setAddress(gq.getAddress());
        guest.setCountry(gq.getCountry());
        guest.setState(gq.getState());
        guest.setPhoneNumber(gq.getPhoneNumber());
        return guest;
    }
}
