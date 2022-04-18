package my.phonepe.cab.management.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import my.phonepe.cab.management.entity.Cab;

public interface CabRepository extends CrudRepository<Cab, Integer> {

//	@Query("select d from cab where d.state==?1")
//	public List<Cab> getAllIdleCabsByState(String)

	public List<Cab> findByState(String state);

}
