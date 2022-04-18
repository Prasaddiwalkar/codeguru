package my.phonepe.cab.management.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import my.phonepe.cab.management.entity.Trip;
import my.phonepe.cab.management.exceptions.RecordNotFoundException;
import my.phonepe.cab.management.services.TripService;

@RestController
@RequestMapping(value = "/trip")
public class TripController {

    @Autowired
    TripService tripService;

    @ExceptionHandler(RecordNotFoundException.class)
    @PutMapping(value = "/start", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public Trip startTrip(@RequestBody Trip trip) {
        return tripService.startTrip(trip, "ONTRIP");
    }

    @ExceptionHandler(RecordNotFoundException.class)
    @PatchMapping(value = "/end", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public Trip endTrip(@RequestBody Trip trip) {
        return tripService.endTrip(trip, "IDLE");
    }
}
