package my.phonepe.cab.management.services;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import my.phonepe.cab.management.entity.Trip;
import my.phonepe.cab.management.repository.TripRepository;

@Service
public class TripService {

    @Autowired
    TripRepository tripRepo;

    public void startTrip(Trip trip, String state) {

        trip.setTrip_status("INPROGRESS");

        trip.getBooking_id().getCab_id().setState(state);
//        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date();
        trip.setStart_time(date);
        tripRepo.save(trip);
    }

    public void endTrip(Trip trip, String state) {

        trip.setTrip_status("COMPLETED");

        trip.getBooking_id().getCab_id().setState(state);
        trip.setStart_time(new Date());
        tripRepo.save(trip);
    }

}
