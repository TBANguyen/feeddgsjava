package com.stager.feeddgsjava;


import com.graphql.spring.boot.test.GraphQLResponse;
import com.graphql.spring.boot.test.GraphQLTestTemplate;
import org.json.JSONException;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.IOException;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.skyscreamer.jsonassert.JSONAssert.assertEquals;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT, classes = TestApplication.class)
public class ResolverTests {
    
    //Also known as integration tests
    @Autowired
    GraphQLTestTemplate graphQLTestTemplate;

    @Test
    public void shouldAbleToGetEventData() throws IOException, JSONException {
        GraphQLResponse graphQLResponse = graphQLTestTemplate.postForResource("request/eventquery.graphqls");
        assertThat(graphQLResponse.isOk(),equalTo(true));
        assertEquals(FileReaderHelper.read("response/eventquery.json"), graphQLResponse.getRawResponse().getBody(), true);
    }

    @Test
    public void shouldAbleToGetEventGroupData() throws IOException, JSONException {
        GraphQLResponse graphQLResponse = graphQLTestTemplate.postForResource("request/eventgroupquery.graphqls");
        assertThat(graphQLResponse.isOk(),equalTo(true));
        assertEquals(FileReaderHelper.read("response/eventgroupquery.json"), graphQLResponse.getRawResponse().getBody(), true);
    }

    @Test
    public void shouldAbleToGetOrganizersData() throws IOException, JSONException {
        GraphQLResponse graphQLResponse = graphQLTestTemplate.postForResource("request/organizersquery.graphqls");
        assertThat(graphQLResponse.isOk(),equalTo(true));
        assertEquals(FileReaderHelper.read("response/organizersquery.json"), graphQLResponse.getRawResponse().getBody(), true);
    }

    @Test
    public void shouldAbleToGetVenueData() throws IOException, JSONException {
        GraphQLResponse graphQLResponse = graphQLTestTemplate.postForResource("request/venuequery.graphqls");
        assertThat(graphQLResponse.isOk(),equalTo(true));
        assertEquals(FileReaderHelper.read("response/venuequery.json"), graphQLResponse.getRawResponse().getBody(), true);
    }
}