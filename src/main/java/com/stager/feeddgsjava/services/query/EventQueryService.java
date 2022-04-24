package com.stager.feeddgsjava.services.query;


import com.stager.feeddgsjava.model.Event;
import com.stager.feeddgsjava.repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.nio.file.attribute.UserPrincipalNotFoundException;
import java.util.List;
import java.util.Optional;
import java.util.UUID;


/**
 * Defines what the resolvers can call regarding Events.
 */

@Service
public class EventQueryService {

    @Autowired
    private EventRepository repository;

    public List<Event> eventLatestList(){
        var Events = repository.findAll();
        return Events;
    }
}
