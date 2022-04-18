package my.phonepe.cab.management.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import my.phonepe.cab.management.entity.Trip;
import my.phonepe.cab.management.repository.TripRepository;

@Service
public class TripService {

	@Autowired
	TripRepository tripRepo;

	public void addOrUpdate(Trip trip) {
		tripRepo.save(trip);
	}

}
