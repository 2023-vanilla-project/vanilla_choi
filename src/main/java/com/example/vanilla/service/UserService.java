package com.example.vanilla.service;

import com.example.vanilla.dto.UserDTO;
import com.example.vanilla.exception.ResourceNotFoundException;
import com.example.vanilla.entity.User;
import com.example.vanilla.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class UserService {
    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User createUser(UserDTO userDTO) {
        User newUser = new User();
        newUser.setId(userDTO.getId());
        newUser.setPassword(userDTO.getPassword());
        newUser.setName(userDTO.getName());
        newUser.setBirthday(userDTO.getBirthday());
        return userRepository.save(newUser);
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public Optional<User> getUserById(String id) {
        return userRepository.findById(id);
    }

    public void deleteUserById(String id) {
        userRepository.deleteById(id);
    }

    public User updateUser(String id, UserDTO userDTO) {
        Optional<User> userOptional = userRepository.findById(id);
        if (userOptional.isPresent()) {
            User user = userOptional.get();
            // 요청 Body에서 넘어온 필드만 업데이트
            if (userDTO.getName() != null) {
                user.setName(userDTO.getName());
            }
            if (userDTO.getBirthday() != null) {
                user.setBirthday(userDTO.getBirthday());
            }
            if (userDTO.getPassword() != null) {
                user.setPassword(userDTO.getPassword());
            }
            return userRepository.save(user);
        } else {
            throw new ResourceNotFoundException("User not found with ID: " + id);
        }
    }
}