//package com.stager.feeddgsjava.datafetchers;
//
//
//import com.netflix.graphql.dgs.DgsComponent;
//import com.netflix.graphql.dgs.DgsQuery;
//import com.netflix.graphql.dgs.InputArgument;
//import com.stager.feeddgsjava.services.EventService;
//
//@DgsComponent
//public class EventDataFetcher {
//
//    private final EventService eventService;
//
//    public EventDataFetcher(EventService eventService) {this.eventService = eventService;}
//
//
//    @DgsQuery
//    public List<Event> events(@InputArgument("eventId") int eventId){
//        if (eventId == null) {
//            return eventService.Events();
//        }
//
//        return eventService.Events().stream().filter((s -> s.get))
//    }
//}
