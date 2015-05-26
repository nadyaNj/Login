package com.home.login.service.user.dto;

import com.home.login.service.common.dto.AbstractEntityDto;
import com.home.login.service.user.model.User;

import java.time.LocalDateTime;

/**
 * Created: Nadya Dainelyan
 * DATE:    5/24/15
 * TIME:    1:44 PM
 */
public class UserDto extends AbstractEntityDto<User> {

    private static final long serialVersionUID = -3422895768936406343L;

    /* Properties */
    private String userName;

    private String firstName;

    private String secondName;

    private String password;

    private LocalDateTime birthday;

    private Short gender;


    /* Getter and Setter*/

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public LocalDateTime getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDateTime birthday) {
        this.birthday = birthday;
    }

    public Short getGender() {
        return gender;
    }

    public void setGender(Short gender) {
        this.gender = gender;
    }


    /* update model properties*/

    @Override
    public void updateModelProperties( final  User user) {
        user.setUserName(getUserName());
        user.setFirstName(getFirstName());
        user.setSecondName(getSecondName());
        user.setPassword(getPassword());
        user.setBirthday(getBirthday());
        user.setGender(getGender());
    }
}
