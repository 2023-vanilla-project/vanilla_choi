package com.example.vanilla.entity;

import com.example.vanilla.embeddable.FollowingId;
import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;

@Entity
@Table(name = "following")
public class Following {
    @EmbeddedId
    private FollowingId id;

    @ManyToOne
    @MapsId("userId")
    @JsonBackReference
    private User user;

    @ManyToOne
    @MapsId("followingId")
    @JsonBackReference
    private User following;

    public Following(User user, User following) {
        this.user = user;
        this.following = following;
        this.id = new FollowingId();
    }

    public Following() {

    }

    @Override
    public String toString() {
        return "Following{" +
                "id=" + id +
                ", user=" + user +
                ", following=" + following +
                '}';
    }

    public FollowingId getId() {
        return id;
    }

    public void setId(FollowingId id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public User getFollowing() {
        return following;
    }

    public void setFollowing(User following) {
        this.following = following;
    }
}

