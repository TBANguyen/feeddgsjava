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

//    @Column(name = "primaryEventGroup_id")
//    private Integer primaryEventGroupId;
//
//    @Column(name = "organizer_id")
//    private Integer organizationId;
//
//    @Column(name = "venue_id")
//    private Integer venueId;
//
//    @Column(name = "series_id")
//    private Integer seriesId;
//    private ZonedDateTime createdAt;
//    private ZonedDateTime modifiedAt;
//    private ZonedDateTime doorsOpen;
//    private ZonedDateTime end;
//    private String name;
//    private ZonedDateTime programStart;
//    private ZonedDateTime start;
//    private EventStatus status;
//    private int uniqueId;
//
//    private long eventTypeId;
//
//    private String projectTypeCode;
//    private String projectTypeName;


    public Integer getId() {return id;}

    public void setId(Integer id) {this.id = id;}

//    public Integer getPrimaryEventGroupId() {
//        return primaryEventGroupId;
//    }
//
//    public void setPrimaryEventGroupId(Integer primaryEventGroupId) {
//        this.primaryEventGroupId = primaryEventGroupId;
//    }
//
//    public Integer getOrganizationId() {
//        return organizationId;
//    }
//
//    public void setOrganizationId(Integer organizationId) {
//        this.organizationId = organizationId;
//    }
//
//    public Integer getVenueId() {
//        return venueId;
//    }
//
//    public void setVenueId(Integer venueId) {
//        this.venueId = venueId;
//    }
//
//    public Integer getSeriesId() {
//        return seriesId;
//    }
//
//    public void setSeriesId(Integer seriesId) {
//        this.seriesId = seriesId;
//    }

//    public ZonedDateTime getCreatedAt() {return createdAt;}
//
//    public void setCreatedAt(ZonedDateTime createdAt) {this.createdAt = createdAt;}
//
//    public ZonedDateTime getModifiedAt() {
//        return modifiedAt;
//    }
//
//    public void setModifiedAt(ZonedDateTime modifiedAt) {
//        this.modifiedAt = modifiedAt;
//    }
//
//    public ZonedDateTime getDoorsOpen() {
//        return doorsOpen;
//    }
//
//    public void setDoorsOpen(ZonedDateTime doorsOpen) {
//        this.doorsOpen = doorsOpen;
//    }
//
//    public ZonedDateTime getEnd() {
//        return end;
//    }
//
//    public void setEnd(ZonedDateTime end) {
//        this.end = end;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public ZonedDateTime getProgramStart() {
//        return programStart;
//    }
//
//    public void setProgramStart(ZonedDateTime programStart) {
//        this.programStart = programStart;
//    }
//
//    public ZonedDateTime getStart() {
//        return start;
//    }
//
//    public void setStart(ZonedDateTime start) {
//        this.start = start;
//    }
//
//    public EventStatus getStatus() {
//        return status;
//    }
//
//    public void setStatus(EventStatus status) {
//        this.status = status;
//    }
//
//    public String getProjectTypeCode() {
//        return projectTypeCode;
//    }
//
//    public void setProjectTypeCode(String projectTypeCode) {
//        this.projectTypeCode = projectTypeCode;
//    }
//
//    public String getProjectTypeName() {
//        return projectTypeName;
//    }
//
//    public void setProjectTypeName(String projectTypeName) {
//        this.projectTypeName = projectTypeName;
//    }
//
//    public int getUniqueId() {
//        return uniqueId;
//    }
//
//    public void setUniqueId(int uniqueId) {
//        this.uniqueId = uniqueId;
//    }
//
//    public long getEventTypeId() {
//        return eventTypeId;
//    }
//
//    public void setEventTypeId(long eventTypeId) {
//        this.eventTypeId = eventTypeId;
//    }







}

