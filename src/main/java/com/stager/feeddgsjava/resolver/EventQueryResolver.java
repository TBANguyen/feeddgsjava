package com.stager.feeddgsjava.resolver;


import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsData;
import com.netflix.graphql.dgs.DgsTypeResolver;
import com.netflix.graphql.dgs.InputArgument;
import com.netflix.graphql.dgs.exceptions.DgsEntityNotFoundException;
import com.stager.feeddgsjava.model.Event;
import com.stager.feeddgsjava.services.query.EventQueryService;
import com.stager.feeddgsjava.util.GraphqlBeanMapper;
import com.stager.graphql.generated.DgsConstants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;


@DgsComponent
public class EventQueryResolver {


    @Autowired
    private EventQueryService queryService;


    @DgsData(parentType = DgsConstants.QUERY_TYPE, field = DgsConstants.QUERY.Events)
    public List<Event> getEventLatestList(){
        return queryService.eventLatestList().stream().map(GraphqlBeanMapper::mapToGraphql)
                .collect(Collectors.toList());
    }

    @DgsData(parentType = DgsConstants.QUERY_TYPE, field = DgsConstants.QUERY.Eventbyid)
    public Event getEventfromId(@InputArgument(name = "event_id") Integer event_id){
        var eventid =  event_id;
        var event = queryService.eventonlybyid(eventid)
                .orElseThrow(DgsEntityNotFoundException::new);

        return GraphqlBeanMapper.mapToGraphql(event);
    }















//    @DgsData(parentType = DgsConstants.QUERY_TYPE, field = DgsConstants.QUERY.Events)
//    public Event getEventDetail(@InputArgument(value = "event_id") UUID id) {
//        var eventid = id;
//        var event = queryService.eventDetail(eventid)
//                .orElseThrow(DgsEntityNotFoundException::new);
//
//        return GraphqlBeanMapper.mapToGraphql((event));
//    }



//    @DgsTypeResolver(name="Event")
//    public String resolveEvent( Event event)
//    {
//       return Event;
    }



//    @DgsData(parentType = "Query", field = "Event")
//    public List<Event> Events(@InputArgument(value ="eventid")Optional<int> eventId) {
//        if (eventId.isEmpty())
//            return Events();
//    }

