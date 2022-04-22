package com.stager.feeddgsjava.services.query;


import com.stager.feeddgsjava.model.Event;
import com.stager.feeddgsjava.repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.nio.file.attribute.UserPrincipalNotFoundException;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class EventQueryService {

    @Autowired
    private EventRepository repository;

    public List<Event> eventLatestList(){
        var Events = repository.findAll();
        return Events;
    }

    public Optional<Event> eventonlybyid(Integer event_id) {return repository.findById(event_id);}



//    public List<Event> eventbyid(Integer event_id) {
//        return repository.findbyid(event_id);
//    }


//    public Event eventonlybyid(Integer event_id) {return repository.findAll().get(event_id);}
}
