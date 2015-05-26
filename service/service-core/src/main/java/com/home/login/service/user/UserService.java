package com.home.login.service.user;

import com.home.login.service.BaseService;
import com.home.login.service.user.model.User;

import javax.annotation.Nonnull;

/**
 * Created: Nadya Dainelyan
 * DATE:    5/24/15
 * TIME:    1:42 PM
 */
public interface UserService extends BaseService<User> {

    @Nonnull
    User getUserForLogin(@Nonnull String userName, @Nonnull String password);
}
