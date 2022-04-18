package my.phonepe.cab.management.repository;

import org.springframework.data.repository.CrudRepository;

import my.phonepe.cab.management.entity.User;

public interface UserRepository extends CrudRepository<User, Integer> {

}
