package com.example.vanilla.embeddable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class FollowingId implements Serializable {

    @Column(name = "user_id")
    private String userId;

    @Column(name = "following_id")
    private String followingId;

    @Override
    public String toString() {
        return "FollowingId{" +
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

    public FollowingId(String userId, String followingId) {
        this.userId = userId;
        this.followingId = followingId;
    }
// 생성자, Getter, Setter 생략
}
