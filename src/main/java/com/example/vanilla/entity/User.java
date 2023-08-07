package com.example.vanilla.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.imageio.ImageIO;
import javax.persistence.*;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.sql.Blob;
import java.util.Date;

@Entity
@Table(name = "user")
public class User {
    @Id
    @Column(length = 36)
    private String id;
    private String password;
    private String name;
    private Date birthday;
    public User(){};
    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", birthday=" + birthday +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public User(String id, String password, String name, Date birthday) {
        this.id = id;
        this.password = password;
        this.name = name;
        this.birthday = birthday;
    }
}
