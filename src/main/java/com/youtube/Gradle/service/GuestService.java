package com.youtube.Gradle.service;


import com.youtube.Gradle.model.Guest;
import com.youtube.Gradle.model.request.GuestRequest;

import java.util.List;
import java.util.Optional;

public interface GuestService {

    public List<Guest> findAll();
    public Optional<Guest> findOne(Long id);
    public Guest save(GuestRequest guest);
    public Guest update (Long id, GuestRequest guest);
    public void delete(Long id);

}
