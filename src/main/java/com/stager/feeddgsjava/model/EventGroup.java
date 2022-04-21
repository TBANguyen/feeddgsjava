package com.stager.feeddgsjava.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.ZonedDateTime;
import java.util.Date;

@Entity(name = "feed_eventGroup")
public class EventGroup {

    @Id
    @Column(name= "id")
    private Integer id;

    @Column(name = "organizer_id")
    private Integer organizer_id;

    @Column(name = "modified_since")
    private ZonedDateTime modified_since;

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

    public Integer getOrganizer_id() {
        return organizer_id;
    }

    public void setOrganizer_id(Integer organizer_id) {
        this.organizer_id = organizer_id;
    }

    public ZonedDateTime getModified_since() {
        return modified_since;
    }

    public void setModified_since(ZonedDateTime modified_since) {
        this.modified_since = modified_since;
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
