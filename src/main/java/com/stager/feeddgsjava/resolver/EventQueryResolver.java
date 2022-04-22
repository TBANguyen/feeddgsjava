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


@DgsComponent
public class EventQueryResolver {


    @Autowired
    private EventQueryService queryService;


    @DgsData(parentType = DgsConstants.QUERY_TYPE, field = DgsConstants.QUERY.Events)
    public List<Event> getEventLatestList(){
        return queryService.eventLatestList().stream().map(GraphqlBeanMapper::mapToGraphql)
                .collect(Collectors.toList());
    }


//    @DgsData(parentType = DgsConstants.QUERY_TYPE, field = DgsConstants.QUERY.Events)
//    public List<Event> getEventbyid(@InputArgument Integer id){
//        if (id == null){
//            return getEventLatestList();
//        }
//        return queryService.eventonlybyid(id).stream().filter(s -> s.getId(id)).map(GraphqlBeanMapper::mapToGraphql).collect(Collectors.toList());
//    }

//
//    @DgsData(parentType = DgsConstants.QUERY_TYPE, field = DgsConstants.QUERY.Events)
//    public Event getEvent(Integer id){
//        return queryService.eventLatestList().get(id);
//    }






//
//    @DgsQuery
//    public List<Event> eventbyid(@InputArgument Integer id)
//    {
//        if(id == null){
//            return getEventLatestList();
//
//
//        }
//        return queryService.eventbyid(id).stream().map(GraphqlBeanMapper::mapToGraphql).collect(Collectors.toList());
//    }









//
//    @DgsData(parentType = DgsConstants.QUERY_TYPE, field = DgsConstants.QUERY.Eventbyid)
//    public Event getEventfromId(@InputArgument(name = "event_id") Integer event_id){
//        var eventid =  event_id;
//        var event = queryService.eventonlybyid(eventid)
//                .orElseThrow(DgsEntityNotFoundException::new);
//
//        return GraphqlBeanMapper.mapToGraphql(event);

//    @DgsData(parentType = DgsConstants.QUERY_TYPE, field = DgsConstants.QUERY.Eventbyid)
//    public List<Event> getEventbyId(@InputArgument(name = "id", collectionType = com.stager.graphql.generated.types.Event.class)com.stager.graphql.generated.types.Event event){
//        var result = new ArrayList<Event>();
//        var keyword = event.getId();
//
//        var eventbykeyword = queryService.eventbyid(keyword)
//                .stream().map(GraphqlBeanMapper::mapToGraphql).collect(Collectors.toList());
//        result.addAll(eventbykeyword);
//
//        if (result.isEmpty()){
//            throw new DgsEntityNotFoundException("No events found with id " + keyword);
//        }
//
//        return result;


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



//    @DgsData(parentType = "Query", field = "Event")
//    public List<Event> Events(@InputArgument(value ="eventid")Optional<int> eventId) {
//        if (eventId.isEmpty())
//            return Events();
//    }

