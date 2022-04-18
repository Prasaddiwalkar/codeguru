package my.phonepe.cab.management.services;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import my.phonepe.cab.management.entity.Cab;
import my.phonepe.cab.management.repository.CabRepository;

@Service
public class CabService {
	@Autowired
	CabRepository cabRepo;

	public void addOrUpdate(Cab cab) {
		cabRepo.save(cab);
	}

	public Set<Cab> getAllIdleCabs() {
		return null;
	}
}
