package com.stager.feeddgsjava.repository;


import com.stager.feeddgsjava.model.Event;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface EventRepository extends CrudRepository<Event, Integer> {

//    @Query("FROM feed_event SELECT id, primaryEventGroup_id")
    @Query("SELECT e FROM feed_event e")
    List<Event> findAll();

    @Query("SELECT e FROM feed_event e WHERE id like (:event_id)")
    List<Event> findbyid(@Param("event_id") Integer event_id);


}
