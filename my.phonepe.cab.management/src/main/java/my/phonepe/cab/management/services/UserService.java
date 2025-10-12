package my.phonepe.cab.management.services;

import my.phonepe.cab.management.entity.User;
import my.phonepe.cab.management.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired UserRepository userRepo;

    public User addOrUpdate(User user) {
        return userRepo.save(user);
    }
}
