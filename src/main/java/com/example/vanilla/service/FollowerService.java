package com.example.vanilla.service;

import com.example.vanilla.embeddable.FollowerId;
import com.example.vanilla.entity.Follower;
import com.example.vanilla.repository.FollowerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FollowerService {

    private final FollowerRepository followerRepository;

    @Autowired
    public FollowerService(FollowerRepository followerRepository) {
        this.followerRepository = followerRepository;
    }

    public Follower addFollower(String userId, String followerId) {
        FollowerId followerIdObj = new FollowerId(userId, followerId);
        Follower follower = new Follower();
        follower.setId(followerIdObj);
        return followerRepository.save(follower);
    }

    public void removeFollower(String userId, String followerId) {
        FollowerId followerIdObj = new FollowerId(userId, followerId);
        followerRepository.deleteById(followerIdObj);
    }
}

