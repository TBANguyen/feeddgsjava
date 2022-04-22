package com.stager.feeddgsjava;

import javax.persistence.Column;
import java.time.ZonedDateTime;
import java.util.Date;

public class EventTest {

    private Integer id;

    private Integer primaryEventGroup_id;

    private Integer organizer_id;

    private Integer venue_id;

    private Integer series_id;

    private String test;

    private String title;

    public EventTest(Integer id, Integer primaryEventGroup_id, Integer organizer_id, Integer venue_id, Integer series_id, String title)
    {
        this.id = id;
        this.primaryEventGroup_id = primaryEventGroup_id;
        this.organizer_id = organizer_id;
        this.venue_id = venue_id;
        this.series_id = series_id;
        this.title = title;

    }

    public Integer getId()
    {
        return id;
    }

    public String getTest()
    {
        return test;
    }

    public String getTitle()
    {
        return title;
    }
}
