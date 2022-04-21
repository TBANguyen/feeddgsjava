package com.stager.feeddgsjava.resolver;


import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsData;
import com.stager.feeddgsjava.model.Event;
import com.stager.feeddgsjava.model.Venue;
import com.stager.feeddgsjava.repository.VenueRepository;
import com.stager.feeddgsjava.services.query.EventQueryService;
import com.stager.feeddgsjava.services.query.VenueQueryService;
import com.stager.feeddgsjava.util.GraphqlBeanMapper;
import com.stager.graphql.generated.DgsConstants;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.stream.Collectors;

@DgsComponent
public class VenueQueryResolver {

    @Autowired
    private VenueQueryService queryService;


    @DgsData(parentType = DgsConstants.QUERY_TYPE, field = DgsConstants.QUERY.Venues)
    public List<Venue> getVenueLatestList() {
        return queryService.venueLatestList().stream().map(GraphqlBeanMapper::mapToGraphql)
                .collect(Collectors.toList());
    }
}
