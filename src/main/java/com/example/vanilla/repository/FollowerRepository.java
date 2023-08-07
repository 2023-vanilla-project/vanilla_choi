package com.example.vanilla.repository;

import com.example.vanilla.embeddable.FollowerId;
import com.example.vanilla.entity.Follower;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FollowerRepository extends JpaRepository<Follower, FollowerId> {

    // 팔로워 목록 조회: 특정 사용자를 팔로우하는 모든 사용자 목록을 조회합니다.
    List<Follower> findAllByUserId(String userId);

    // 팔로워 삭제: 특정 사용자를 언팔로우합니다.
    void deleteByUserIdAndFollowerId(String userId, String followerId);
}


