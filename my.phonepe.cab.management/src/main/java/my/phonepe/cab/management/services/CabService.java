package my.phonepe.cab.management.services;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import my.phonepe.cab.management.entity.Cab;
import my.phonepe.cab.management.repository.CabRepository;
import my.phonepe.cab.management.repository.StateRepository;

@Service
public class CabService {
    @Autowired
    CabRepository cabRepo;

    @Autowired
    StateRepository stateRepo;

    public void addOrUpdate(Cab cab) {
        cabRepo.save(cab);
    }

    public Set<Cab> getAllIdleCabs() {
        Set<Cab> allCabs = new HashSet<Cab>();
        cabRepo.findAll().forEach(allCabs::add);
        return allCabs;
    }

    public Cab getCab(Cab cab) {
        return cabRepo.findById(cab.getCab_id()).get();
    }

    public Long getTotalIdleTime(Cab cab, Date from, Date to) {

//        TODO: correct logic for getting IDLE only 

        // 10 to 20 .. 5-15 IDLE
        // 
        
        long idleTime = stateRepo.findStatesForDuration(cab.getCab_id(), from, to, "IDLE").stream()
                .mapToLong(i -> (i.getStart_time().getTime() - i.getEnd_time().getTime())).sum();

        return idleTime;
    }
}
