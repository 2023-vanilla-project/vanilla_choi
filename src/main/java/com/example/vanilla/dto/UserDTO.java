package com.example.vanilla.dto;

import java.sql.Blob;
import java.util.Date;

public class UserDTO {
    private String id;
    private String password;
    private String name;
    private Date birthday;
    public UserDTO(){};

    @Override
    public String toString() {
        return "UserDTO{" +
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

    public UserDTO(String id, String password, String name, Date birthday) {
        this.id = id;
        this.password = password;
        this.name = name;
        this.birthday = birthday;
    }
}
