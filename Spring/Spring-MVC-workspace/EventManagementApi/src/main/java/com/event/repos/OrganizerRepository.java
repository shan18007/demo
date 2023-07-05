package com.event.repos;


import org.springframework.data.repository.PagingAndSortingRepository;

import com.event.entities.Organizer;

public interface OrganizerRepository extends PagingAndSortingRepository<Organizer, Long> {

}
