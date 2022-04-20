package com.stager.feeddgsjava.datafetchers;


import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsData;
import com.netflix.graphql.dgs.DgsQuery;
import com.netflix.graphql.dgs.InputArgument;
import com.stager.feeddgsjava.model.Event;
//import com.stager.feeddgsjava.services.EventService;
import java.util.List;


@DgsComponent
public class EventDataFetcher {
//
//    private final EventService eventService;
//
//
//
//    public EventDataFetcher(EventService eventService) {this.eventService = eventService;}
//
//    @DgsData(parentType = "Query", field ="events")
//    public List<Event> events(){
////        if (id == null){
////            return Events;
////        }
//        return events;
//    }


}






//        @DgsQuery
//    public List<Event> events(@InputArgument("eventId") int eventId){
//        if (eventId == null) {
//            return eventService.Events();
//        }
//        return eventService.Events(eventId);
//    }
//@DgsData(parentType = "Query", field = "Event")
//    public List<Event> Events(){
//        return List;
