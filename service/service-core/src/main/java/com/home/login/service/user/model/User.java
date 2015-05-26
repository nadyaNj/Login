package com.home.login.service.user.model;

import com.home.login.service.common.AbstractEntityModel;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import java.time.LocalDateTime;

/**
 * Created: Nadya Dainelyan
 * DATE:    5/24/15
 * TIME:    1:44 PM
 */
@Entity
@SequenceGenerator(name = "sequence_generator", sequenceName = "user_seq", initialValue = 1)
@Table(name = "user")
public class User extends AbstractEntityModel {

    private static final long serialVersionUID = -316523679017596419L;


    @Column(name = "userName")
    private String userName;

    @Column(name = "firstName")
    private String firstName;

    @Column(name = "secondName")
    private String secondName;

    @Column(name = "password")
    private String password;

    @Column(name = "birthday")
    private LocalDateTime birthday;

    @Column(name = "gender")
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
        User rhs = (User) obj;
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
