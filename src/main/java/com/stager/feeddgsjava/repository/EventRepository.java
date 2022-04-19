package com.stager.feeddgsjava.repository;


import com.stager.feeddgsjava.model.Event;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;


@Repository
public interface EventRepository extends CrudRepository<Event, UUID> {
    List<Event> findAllById();


}
