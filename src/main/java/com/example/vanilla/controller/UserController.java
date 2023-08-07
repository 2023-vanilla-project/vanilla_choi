package com.example.vanilla.controller;

import com.example.vanilla.dto.UserDTO;
import com.example.vanilla.entity.User;
import com.example.vanilla.exception.ResourceNotFoundException;
import com.example.vanilla.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/users")
public class UserController {
    @GetMapping("/{id}")
    public ResponseEntity<User> getUserById(@PathVariable String id) {
        Optional<User> userOptional = userService.getUserById(id);
        if (userOptional.isPresent()) {
            User user = userOptional.get();
            return new ResponseEntity<>(user, HttpStatus.OK);
        } else {
            throw new ResourceNotFoundException("User not found with ID: " + id);
        }
    }
    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public ResponseEntity<User> createUser(@RequestBody UserDTO userDTO) {
        User createdUser = userService.createUser(userDTO);
        return new ResponseEntity<>(createdUser, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<User>> getAllUsers() {
        List<User> users = userService.getAllUsers();
        return new ResponseEntity<>(users, HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<User> updateUser(@PathVariable String id, @RequestBody UserDTO userDTO) {
        User updatedUser = userService.updateUser(id, userDTO);
        return new ResponseEntity<>(updatedUser, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteUserById(@PathVariable String id) {
        userService.deleteUserById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }


//    @GetMapping("/api/users")
//    public List<User> getUsers() {
//        // 사용자 정보를 가져오는 로직
//        List<User> users = UserService.getUsers();
//        return users;
//    }
//    private final UserService userService;
//
//    public UserController(UserService userService) {
//        this.userService = userService;
//    }
//
//    @GetMapping("querymethod")
//    public void queryMethodPage() {}
//
//    @GetMapping("/regist")
//    public void registPage() {}
//
//    @PostMapping("/regist")
//    public String registUser(UserDTO user) {
//
//        userService.registNewUser(user);
//
//        return "redirect:/User/list";
//
//    }
//
//    @GetMapping("/modify")
//    public void modifyPage() {}
//
//    @PostMapping("/modify")
//    public String modifyUser(UserDTO user) {
//
//        userService.modifyUser(user);
//
//        return "redirect:/user/" + user.getId();
//    }
//
//    @GetMapping("/delete")
//    public void deletePage() {}
//
//    @PostMapping("/delete")
//    public String deleteUser(@RequestParam String id) {
//
//        userService.deleteUser(id);
//
//        return "redirect:/user/";
//    }
}
