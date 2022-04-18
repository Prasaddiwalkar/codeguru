package my.phonepe.cab.management.repository;

import org.springframework.data.repository.CrudRepository;

import my.phonepe.cab.management.entity.Booking;

public interface BookingRepository extends CrudRepository<Booking, Integer> {

}
