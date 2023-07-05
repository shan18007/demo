package com.shan.location.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shan.location.entities.Location;

public interface LocationRepo extends JpaRepository<Location, Integer> {

}
