package com.hua.springboot.controller;


import com.hua.springboot.entity.User;
import com.hua.springboot.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @Autowired
    UserRepository userRepository;



    @GetMapping("/user/{id}")
    public User getUser(@PathVariable("id") Integer id){
        return userRepository.getOne(id);

    }




    @PostMapping("/user")
    public User addUser(@RequestBody User user){
        return userRepository.save(user);
    }
}
