package com.event.repos;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.event.entities.Venue;

public interface VenueRepository extends PagingAndSortingRepository<Venue, Long> {

}
