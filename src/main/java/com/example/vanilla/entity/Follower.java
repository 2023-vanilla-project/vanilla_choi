package com.example.vanilla.entity;

import com.example.vanilla.embeddable.FollowerId;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "follower")
public class Follower {

    @EmbeddedId
    private FollowerId id;

    public Follower() {

    }

    @Override
    public String toString() {
        return "Follower{" +
                "id=" + id +
                '}';
    }

    public FollowerId getId() {
        return id;
    }

    public void setId(FollowerId id) {
        this.id = id;
    }

    public Follower(FollowerId id) {
        this.id = id;
    }
// 생성자, Getter, Setter 생략
}

