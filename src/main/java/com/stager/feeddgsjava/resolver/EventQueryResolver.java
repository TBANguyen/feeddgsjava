package com.stager.feeddgsjava.resolver;


import com.netflix.graphql.dgs.*;
import com.netflix.graphql.dgs.exceptions.DgsEntityNotFoundException;
import com.stager.feeddgsjava.model.Event;
import com.stager.feeddgsjava.services.query.EventQueryService;
import com.stager.feeddgsjava.util.GraphqlBeanMapper;
import com.stager.graphql.generated.DgsConstants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;


/**
 * Translates GraphQL queries regarding Event to db queries and the db results to JSON.
 */

@DgsComponent
public class EventQueryResolver {

    @Autowired
    private EventQueryService queryService;

    @DgsData(parentType = DgsConstants.QUERY_TYPE, field = DgsConstants.QUERY.Events)
    public List<Event> getEventLatestList() {
        return queryService.eventLatestList().stream().map(GraphqlBeanMapper::mapToGraphql)
                .collect(Collectors.toList());
    }
}

