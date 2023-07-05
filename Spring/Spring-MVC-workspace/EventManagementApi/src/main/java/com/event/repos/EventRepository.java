package com.event.repos;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.event.entities.Event;
import com.event.entities.projections.PartialEventProjection;

//excerptsProjection is used to use the already created projection
//so by default collection of event return by using default projection  
@RepositoryRestResource(excerptProjection = PartialEventProjection.class)
public interface EventRepository extends PagingAndSortingRepository<Event, Long> {

}
