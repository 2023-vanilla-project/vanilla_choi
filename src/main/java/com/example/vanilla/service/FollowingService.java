package com.example.vanilla.service;

import com.example.vanilla.embeddable.FollowingId;
import com.example.vanilla.entity.Following;
import com.example.vanilla.repository.FollowingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FollowingService {

    private final FollowingRepository followingRepository;

    @Autowired
    public FollowingService(FollowingRepository followingRepository) {
        this.followingRepository = followingRepository;
    }

    public Following followUser(String userId, String followingId) {
        FollowingId followingIdObj = new FollowingId(userId, followingId);
        Following following = new Following();
        following.setId(followingIdObj);
        return followingRepository.save(following);
    }

    public void unfollowUser(String userId, String followingId) {
        FollowingId followingIdObj = new FollowingId(userId, followingId);
        followingRepository.deleteById(followingIdObj);
    }
}
