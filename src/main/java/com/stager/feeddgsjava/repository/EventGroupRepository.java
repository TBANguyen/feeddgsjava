package com.stager.feeddgsjava.repository;


import com.stager.feeddgsjava.model.Event;
import com.stager.feeddgsjava.model.EventGroup;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EventGroupRepository extends CrudRepository<EventGroup, Integer> {

    @Query("SELECT e FROM feed_eventGroup e")
    List<EventGroup> findAll();

}
