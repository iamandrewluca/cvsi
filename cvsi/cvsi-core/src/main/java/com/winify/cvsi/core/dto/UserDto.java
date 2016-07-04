package com.winify.cvsi.core.dto;

import com.winify.cvsi.core.dto.builder.UserBuilder;
import com.winify.cvsi.core.dto.error.ServerResponseStatus;
import com.winify.cvsi.core.enums.ErrorEnum;
import com.winify.cvsi.db.model.User;

/**
 * Created by Artemie on 25.06.2016.
 */
public class UserDto extends ServerResponseStatus {

    private String userName;
    private String name;
    private String surname;
    private String phone;
    private String email;
    private String password;

    public UserDto() {
    }
    public UserDto(ErrorEnum error, String status, String userName, String name, String surname, String phone, String email, String password) {
        super(error, status);
        this.userName = userName;
        this.name = name;
        this.surname = surname;
        this.phone = phone;
        this.email = email;
        this.password = password;
    }
    public UserDto(ServerResponseStatus serverResponseStatus, String userName, String name, String surname, String phone, String email, String password) {
        super(serverResponseStatus);
        this.userName = userName;
        this.name = name;
        this.surname = surname;
        this.phone = phone;
        this.email = email;
        this.password = password;
    }
    public UserDto(ServerResponseStatus serverResponseStatus, User user) {
        super(serverResponseStatus);
        this.userName = user.getUsername();
        this.name = user.getName();
        this.surname = user.getSurname();
        this.phone = user.getPhone();
        this.email = user.getEmail();
        this.password = user.getPassword();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
