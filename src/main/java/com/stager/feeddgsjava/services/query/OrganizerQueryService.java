package com.stager.feeddgsjava.services.query;


import com.stager.feeddgsjava.model.Organizer;
import com.stager.feeddgsjava.repository.OrganizerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * Defines the GraphQL endpoint for Organizer queries.
 */


@Service
public class OrganizerQueryService {

    @Autowired
    private OrganizerRepository repository;

    public List<Organizer> organizerLatestList(){
        var Organizer = repository.findAll();
        return Organizer;
    }
}
