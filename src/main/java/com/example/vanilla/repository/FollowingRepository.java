package com.example.vanilla.repository;

import com.example.vanilla.embeddable.FollowingId;
import com.example.vanilla.entity.Following;
import com.example.vanilla.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface FollowingRepository extends JpaRepository<Following, FollowingId> {
    List<Following> findByUser(User user);

    Optional<Following> findByUserAndFollowing(User user, User following);

    List<Following> findByFollowing(User user);
}
