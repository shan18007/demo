package com.event.repos;


import org.springframework.data.repository.PagingAndSortingRepository;

import com.event.entities.Participant;

public interface ParticipantRepository extends PagingAndSortingRepository<Participant, Long> {

}
