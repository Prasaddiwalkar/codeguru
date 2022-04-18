package my.phonepe.cab.management.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import my.phonepe.cab.management.entity.Location;
import my.phonepe.cab.management.exceptions.RecordAlreadyPresentException;
import my.phonepe.cab.management.exceptions.RecordNotFoundException;
import my.phonepe.cab.management.services.LocationService;

@RestController
@RequestMapping(value = "/location")
public class LocationController {

    @Autowired
    LocationService locationService;

    @ExceptionHandler(RecordAlreadyPresentException.class)
    @PostMapping(value = "/onboard", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public Location addLocation(@RequestBody Location location) {
        return locationService.addOrUpdate(location);
    }

    @PutMapping(value = "/update", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public Location updateLocation(@RequestBody Location location) {
        return locationService.addOrUpdate(location);
    }

    @ExceptionHandler(RecordNotFoundException.class)
    @PatchMapping(value = "/deactivate", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public Location deactivateLocation(@RequestBody Location location) {
        return locationService.addOrUpdate(location);
    }
}
