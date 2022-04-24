package com.stager.feeddgsjava.services.query;


import com.stager.feeddgsjava.model.Event;
import com.stager.feeddgsjava.model.Venue;
import com.stager.feeddgsjava.repository.EventRepository;
import com.stager.feeddgsjava.repository.VenueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;



/**
 * Defines the GraphQL endpoint for Venue queries.
 */

@Service
public class VenueQueryService {

    @Autowired
    private VenueRepository repository;

    public List<Venue> venueLatestList(){
        var Venue = repository.findAll();
        return Venue;
    }
}
