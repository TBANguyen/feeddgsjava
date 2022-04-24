package com.stager.feeddgsjava.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.ZonedDateTime;

/**
 * JPA annotated class representing a record in the Event table.
 */
@Entity(name = "feed_event")
public class Event {

    @Id
    @Column(name = "id")
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


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPrimaryEventGroup_Id() {
        return primaryEventGroup_id;
    }

    public void setPrimaryEventGroup_Id(Integer primaryEventGroup_Id) {this.primaryEventGroup_id = primaryEventGroup_Id;}

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

    public Integer getSeriesId() {
        return series_id;
    }

    public void setSeriesId(Integer series_id) {
        this.series_id = series_id;
    }

    public ZonedDateTime getDate() {
        return date;
    }

    public void setDate(ZonedDateTime date) {
        this.date = date;
    }

    public ZonedDateTime getModified_since() {
        return modified_since;
    }

    public void setModified_since(ZonedDateTime modified_since) {
        this.modified_since = modified_since;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getExtended() {
        return extended;
    }

    public void setExtended(String extended) {
        this.extended = extended;
    }

    public String getLimited() {
        return limited;
    }

    public void setLimited(String limited) {
        this.limited = limited;
    }

}

