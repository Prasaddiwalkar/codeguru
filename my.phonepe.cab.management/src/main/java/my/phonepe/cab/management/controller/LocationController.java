package my.phonepe.cab.management.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import my.phonepe.cab.management.entity.Location;
import my.phonepe.cab.management.services.LocationService;

@RestController
@RequestMapping(value = "/location")
public class LocationController {

	@Autowired
	LocationService locationService;

	@PostMapping(value = "/onboard")
	public void addLocation(@RequestBody Location location) {
		locationService.addOrUpdate(location);
	}

	@PostMapping(value = "/update")
	public void updateLocation(@RequestBody Location location) {
		locationService.addOrUpdate(location);
	}

	@PostMapping(value = "/deactivate")
	public void deactivateLocation(@RequestBody Location location) {
		locationService.addOrUpdate(location);
	}
}
