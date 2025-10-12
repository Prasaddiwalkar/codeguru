package my.phonepe.cab.management.services;

import my.phonepe.cab.management.entity.Trip;
import my.phonepe.cab.management.repository.TripRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class TripService {

    @Autowired TripRepository tripRepo;

    public Trip startTrip(Trip trip, String state) {

        trip.setTrip_status("INPROGRESS");

        // TODO: Check current status of the cab
        trip.getBooking_id().getCab_id().setState(state);
        Date date = new Date();
        trip.setStart_time(date);
        return tripRepo.save(trip);
    }

    public Trip endTrip(Trip trip, String state) {

        trip.setTrip_status("COMPLETED");

        // TODO: Check current status of the cab
        trip.getBooking_id().getCab_id().setState(state);
        trip.setEnd_time(new Date());
        return tripRepo.save(trip);
    }
}
