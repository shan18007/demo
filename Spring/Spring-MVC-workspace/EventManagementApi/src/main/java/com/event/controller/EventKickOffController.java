package com.event.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.event.entities.Event;
import com.event.repos.EventRepository;

@RepositoryRestController
public class EventKickOffController {

	
	@Autowired
	EventRepository eventRepo;
	
	@PostMapping("/events/start/{id}")
	public ResponseEntity startEvent(@PathVariable Long id) {
		Optional<Event> event = eventRepo.findById(id);
		if(event.isEmpty()) {
			throw new ResourceNotFoundException();
		}
		event.get().setStarted(true);
		eventRepo.save(event.get());
		return ResponseEntity.ok(event.get().getName()+ " Event has started");
	}
}
