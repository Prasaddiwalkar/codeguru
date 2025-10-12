package my.phonepe.cab.management.repository;

import my.phonepe.cab.management.entity.Cab;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CabRepository extends CrudRepository<Cab, Integer> {

    public List<Cab> findByState(String state);

    @Query("select d from Cab d where d.state=?1 and d.current_location=?2 and d.active='Y'")
    public List<Cab> findByStateAndSourceLocation(
            String state, Integer current_location, String active);

    //    @Query("select d from Cab d where d.state=?1 and d.current_location=?2 and d.active='Y'")
    //    public List<Cab> findByStateAndSourceLocation(String state, Integer current_location,
    // String active);
}
