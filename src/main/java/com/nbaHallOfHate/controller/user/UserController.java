package com.nbaHallOfHate.controller.user;

import com.nbaHallOfHate.entity.UserEntity;
import com.nbaHallOfHate.repository.UserRepository;
import com.nbaHallOfHate.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

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

    @PutMapping("/update/{id}/{nickname}")
    public UserEntity updateUsername(@PathVariable String id, @PathVariable String nickname) throws Exception {
        return userService.updateUsername(id, nickname);
    }

    @GetMapping("/check/{id}")
    public Optional<UserEntity> checkIsUserExist(@PathVariable Long id) throws Exception {
        return userRepository.findById(id);
    }

    @GetMapping("/check/nickname/{username}")
    public UserEntity isUsernameExist (@PathVariable String username) throws Exception {
        return userRepository.isUsernameExist(username);
    }
}
