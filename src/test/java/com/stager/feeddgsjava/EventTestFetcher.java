package com.stager.feeddgsjava;


import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsQuery;
import com.netflix.graphql.dgs.InputArgument;

import java.util.List;

@DgsComponent
public class EventTestFetcher {

    private final List<EventTest> eventTestList = List.of(
            new EventTest(10,20,30,40,50, "event1"),
            new EventTest(100,200,300,400,500,"event2"),
            new EventTest(1000,2000,3000,4000,5000,"event3"),
            new EventTest(10000,20000,30000,40000,50000,"event4")

    );


}
