package my.phonepe.cab.management.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import my.phonepe.cab.management.entity.Booking;
import my.phonepe.cab.management.entity.Cab;
import my.phonepe.cab.management.repository.BookingRepository;
import my.phonepe.cab.management.repository.CabRepository;

@Service
public class BookingService {
	@Autowired
	BookingRepository bookingRepo;

	@Autowired
	CabRepository cabRepo;

	public void addOrUpdate(Booking booking) {

		// get all available/IDLE cars from pick_up_location
		// calculate IDLE time for any CAB for pick_up_location
		// select randomly from list.

		long currentTime = System.nanoTime();

//				long idle_from_time = booking
		List<Cab> idleCabs = cabRepo.findByState("IDLE");
		
//		Duration.between(, null).toMinutes();
		// get list of cabs having highest idle time
		bookingRepo.save(booking);
	}
}
