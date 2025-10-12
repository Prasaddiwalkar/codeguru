package my.phonepe.cab.management.controller;

import my.phonepe.cab.management.entity.User;
import my.phonepe.cab.management.exceptions.RecordAlreadyExistsException;
import my.phonepe.cab.management.exceptions.RecordNotFoundException;
import my.phonepe.cab.management.services.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Autowired UserService userService;

    @ExceptionHandler(RecordAlreadyExistsException.class)
    @PostMapping(
            value = "/register",
            produces = MediaType.APPLICATION_JSON_VALUE,
            consumes = MediaType.APPLICATION_JSON_VALUE)
    public User registerUser(@RequestBody User user) {
        return userService.addOrUpdate(user);
    }

    @PostMapping(
            value = "/update",
            produces = MediaType.APPLICATION_JSON_VALUE,
            consumes = MediaType.APPLICATION_JSON_VALUE)
    public User updateUser(@RequestBody User user) {
        return userService.addOrUpdate(user);
    }

    @ExceptionHandler(RecordNotFoundException.class)
    @PatchMapping(
            value = "/deactivate",
            produces = MediaType.APPLICATION_JSON_VALUE,
            consumes = MediaType.APPLICATION_JSON_VALUE)
    public User deactivateUser(@RequestBody User user) {
        return userService.addOrUpdate(user);
    }
}
