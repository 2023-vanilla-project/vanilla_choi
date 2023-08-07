package com.example.vanilla.dto;

public class FollowerDTO {

    private String userId;
    private String followerId;

    @Override
    public String toString() {
        return "FollowerDTO{" +
                "userId='" + userId + '\'' +
                ", followerId='" + followerId + '\'' +
                '}';
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getFollowerId() {
        return followerId;
    }

    public void setFollowerId(String followerId) {
        this.followerId = followerId;
    }

    public FollowerDTO(String userId, String followerId) {
        this.userId = userId;
        this.followerId = followerId;
    }
}

