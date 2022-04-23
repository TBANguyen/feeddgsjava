package com.stager.feeddgsjava.services.query;

import com.stager.feeddgsjava.model.EventGroup;
import com.stager.feeddgsjava.repository.EventGroupRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Defines the GraphQL endpoint for EventGroup queries.
 */
@Service
public class EventGroupQueryService {

    @Autowired
    private EventGroupRepository repository;

    public List<EventGroup> eventGroupLatestList() {
        var EventGroup = repository.findAll();
        return EventGroup;
    }
}
