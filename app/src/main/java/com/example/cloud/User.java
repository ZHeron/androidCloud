package com.example.cloud;

import java.io.Serializable;

public class User implements Serializable {
    private String uname;
    private int age;

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int add(int a,int b){
        return a+b;
    }
}
