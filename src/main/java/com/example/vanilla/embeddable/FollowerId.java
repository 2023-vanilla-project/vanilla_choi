package com.example.vanilla.embeddable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class FollowerId implements Serializable {

    @Column(name = "user_id")
    private String userId;

    @Column(name = "follower_id")
    private String followerId;

    @Override
    public String toString() {
        return "FollowerId{" +
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

    public FollowerId(String userId, String followerId) {
        this.userId = userId;
        this.followerId = followerId;
    }
// 생성자, Getter, Setter 생략
}

