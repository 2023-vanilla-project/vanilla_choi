package com.example.vanilla.service;

import com.example.vanilla.dto.FollowerDTO;
import com.example.vanilla.embeddable.FollowerId;
import com.example.vanilla.entity.Follower;
import com.example.vanilla.entity.User;
import com.example.vanilla.exception.ResourceNotFoundException;
import com.example.vanilla.repository.FollowerRepository;
import com.example.vanilla.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
@Transactional
public class FollowerService {

    private final FollowerRepository followerRepository;
    private final UserRepository userRepository;

    @Autowired
    public FollowerService(FollowerRepository followerRepository, UserRepository userRepository) {
        this.followerRepository = followerRepository;
        this.userRepository = userRepository;
    }

    public List<User> getFollowers(String userId) {
        User user = userRepository.findById(userId)
                .orElseThrow(() -> new ResourceNotFoundException("User not found with ID: " + userId));

        List<Follower> followerRelations = followerRepository.findByUser(user);

        List<User> followers = new ArrayList<>();
        for (Follower relation : followerRelations) {
            followers.add(relation.getFollower());
        }

        return followers;
    }
}


