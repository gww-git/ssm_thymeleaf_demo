package com.sz.entity;



import java.util.List;

//
//@AllArgsConstructor
//@NoArgsConstructor
//@Data
//@Accessors(chain = true)
//@Getter
//@Setter
//@ToString
public class User {

    private int id;
    private String name;
    private Role role;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", role=" + role +
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

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }


    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public User() {
    }
}
