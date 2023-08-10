package com.example.vanilla.dto;

public class FollowerDTO {
    private String followerId;
    private String userId;

    @Override
    public String toString() {
        return "FollowerDTO{" +
                "followerId='" + followerId + '\'' +
                ", userId='" + userId + '\'' +
                '}';
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public FollowerDTO(String followerId, String userId) {
        this.followerId = followerId;
        this.userId = userId;
    }

    public String getFollowerId() {
        return followerId;
    }

    public void setFollowerId(String followerId) {
        this.followerId = followerId;
    }
    public FollowerDTO() {
        // Default constructor
    }
    public FollowerDTO(String followerId) {
        this.followerId = followerId;
    }
}

