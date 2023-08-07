package com.example.vanilla.entity;

import com.example.vanilla.embeddable.FollowingId;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "following")
public class Following {

    @EmbeddedId
    private FollowingId id;

    public Following() {

    }

    @Override
    public String toString() {
        return "Following{" +
                "id=" + id +
                '}';
    }

    public FollowingId getId() {
        return id;
    }

    public void setId(FollowingId id) {
        this.id = id;
    }

    public Following(FollowingId id) {
        this.id = id;
    }
// 생성자, Getter, Setter 생략
}

