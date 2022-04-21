package com.stager.feeddgsjava.resolver;


import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsData;
import com.stager.feeddgsjava.model.Event;
import com.stager.feeddgsjava.model.EventGroup;
import com.stager.feeddgsjava.services.query.EventGroupQueryService;
import com.stager.feeddgsjava.services.query.EventQueryService;
import com.stager.feeddgsjava.util.GraphqlBeanMapper;
import com.stager.graphql.generated.DgsConstants;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.stream.Collectors;

@DgsComponent
public class EventGroupResolver {

    @Autowired
    private EventGroupQueryService queryService;


    @DgsData(parentType = DgsConstants.QUERY_TYPE, field = DgsConstants.QUERY.Eventgroups)
    public List<EventGroup> getEventGroupLatestList(){
        return queryService.eventGroupLatestList().stream().map(GraphqlBeanMapper::mapToGraphql)
                .collect(Collectors.toList());
    }

}
