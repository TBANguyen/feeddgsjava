package com.stager.feeddgsjava.services.query;


import com.stager.feeddgsjava.model.Event;
import com.stager.feeddgsjava.repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class EventQueryService {

    private EventRepository repository;

    public List<Event> eventLatestList(){
        var Events = repository.findAllById();

        return Events;
    }

    public Optional<Event> eventDetail (UUID event_id){
        return repository.findById(event_id);
    }
}
