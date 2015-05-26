package com.home.login.persistence.repository.user.impl;

import com.home.login.persistence.repository.user.UserCustomRepository;
import com.home.login.service.user.model.User;
import org.springframework.util.Assert;

import javax.annotation.Nonnull;

/**
 * Created: Nadya Dainelyan
 * DATE:    5/24/15
 * TIME:    11:25 PM
 */
public class UserRepositoryImpl implements UserCustomRepository {
    @Nonnull
    @Override
    public User getUserForLogin(@Nonnull String userName, @Nonnull String password) {
        User user = new User();

        //Assert method parameters
        Assert.notNull(userName, "Username should not be null");
        Assert.notNull(password, "Password should not be null");

        //Create Query


        return user;
    }
}
