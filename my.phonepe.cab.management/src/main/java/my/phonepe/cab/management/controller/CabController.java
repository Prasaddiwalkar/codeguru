package my.phonepe.cab.management.controller;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import my.phonepe.cab.management.entity.Cab;
import my.phonepe.cab.management.services.CabService;

@RestController
@RequestMapping(value = "/cab")
public class CabController {

	@Autowired
	CabService cabService;

	@PostMapping(value = "/register")
	public void registerCab(@RequestBody Cab cab) {
		cabService.addOrUpdate(cab);
	}

	@PostMapping(value = "/deactivate")
	public void deactivateCab(@RequestBody Cab cab) {
		cabService.addOrUpdate(cab);
	}

	@PostMapping(value = "/book")
	public void bookCab(@RequestParam(name = "from") String fromLocation, @RequestParam(name = "to") String toLocation,
			@RequestParam(name = "time") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) LocalDateTime tripTime) {
		// To, from, vehicle_type
//		cabService.addOrUpdate(cab);
		System.out.println("Coming here");
	}
}
