package com.home.login.web.admin.ui.pages.user.model;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * Created: Nadya Dainelyan
 * DATE:    5/27/15
 * TIME:    10:22 PM
 */
public class UserPageModel implements Serializable {

    private static final long serialVersionUID = 2769259891084993812L;

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


    /* Equals and hashcode and toString */

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj.getClass() != getClass()) {
            return false;
        }
        UserPageModel rhs = (UserPageModel) obj;
        return new EqualsBuilder()
                .appendSuper(super.equals(obj))
                .append(this.getUserName(), rhs.getUserName())
                .append(this.getFirstName(), rhs.getFirstName())
                .append(this.getSecondName(), rhs.getSecondName())
                .append(this.getPassword(), rhs.getPassword())
                .append(this.getBirthday(), rhs.getBirthday())
                .append(this.getGender(), rhs.getGender())
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder()
                .appendSuper(super.hashCode())
                .append(getUserName())
                .append(getFirstName())
                .append(getSecondName())
                .append(getPassword())
                .append(getBirthday())
                .append(getGender())
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .appendSuper(super.toString())
                .append("userName", getUserName())
                .append("firstName", getFirstName())
                .append("secondName", getSecondName())
                .append("password", getPassword())
                .append("birthday", getBirthday())
                .append("gender", getGender())
                .toString();
    }
}
