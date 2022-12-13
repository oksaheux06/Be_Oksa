package com.investment.indivara.Investment.user.controller;

import com.investment.indivara.Investment.user.entity.User;
import com.investment.indivara.Investment.user.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class UserController {

    @Autowired
    private final UserService userService;

    @PostMapping("/user/create")
    User createData(@RequestBody User user){
        return userService.createUser(user);
    }

    @GetMapping("/user/findbyid/{userId}")
    User findUserById(@PathVariable Long userId){
        return userService.findById(userId);
    }

    @PutMapping("/user/update/{userId}")
    User updateUser(@PathVariable Long userId, @RequestBody User user){
        return userService.updateUser(userId, user);
    }

    @DeleteMapping("/user/deletedata/{userId}")
    String deleteData(@PathVariable Long userId){
        return userService.deleteUser(userId);
    }
}
