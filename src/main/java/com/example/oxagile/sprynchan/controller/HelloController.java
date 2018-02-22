package com.example.oxagile.sprynchan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.oxagile.sprynchan.dao.UserRepository;
import com.example.oxagile.sprynchan.domain.User;

@RestController
@RequestMapping("/api/v1")
public class HelloController {

    private final UserRepository userRepository;

    @Autowired
    public HelloController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @RequestMapping(value = "/users", method = RequestMethod.GET)
    public List<User> get() {
        return userRepository.findAll();
    }

}
