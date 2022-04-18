package my.phonepe.cab.management.services;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import my.phonepe.cab.management.entity.Booking;
import my.phonepe.cab.management.entity.Cab;
import my.phonepe.cab.management.entity.Location;
import my.phonepe.cab.management.repository.BookingRepository;
import my.phonepe.cab.management.repository.CabRepository;
import my.phonepe.cab.management.repository.LocationRepository;

@Service
public class BookingService {
    @Autowired
    BookingRepository bookingRepo;

    @Autowired
    CabRepository cabRepo;

    @Autowired
    LocationRepository locationRepo;

    public Booking addBooking(String fromLocation, String toLocation, LocalDateTime bookingDateTime) {

        // get all available/IDLE cars from pick_up_location
        // calculate IDLE time for any CAB for pick_up_location
        // select randomly from list.

        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date();

        List<Location> currentLocation = locationRepo.findByCityAndActive(fromLocation, "Y");

        Cab cab = getMostIdelCab(currentLocation.get(0));
        Booking booking = new Booking();
        if (cab != null) {
            booking.setCab_id(cab);
        }

        List<Location> destinationLocation = locationRepo.findByCityAndActive(toLocation, "Y");

        booking.setPick_up_location_id(currentLocation.get(0));
        booking.setDest_location_id(destinationLocation.get(0));
        // get list of cabs having highest idle time
        return bookingRepo.save(booking);

    }

    private Cab getMostIdelCab(Location fromLocation) {

        List<Cab> idleCabs = cabRepo.findByStateAndSourceLocation("IDLE", fromLocation.location_id, "Y");
        Cab maxIdelcab = null;
        if (idleCabs != null && !idleCabs.isEmpty()) {
            Comparator<Cab> comparator = Comparator.comparing(Cab::getIdlefrom);

            maxIdelcab = idleCabs.stream().max(comparator).get();

            List<Cab> maxIdelcabList = new ArrayList<Cab>();
            for (Cab cab2 : idleCabs) {
                if (cab2.getIdlefrom().compareTo(maxIdelcab.getIdlefrom()) == 0) {
                    maxIdelcabList.add(cab2);
                }
            }

            if (!maxIdelcabList.isEmpty() || maxIdelcabList.size() > 1) {
                Collections.shuffle(maxIdelcabList);
                maxIdelcab = maxIdelcabList.get(0);
            } else if (!maxIdelcabList.isEmpty() || maxIdelcabList.size() == 1) {
                maxIdelcab = maxIdelcabList.get(0);
            } else {
                maxIdelcab = null;
            }
        }

        return maxIdelcab;

    }
}
