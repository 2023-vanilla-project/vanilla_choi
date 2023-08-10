package com.example.vanilla.embeddable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class FollowerId implements Serializable {
    @Column(name = "user_id")
    private String userId;
    @Column(name = "follower_id")
    private String followerId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FollowerId that = (FollowerId) o;
        return Objects.equals(userId, that.userId) && Objects.equals(followerId, that.followerId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, followerId);
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
}

