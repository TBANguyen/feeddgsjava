package com.stager.feeddgsjava.repository;

import com.stager.feeddgsjava.model.Organizer;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Definition of db queries on the feed's Organizer table.
 */
@Repository
public interface OrganizerRepository extends CrudRepository<Organizer, Integer> {

    @Query("SELECT e FROM feed_organizer e")
    List<Organizer> findAll();
}
