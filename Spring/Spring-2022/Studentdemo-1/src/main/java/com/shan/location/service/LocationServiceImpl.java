package com.shan.location.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shan.location.entities.Location;
import com.shan.location.repo.LocationRepo;


@Service
public class LocationServiceImpl implements LocationService {

	@Autowired
	private LocationRepo repo;
	
	@Override
	public Location addLocation(Location location) {
		return repo.save(location);
		
	}

	@Override
	public Location updateLocation(Location location) {
		Location loc=repo.getById(location.getId());
		return repo.save(loc);
	}

	@Override
	public void deletLocation(int id) {
		Location loc=repo.getById(id);
		System.out.println("found and deleting location: "+loc);
		repo.delete(loc);
	}

	@Override
	public Location getLocationById(Integer id) {
		return repo.getById(id);
	}

	@Override
	public List<Location> getAllLocations() {
		return repo.findAll();
	}

}
