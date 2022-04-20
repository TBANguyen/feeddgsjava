package com.stager.feeddgsjava.repository;


import com.stager.feeddgsjava.model.Event;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;


@Repository
public interface EventRepository extends CrudRepository<Event, Integer> {

    @Query("SELECT DISTINCT e FROM feed_event e")
    List<Event> findAll();

//    @Query(nativeQuery = true, value = "select * from event e "
//            + "where upper(content) like upper(:keyword) "
//            + "or upper(title) like upper(:keyword) "
//            + "or upper(tags) like upper(:keyword)")
//    List<Event> findByKeyword(@Param("keyword") String keyword);


}
