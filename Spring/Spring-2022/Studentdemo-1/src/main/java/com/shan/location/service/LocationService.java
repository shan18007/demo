package com.shan.location.service;

import java.util.List;

import com.shan.location.entities.Location;

public interface LocationService {

	public Location addLocation(Location location);
	public Location updateLocation(Location location);
	public void deletLocation(int id);
	public Location getLocationById(Integer id);
	public List<Location> getAllLocations();
}
