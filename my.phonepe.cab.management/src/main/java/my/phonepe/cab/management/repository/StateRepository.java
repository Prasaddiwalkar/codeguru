package my.phonepe.cab.management.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import my.phonepe.cab.management.entity.State;

public interface StateRepository extends CrudRepository<State, Integer> {

    @Query("select d from State d where d.cab_id=?1 and d.start_time>=?2 and d.end_time<=?3 and d.state=?4")
    public List<State> findStatesForDuration(Integer cab_id, Date fromTime, Date toTime, String state);
}
