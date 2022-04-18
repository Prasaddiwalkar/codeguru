package my.phonepe.cab.management.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import my.phonepe.cab.management.entity.User;
import my.phonepe.cab.management.repository.UserRepository;

@Service
public class UserService {

    @Autowired
    UserRepository userRepo;

    public void addOrUpdate(User user) {
        userRepo.save(user);
    }
}
