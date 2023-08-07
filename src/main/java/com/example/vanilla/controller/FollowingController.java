package com.example.vanilla.controller;

import com.example.vanilla.entity.Following;
import com.example.vanilla.service.FollowingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/following")
public class FollowingController {

    private final FollowingService followingService;

    @Autowired
    public FollowingController(FollowingService followingService) {
        this.followingService = followingService;
    }

    @PostMapping("/{userId}/follow/{followingId}")
    public ResponseEntity<Following> followUser(@PathVariable String userId, @PathVariable String followingId) {
        Following following = followingService.followUser(userId, followingId);
        return new ResponseEntity<>(following, HttpStatus.CREATED);
    }

    @DeleteMapping("/{userId}/unfollow/{followingId}")
    public ResponseEntity<Void> unfollowUser(@PathVariable String userId, @PathVariable String followingId) {
        followingService.unfollowUser(userId, followingId);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
