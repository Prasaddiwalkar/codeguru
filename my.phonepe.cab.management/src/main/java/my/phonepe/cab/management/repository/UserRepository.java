package my.phonepe.cab.management.repository;

import my.phonepe.cab.management.entity.User;

import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {}
