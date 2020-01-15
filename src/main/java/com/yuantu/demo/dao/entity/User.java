package com.yuantu.demo.dao.entity;

public class User {
    private Long id;

    private String name;

    private Integer age;

    private String password;

    private String hobby;

    public User(Long id, String name, Integer age, String password, String hobby) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.password = password;
        this.hobby = hobby;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }
}
