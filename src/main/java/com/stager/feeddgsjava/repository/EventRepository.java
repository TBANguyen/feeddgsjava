package com.stager.feeddgsjava.repository;

import com.stager.feeddgsjava.model.Event;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Definition of db queries on the feed's Event table.
 */
@Repository
public interface EventRepository extends CrudRepository<Event, Integer> {

    @Query("SELECT e FROM feed_event e")
    List<Event> findAll();

}
