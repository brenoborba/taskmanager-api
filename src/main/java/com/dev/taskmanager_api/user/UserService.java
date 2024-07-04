package com.dev.taskmanager_api.user;

import com.dev.taskmanager_api.exceptions.ConflictException;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@Transactional
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User createUser(UserRecordDto userRecordDto) {
        Optional<User> existingUser = userRepository.findByEmail(userRecordDto.email());
        if (existingUser.isPresent()) {
            throw new ConflictException("User with email " + userRecordDto.email() + " already exists");
        }

        User user = new User();
        user.setEmail(userRecordDto.email());
        user.setPassword(userRecordDto.password());
        user.setUsername(userRecordDto.username());

        return userRepository.save(user);
    }

}
