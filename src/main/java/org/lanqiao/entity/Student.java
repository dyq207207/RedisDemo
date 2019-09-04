package org.lanqiao.entity;

import java.io.Serializable;

public class Student implements Serializable {

    private String name;
    private String password;

    public Student(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
