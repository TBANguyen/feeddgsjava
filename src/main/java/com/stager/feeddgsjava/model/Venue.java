package com.stager.feeddgsjava.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "feed_venue")
public class Venue {

    @Id
    @Column(name= "id")
    private Integer id;

    @Column(name = "organizer_id")
    private Integer organizer_id;

    @Column(name = "json")
    private String json;

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

    public String getJson() {
        return json;
    }

    public void setJson(String json) {
        this.json = json;
    }



}
