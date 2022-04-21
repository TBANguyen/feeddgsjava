package com.stager.feeddgsjava.resolver;


import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsData;
import com.stager.feeddgsjava.model.Organizer;
import com.stager.feeddgsjava.model.Venue;
import com.stager.feeddgsjava.services.query.OrganizerQueryService;
import com.stager.feeddgsjava.util.GraphqlBeanMapper;
import com.stager.graphql.generated.DgsConstants;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.stream.Collectors;

@DgsComponent
public class OrganizerQueryResolver {



    @Autowired
    private OrganizerQueryService queryService;


    @DgsData(parentType = DgsConstants.QUERY_TYPE, field = DgsConstants.QUERY.Organizers)
    public List<Organizer> getOrganizerLatestList() {
        return queryService.organizerLatestList().stream().map(GraphqlBeanMapper::mapToGraphql)
                .collect(Collectors.toList());
    }
}
