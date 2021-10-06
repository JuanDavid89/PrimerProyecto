package com.youtube.Gradle.repository;

import com.youtube.Gradle.model.Guest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GuestReposiroty extends JpaRepository<Guest, Long> {

}
