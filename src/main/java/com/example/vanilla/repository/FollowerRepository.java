package com.example.vanilla.repository;

import com.example.vanilla.embeddable.FollowerId;
import com.example.vanilla.entity.Follower;
import com.example.vanilla.entity.Following;
import com.example.vanilla.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface FollowerRepository extends JpaRepository<Follower, FollowerId> {
    List<Follower> findByUser(User user);
    void deleteByUser_IdAndFollower_Id(String userId, String followerId);
    Optional<Follower> findByUserAndFollower(User user, User follower);

}


