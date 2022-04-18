package my.phonepe.cab.management.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import my.phonepe.cab.management.entity.Trip;
import my.phonepe.cab.management.services.TripService;

@RestController
@RequestMapping(value = "/Trip")
public class TripController {

    @Autowired
    TripService tripService;

    @PostMapping(value = "/start")
    public void startTrip(@RequestBody Trip trip) {
        tripService.startTrip(trip, "ONTRIP");
    }

    @PostMapping(value = "/end")
    public void endTrip(@RequestBody Trip trip) {
        tripService.endTrip(trip, "IDLE");
    }
}
