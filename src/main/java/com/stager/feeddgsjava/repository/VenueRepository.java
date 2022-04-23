package com.stager.feeddgsjava.repository;

import com.stager.feeddgsjava.model.Venue;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Definition of db queries on the feed's Venue table.
 */
@Repository
public interface VenueRepository extends CrudRepository<Venue, Integer> {

    @Query("SELECT e FROM feed_venue e")
    List<Venue> findAll();
}
