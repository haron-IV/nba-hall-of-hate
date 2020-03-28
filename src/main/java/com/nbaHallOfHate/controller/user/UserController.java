package com.nbaHallOfHate.controller.user;

import com.nbaHallOfHate.entity.UserEntity;
import com.nbaHallOfHate.repository.UserRepository;
import com.nbaHallOfHate.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/user")
@CrossOrigin()
public class UserController {
    private UserService userService;
    private UserRepository userRepository;

    @Autowired
    public UserController(UserService userService, UserRepository userRepository) {
        this.userService = userService;
        this.userRepository = userRepository;
    }

    @PostMapping("/add")
    public UserEntity addUser(@RequestBody UserEntity userEntity) throws Exception {
        return userService.addUser(userEntity);
    }
}
