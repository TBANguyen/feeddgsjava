package com.stager.feeddgsjava.repository;

import com.stager.feeddgsjava.model.EventGroup;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Definition of db queries on the feed's EventGroup table.
 */
@Repository
public interface EventGroupRepository extends CrudRepository<EventGroup, Integer> {

    @Query("SELECT e FROM feed_eventGroup e")
    List<EventGroup> findAll();

}
