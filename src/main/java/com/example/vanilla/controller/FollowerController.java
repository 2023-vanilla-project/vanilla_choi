package com.example.vanilla.controller;

import com.example.vanilla.entity.Follower;
import com.example.vanilla.service.FollowerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/follower")
public class FollowerController {

    private final FollowerService followerService;

    @Autowired
    public FollowerController(FollowerService followerService) {
        this.followerService = followerService;
    }

    @PostMapping("/{userId}/add/{followerId}")
    public ResponseEntity<Follower> addFollower(@PathVariable String userId, @PathVariable String followerId) {
        Follower follower = followerService.addFollower(userId, followerId);
        return new ResponseEntity<>(follower, HttpStatus.CREATED);
    }

    @DeleteMapping("/{userId}/remove/{followerId}")
    public ResponseEntity<Void> removeFollower(@PathVariable String userId, @PathVariable String followerId) {
        followerService.removeFollower(userId, followerId);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}

