package my.phonepe.cab.management.repository;

import org.springframework.data.repository.CrudRepository;

import my.phonepe.cab.management.entity.Trip;

public interface TripRepository extends CrudRepository<Trip, Integer> {

}
