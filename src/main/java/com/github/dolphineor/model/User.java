package com.github.dolphineor.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created on 2015-12-10.
 *
 * @author dolphineor
 */
@Entity
@Table(name = "TBL_USER", schema = "Kundera_Cassandra@cassandra_pu")
public class User {

    @Id
    private String userId;

    private String name;

    private int gender;

    private int age;

    public User() {
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int isGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
