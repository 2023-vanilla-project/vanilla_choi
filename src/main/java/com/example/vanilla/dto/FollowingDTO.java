package com.example.vanilla.dto;

public class FollowingDTO {

    private String followingId;
    private String userId;

    @Override
    public String toString() {
        return "FollowingDTO{" +
                "followingId='" + followingId + '\'' +
                ", userId='" + userId + '\'' +
                '}';
    }
    public FollowingDTO() {
        // Default constructor
    }
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public FollowingDTO(String followingId, String userId) {
        this.followingId = followingId;
        this.userId = userId;
    }

    public String getFollowingId() {
        return followingId;
    }

    public void setFollowingId(String followingId) {
        this.followingId = followingId;
    }

    public FollowingDTO(String followingId) {
        this.followingId = followingId;
    }
}

