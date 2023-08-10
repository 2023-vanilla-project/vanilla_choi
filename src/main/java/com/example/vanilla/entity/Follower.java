package com.example.vanilla.entity;

import com.example.vanilla.embeddable.FollowerId;
import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;

@Entity
@Table(name = "follower")
public class Follower {

    @EmbeddedId
    private FollowerId id;

    @ManyToOne
    @MapsId("userId")
    @JsonBackReference
    private User user;

    @ManyToOne
    @MapsId("followerId")
    @JsonBackReference
    private User follower;

    public Follower() {

    }

    @Override
    public String toString() {
        return "Follower{" +
                "id=" + id +
                ", user=" + user +
                ", follower=" + follower +
                '}';
    }

    public FollowerId getId() {
        return id;
    }

    public void setId(FollowerId id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public User getFollower() {
        return follower;
    }

    public void setFollower(User follower) {
        this.follower = follower;
    }

    public Follower(FollowerId id, User user, User follower) {
        this.id = id;
        this.user = user;
        this.follower = follower;
    }
}

