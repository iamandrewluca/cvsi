package com.winify.cvsi.core.dto;

import com.winify.cvsi.core.dto.error.ServerResponseStatus;

/**
 * Created by Artemie on 22.06.2016.
 */
public class ASimpleDto extends ServerResponseStatus {
    private String firstName;
    private String lastName;
    private int age;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
