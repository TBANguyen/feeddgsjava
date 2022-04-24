package com.stager.feeddgsjava.util;

import com.stager.feeddgsjava.model.Event;
import com.stager.feeddgsjava.model.EventGroup;
import com.stager.feeddgsjava.model.Organizer;
import com.stager.feeddgsjava.model.Venue;

/**
 *  Maps the JPA Bean types to GraphQL Bean types.
 */
public class GraphqlBeanMapper {

    public static Event mapToGraphql(Event original) {
        var result = new Event();

        result.setId(original.getId());
        result.setPrimaryEventGroup_Id(original.getPrimaryEventGroup_Id());
        result.setOrganizationId(original.getOrganizationId());
        result.setVenueId(original.getVenueId());
        result.setSeriesId(original.getSeriesId());
        result.setDate(original.getDate());
        result.setModified_since(original.getModified_since());
        result.setStatus(original.getStatus());
        result.setExtended(original.getExtended());
        result.setLimited(original.getLimited());

        return result;
    }

    public static Venue mapToGraphql(Venue original) {
        var result = new Venue();

        result.setId(original.getId());
        result.setOrganizer_id(original.getOrganizer_id());
        result.setJson(original.getJson());

        return result;
    }

    public static Organizer mapToGraphql(Organizer original){
        var result = new Organizer();

        result.setId(original.getId());
        result.setJson(original.getJson());

        return result;
    }

    public static EventGroup mapToGraphql(EventGroup original){
        var result = new EventGroup();

        result.setId(original.getId());
        result.setOrganizer_id(original.getOrganizer_id());
        result.setModified_since(original.getModified_since());
        result.setExtended(original.getExtended());
        result.setLimited(original.getLimited());

        return result;
    }


}
