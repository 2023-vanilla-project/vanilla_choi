package com.example.vanilla.embeddable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class FollowingId implements Serializable {
    @Column(name = "user_id")
    private String userId;
    @Column(name = "following_id")
    private String followingId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FollowingId that = (FollowingId) o;
        return Objects.equals(userId, that.userId) && Objects.equals(followingId, that.followingId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, followingId);
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
}
