package com.stager.feeddgsjava.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * JPA annotated class representing a record in the Organizer table.
 */
@Entity(name = "feed_organizer")
public class Organizer {

    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "json")
    private String json;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getJson() {
        return json;
    }

    public void setJson(String json) {
        this.json = json;
    }
}
