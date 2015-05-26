package com.home.login.persistence.repository.user;

import com.home.login.service.user.model.User;

import javax.annotation.Nonnull;

/**
 * Created: Nadya Dainelyan
 * DATE:    5/25/15
 * TIME:    7:17 PM
 */
public interface UserCustomRepository {
    @Nonnull
    User getUserForLogin(@Nonnull String userName, @Nonnull String password);
}
