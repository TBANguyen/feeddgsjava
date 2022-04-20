package com.stager.feeddgsjava.util;

import com.stager.feeddgsjava.model.Event;

public class GraphqlBeanMapper {

    public static Event mapToGraphql(Event original) {
        var result = new Event();

        result.setId(original.getId());
        result.setName(original.getName());
        result.setCreatedAt(original.getCreatedAt());
        result.setDoorsOpen(original.getDoorsOpen());
        result.setModifiedAt(original.getModifiedAt());
        result.setEnd(original.getEnd());
        result.setProgramStart(original.getProgramStart());
        result.setStart(original.getStart());
        result.setStatus(original.getStatus());
        result.setProjectTypeCode(original.getProjectTypeCode());
        result.setProjectTypeName(original.getProjectTypeName());
        result.setUniqueId(original.getUniqueId());
        result.setOrganizationId(original.getOrganizationId());
        result.setEventTypeId(original.getEventTypeId());
        result.setPrimaryEventGroupId(original.getPrimaryEventGroupId());
        result.setVenueId(original.getVenueId());
        result.setSeriesId(original.getSeriesId());

        return result;
    }
}
