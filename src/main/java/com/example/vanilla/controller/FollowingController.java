package com.example.vanilla.controller;

import com.example.vanilla.dto.FollowerDTO;
import com.example.vanilla.dto.FollowingDTO;
import com.example.vanilla.entity.Following;
import com.example.vanilla.entity.User;
import com.example.vanilla.service.FollowingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/following")
public class FollowingController {
    @PostMapping("/{userId}/add/{followingId}")
    public ResponseEntity<Following> addFollowing(@PathVariable String userId, @PathVariable String followingId, @RequestBody FollowingDTO followingDTO) {
        Following following = followingService.addFollowing(userId, followingId, followingDTO);
        return new ResponseEntity<>(following, HttpStatus.CREATED);
    }
    @GetMapping("/{userId}/followings")
    public ResponseEntity<List<User>> getFollowing(@PathVariable String userId) {
        List<User> followingUsers = followingService.getFollowing(userId);
        return new ResponseEntity<>(followingUsers, HttpStatus.OK);
    }
    @GetMapping("/{userId}/followers")
    public ResponseEntity<List<User>> getFollowers(@PathVariable String userId) {
        List<User> followers = followingService.getFollowers(userId);
        return new ResponseEntity<>(followers, HttpStatus.OK);
    }
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
