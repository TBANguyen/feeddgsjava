package com.stager.feeddgsjava.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.ZonedDateTime;
import java.util.UUID;

@Entity(name = "feed_event")
//@Table(name = "feed_event")
public class Event {

    @Id
    @Column(name= "id")
    private Integer id;

    private ZonedDateTime createdAt;
    private ZonedDateTime modifiedAt;
    private ZonedDateTime doorsOpen;
    private ZonedDateTime end;
    private String name;
    private ZonedDateTime programStart;
    private ZonedDateTime start;
    private EventStatus status;
    private int uniqueId;
    private long organizationId;
    private long eventTypeId;
    private long primaryEventGroupId;
    private String projectTypeCode;
    private String projectTypeName;
    private long venueId;
    private Long seriesId;

    public Integer getId() {return id;}

    public void setId(Integer id) {this.id = id;}

    public ZonedDateTime getCreatedAt() {return createdAt;}

    public void setCreatedAt(ZonedDateTime createdAt) {this.createdAt = createdAt;
    }
    public ZonedDateTime getModifiedAt() {
        return modifiedAt;
    }

    public void setModifiedAt(ZonedDateTime modifiedAt) {
        this.modifiedAt = modifiedAt;
    }

    public ZonedDateTime getDoorsOpen() {
        return doorsOpen;
    }

    public void setDoorsOpen(ZonedDateTime doorsOpen) {
        this.doorsOpen = doorsOpen;
    }

    public ZonedDateTime getEnd() {
        return end;
    }

    public void setEnd(ZonedDateTime end) {
        this.end = end;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ZonedDateTime getProgramStart() {
        return programStart;
    }

    public void setProgramStart(ZonedDateTime programStart) {
        this.programStart = programStart;
    }

    public ZonedDateTime getStart() {
        return start;
    }

    public void setStart(ZonedDateTime start) {
        this.start = start;
    }

    public EventStatus getStatus() {
        return status;
    }

    public void setStatus(EventStatus status) {
        this.status = status;
    }

    public String getProjectTypeCode() {
        return projectTypeCode;
    }

    public void setProjectTypeCode(String projectTypeCode) {
        this.projectTypeCode = projectTypeCode;
    }

    public String getProjectTypeName() {
        return projectTypeName;
    }

    public void setProjectTypeName(String projectTypeName) {
        this.projectTypeName = projectTypeName;
    }

    public int getUniqueId() {
        return uniqueId;
    }

    public void setUniqueId(int uniqueId) {
        this.uniqueId = uniqueId;
    }

    public long getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(long organizationId) {
        this.organizationId = organizationId;
    }

    public long getEventTypeId() {
        return eventTypeId;
    }

    public void setEventTypeId(long eventTypeId) {
        this.eventTypeId = eventTypeId;
    }

    public long getPrimaryEventGroupId() {
        return primaryEventGroupId;
    }

    public void setPrimaryEventGroupId(long primaryEventGroupId) {
        this.primaryEventGroupId = primaryEventGroupId;
    }

    public long getVenueId() {
        return venueId;
    }

    public void setVenueId(long venueId) {
        this.venueId = venueId;
    }

    public Long getSeriesId() {
        return seriesId;
    }

    public void setSeriesId(Long seriesId) {
        this.seriesId = seriesId;
    }



}
//    private List<Event>Events;

