package my.phonepe.cab.management.repository;

import my.phonepe.cab.management.entity.Booking;

import org.springframework.data.repository.CrudRepository;

public interface BookingRepository extends CrudRepository<Booking, Integer> {}
