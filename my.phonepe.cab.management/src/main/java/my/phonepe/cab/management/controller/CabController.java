package my.phonepe.cab.management.controller;

import java.time.LocalDateTime;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import my.phonepe.cab.management.entity.Booking;
import my.phonepe.cab.management.entity.Cab;
import my.phonepe.cab.management.services.BookingService;
import my.phonepe.cab.management.services.CabService;

@RestController
@RequestMapping(value = "/cab")
public class CabController {

    @Autowired
    CabService cabService;

    @Autowired
    BookingService bookingService;

    @PostMapping(value = "/register")
    public void registerCab(@RequestBody Cab cab) {
        cabService.addOrUpdate(cab);
    }

    @PatchMapping(value = "/deactivate", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void deactivateCab(@RequestBody Cab cab) {
        cabService.addOrUpdate(cab);
    }

// add user as input
    @PostMapping(value = "/book", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public Booking bookCab(@RequestParam(name = "from") String fromCity, @RequestParam(name = "to") String toCity,
            @RequestParam(name = "time") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) LocalDateTime tripTime,
            @RequestParam(name = "Mobile Number") Long mobileNumber) {
        return bookingService.addBooking(fromCity, toCity, tripTime, mobileNumber);
    }

    @GetMapping(value = "/idletime")
    public Long idleTime(@RequestParam Cab cab, @RequestParam(name = "fromDate") Date from,
            @RequestParam(name = "to") Date to) {
        return cabService.getTotalIdleTime(cab, from, to);
    }
}
