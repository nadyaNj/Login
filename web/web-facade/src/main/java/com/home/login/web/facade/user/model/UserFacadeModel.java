package com.home.login.web.facade.user.model;

import com.home.login.web.facade.AbstractFacadeDtoModel;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.time.LocalDateTime;

/**
 * Created: Nadya Dainelyan
 * DATE:    5/25/15
 * TIME:    10:24 PM
 */
public class UserFacadeModel extends AbstractFacadeDtoModel{

    private static final long serialVersionUID = -6754505876727096334L;

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

    /*Equals, hashcode and toString*/

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
        UserFacadeModel rhs = (UserFacadeModel) obj;
        return new EqualsBuilder()
                .appendSuper(super.equals(obj))
                .append(this.userName, rhs.userName)
                .append(this.firstName, rhs.firstName)
                .append(this.secondName, rhs.secondName)
                .append(this.password, rhs.password)
                .append(this.birthday, rhs.birthday)
                .append(this.gender, rhs.gender)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder()
                .appendSuper(super.hashCode())
                .append(userName)
                .append(firstName)
                .append(secondName)
                .append(password)
                .append(birthday)
                .append(gender)
                .toHashCode();
    }


    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .appendSuper(super.toString())
                .append("userName", userName)
                .append("firstName", firstName)
                .append("secondName", secondName)
                .append("password", password)
                .append("birthday", birthday)
                .append("gender", gender)
                .toString();
    }
}
