package com.stager.feeddgsjava;


import com.graphql.spring.boot.test.GraphQLTestTemplate;
import com.netflix.graphql.dgs.DgsQuery;
import com.netflix.graphql.dgs.DgsQueryExecutor;
import com.netflix.graphql.dgs.InputArgument;
import com.netflix.graphql.dgs.autoconfig.DgsAutoConfiguration;
import com.stager.feeddgsjava.model.Event;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;



@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT, classes = {DgsAutoConfiguration.class, FeeddgsjavaApplication.class})
public class FeedTests {

    @Autowired
    DgsQueryExecutor dgsQueryExecutor;

    @Autowired
    GraphQLTestTemplate graphQLTestTemplate;

    @Autowired
    TestRestTemplate testRestTemplate;

    @Test
    void EventsId(){
        List<Integer> events = dgsQueryExecutor.executeAndExtractJsonPath(
                " { events { id }}",
                "data.events[*].id");

        //find the new event that was created through the monolith
        assertThat(events).containsSequence(1,1,1,2);
    }





//    @Test
//    void TestEvents(){
//        List<String> titles = dgsQueryExecutor.executeAndExtractJsonPath(
//                "{ eventTestList { id primaryEventGroup_id organizer_id venue_id series_id title}}",
//                "data.eventTestList[*].title"
//
//        );
//
//        assertThat(titles).contains("event1");
//
//    }
}
