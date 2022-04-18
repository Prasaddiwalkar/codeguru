package my.phonepe.cab.management.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import my.phonepe.cab.management.entity.Location;
import my.phonepe.cab.management.repository.LocationRepository;

@Service
public class LocationService {
    @Autowired
    LocationRepository locationRepo;

    public Location addOrUpdate(Location location) {
        return locationRepo.save(location);
    }
}
