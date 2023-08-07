package com.example.vanilla.dto;

public class FollowingDTO {

    private String userId;
    private String followingId;

    @Override
    public String toString() {
        return "FollowingDTO{" +
                "userId='" + userId + '\'' +
                ", followingId='" + followingId + '\'' +
                '}';
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getFollowingId() {
        return followingId;
    }

    public void setFollowingId(String followingId) {
        this.followingId = followingId;
    }

    public FollowingDTO(String userId, String followingId) {
        this.userId = userId;
        this.followingId = followingId;
    }
}

