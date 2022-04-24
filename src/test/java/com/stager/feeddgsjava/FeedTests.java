package com.stager.feeddgsjava;


import com.graphql.spring.boot.test.GraphQLTestTemplate;
import com.netflix.graphql.dgs.DgsQuery;
import com.netflix.graphql.dgs.DgsQueryExecutor;
import com.netflix.graphql.dgs.InputArgument;
import com.netflix.graphql.dgs.autoconfig.DgsAutoConfiguration;
import com.netflix.graphql.dgs.client.codegen.GraphQLQueryRequest;
import com.stager.feeddgsjava.model.Event;
import com.stager.graphql.generated.client.EventsGraphQLQuery;
import com.stager.graphql.generated.client.EventsProjectionRoot;
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

    @Test
    void EventsId() {
        List<Integer> events = dgsQueryExecutor.executeAndExtractJsonPath(
                " { events { id }}",
                "data.events[*].id");

        assertThat(events).containsSequence(1, 1, 1, 2);
    }

    @Test
    public void eventsWithQueryApi() {
        GraphQLQueryRequest graphQLQueryRequest = new GraphQLQueryRequest(
                new EventsGraphQLQuery.Builder().build(),
                new EventsProjectionRoot().id()
        );
        List<Integer> ids = dgsQueryExecutor.executeAndExtractJsonPath(graphQLQueryRequest.serialize(), "data.events[*].id");
        assertThat(ids).containsSequence(1, 1, 1, 1, 2);
    }

    @Test
    void EventPrimaryGroupId() {
        List<Integer> events = dgsQueryExecutor.executeAndExtractJsonPath(
                " { events { primaryEventGroup_id }}",
                "data.events[*].primaryEventGroup_id");

        assertThat(events).containsSequence(1, 1, 1, 2);
    }

    @Test
    void EventOrganizerId() {
        List<Integer> events = dgsQueryExecutor.executeAndExtractJsonPath(
                " { events { organizer_id }}",
                "data.events[*].organizer_id");

        assertThat(events).containsSequence(1, 1, 1, 1);
    }

    @Test
    void EventVenueId() {
        List<Integer> events = dgsQueryExecutor.executeAndExtractJsonPath(
                " { events { venue_id }}",
                "data.events[*].venue_id");

        assertThat(events).containsSequence(1, 1, 1, 1);
    }

    @Test
    void EventSeriesId() {
        List<Integer> events = dgsQueryExecutor.executeAndExtractJsonPath(
                " { events { series_id }}",
                "data.events[*].series_id");

        assertThat(events).containsSequence(1, 1, 1, 2);
    }

    @Test
    void VenueId() {
        List<Integer> events = dgsQueryExecutor.executeAndExtractJsonPath(
                " { venues { id }}",
                "data.venues[*].id");

        assertThat(events).containsSequence(1);
    }

    @Test
    void VenueOrganizerId() {
        List<Integer> events = dgsQueryExecutor.executeAndExtractJsonPath(
                " { venues { organizer_id }}",
                "data.venues[*].organizer_id");

        assertThat(events).containsSequence(1);
    }

    @Test
    void OrganizerId() {
        List<Integer> events = dgsQueryExecutor.executeAndExtractJsonPath(
                " { organizers { id }}",
                "data.organizers[*].id");

        assertThat(events).containsSequence(1);
    }

    @Test
    void EventGroupId() {
        List<Integer> events = dgsQueryExecutor.executeAndExtractJsonPath(
                " { eventgroups { id }}",
                "data.eventgroups[*].id");

        assertThat(events).containsSequence(1, 1, 1, 1, 2);
    }

    @Test
    void EventGroupOrganizerId() {
        List<Integer> events = dgsQueryExecutor.executeAndExtractJsonPath(
                " { eventgroups { organizer_id }}",
                "data.eventgroups[*].organizer_id");

        assertThat(events).containsSequence(1, 1, 1, 1, 1);
    }



}




