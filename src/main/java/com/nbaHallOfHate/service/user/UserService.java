package com.nbaHallOfHate.service.user;

import com.nbaHallOfHate.entity.UserEntity;
import com.nbaHallOfHate.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public UserEntity addUser(UserEntity userEntity) throws Exception{
        return userRepository.save(userEntity);
    }
}
