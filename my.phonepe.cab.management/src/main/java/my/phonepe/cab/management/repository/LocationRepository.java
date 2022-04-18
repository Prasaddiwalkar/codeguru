package my.phonepe.cab.management.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import my.phonepe.cab.management.entity.Location;

public interface LocationRepository extends CrudRepository<Location, Integer> {

    @Query("select d from Location d where d.state=?1 and d.city=?2 ")
    public List<Location> findByCityAndActive(String state, String city);
}
