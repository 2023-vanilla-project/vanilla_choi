package com.example.vanilla.repository;

import com.example.vanilla.embeddable.FollowingId;
import com.example.vanilla.entity.Following;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FollowingRepository extends JpaRepository<Following, FollowingId> {

    // 팔로잉 목록 조회: 특정 사용자가 팔로우하는 모든 사용자 목록을 조회합니다.
    List<Following> findAllByUserId(String userId);

    // 팔로잉 삭제: 특정 사용자가 특정 사용자를 언팔로우합니다.
    void deleteByUserIdAndFollowingId(String userId, String followingId);
}
