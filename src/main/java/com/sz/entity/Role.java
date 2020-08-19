package com.sz.entity;

import java.util.List;

public class Role {

    private int id;
    private String name;
    private List<User> user;

    @Override
    public String toString() {
        return "Role{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", user=" + user +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<User> getUser() {
        return user;
    }

    public void setUser(List<User> user) {
        this.user = user;
    }

    public Role() {
    }

    public Role(int id, String name, List<User> user) {
        this.id = id;
        this.name = name;
        this.user = user;
    }
}
