package my.phonepe.cab.management.repository;

import my.phonepe.cab.management.entity.State;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.Date;
import java.util.List;

public interface StateRepository extends CrudRepository<State, Integer> {

    // and d.start_time>=?2 and d.end_time<=?3
    @Query("select d from State d where d.cab_id<=?1 and d.state=?4")
    public List<State> findStatesForDuration(
            Integer cab_id, Date fromTime, Date toTime, String state);

    @Query(
            "select d from State d where d.cab_id<=?1 "
                    + "(d.start_time<=?2 and d.end_time>=?3) or "
                    + "(d.start_time>=?2 and d.end_time<=?3) or "
                    + "(d.start_time0=?2 and d.end_time<=?3) and d.state=?4")
    public List<State> findStatesForDuration1(
            Integer cab_id, Date fromTime, Date toTime, String state);

    // start time can be - greater than , less than or equal to
    // end time can be greater than less hhan or equel to

    // get all the cabs who start time and end time falls into input duration.

    // (start_time < fromtime and end_time > toTime)
    // (start_time <fromtime and endTime < toTime)
    // ( start_time >fromtime and end_time> toTime)
    // ( start_time >fromtime and end_time <= toTime)

    // d.start_time <

}
