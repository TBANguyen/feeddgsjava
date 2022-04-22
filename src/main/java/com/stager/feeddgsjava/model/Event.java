package com.stager.feeddgsjava.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.ZonedDateTime;
import java.util.Date;
import java.util.UUID;

@Entity(name = "feed_event")
//@Table(name = "feed_event")
public class Event {

    @Id
    @Column(name= "id")
    private Integer id;

    @Column(name = "primaryEventGroup_id")
    private Integer primaryEventGroup_id;

    @Column(name = "organizer_id")
    private Integer organizer_id;

    @Column(name = "venue_id")
    private Integer venue_id;

    @Column(name = "series_id")
    private Integer series_id;

    @Column(name = "date")
    private ZonedDateTime date;

    @Column(name = "modified_since")
    private ZonedDateTime modified_since;

    @Column(name = "status")
    private String status;

    @Column(name = "extended")
    private String extended;


    @Column(name = "limited")
    private String limited;


    public Integer getId() {return id;}

    public void setId(Integer id) {this.id = id;}

    public Integer getPrimaryEventGroup_Id() {
        return primaryEventGroup_id;
    }

    public void setPrimaryEventGroup_Id(Integer primaryEventGroup_Id) {
        this.primaryEventGroup_id = primaryEventGroup_Id;
    }

    public Integer getOrganizationId() {
        return organizer_id;
    }

    public void setOrganizationId(Integer organizer_id) {
        this.organizer_id = organizer_id;
    }

    public Integer getVenueId() {
        return venue_id;
    }

    public void setVenueId(Integer venue_id) {
        this.venue_id = venue_id;
    }
//
    public Integer getSeriesId() {
        return series_id;
    }

    public void setSeriesId(Integer series_id) {
        this.series_id = series_id;
    }

    public ZonedDateTime getDate() {
        return date;
    }

    public void setDate(ZonedDateTime date) {this.date = date;}

    public ZonedDateTime getModified_since() {return modified_since;}

    public void setModified_since(ZonedDateTime modified_since) {this.modified_since = modified_since;}

    public String getStatus() {return status;}

    public void setStatus(String status) {this.status = status;}

    public String getExtended() {return extended;}

    public void setExtended(String extended) {this.extended = extended;}

    public String getLimited() {return limited;}

    public void setLimited(String limited) {this.limited = limited;}






//    public Event(Integer id, Integer primaryEventGroup_id, Integer organizer_id, Integer venue_id, Integer series_id, Date date, ZonedDateTime modified_since, String status, String extended, String limited) {
//        this.id = id;
//        this.primaryEventGroup_id = primaryEventGroup_id;
//        this.organizer_id = organizer_id;
//        this.venue_id = venue_id;
//        this.series_id = series_id;
//        this.date = date;
//        this.modified_since = modified_since;
////        this.status = status;
//        this.extended = extended;
//        this.limited = limited;
//    }
//
//    public Integer geteventid(){
//        return id;
//    }







//    private ZonedDateTime createdAt;
//    private ZonedDateTime modifiedAt;
//    private ZonedDateTime doorsOpen;
//    private ZonedDateTime end;
//    private String name;
//    private ZonedDateTime programStart;
//    private ZonedDateTime start;
//    private int uniqueId;
//
//    private long eventTypeId;
//
//    private String projectTypeCode;
//    private String projectTypeName;


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

