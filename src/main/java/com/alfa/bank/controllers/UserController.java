package com.alfa.bank.controllers;

import com.alfa.bank.models.User;
import com.alfa.bank.services.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@Slf4j
@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserService userService;


   @GetMapping( "/{id}")
    public Optional<User> getUser(@PathVariable long id) {   log.info("getUser called");  return userService.getUserById(id);  }

    @GetMapping("/list")
    public List<User> list() {
        return userService.getAllUsers();
    }

    @PostMapping("/addOrUpdate")
    public void addOrUpdateUser(@RequestBody User user) {
        userService.addOrUpdateUser(user);
    }



}
