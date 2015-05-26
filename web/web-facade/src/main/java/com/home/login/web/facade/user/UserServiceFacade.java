package com.home.login.web.facade.user;

import com.home.login.service.user.dto.UserDto;
import com.home.login.web.facade.user.model.UserFacadeModel;

import javax.annotation.Nonnull;

/**
 * Created: Nadya Dainelyan
 * DATE:    5/25/15
 * TIME:    10:15 PM
 */
public interface UserServiceFacade {

    /**
     * create user
     *
     * @param userDto
     * @return UserFacadeModel
     */
    @Nonnull
    UserFacadeModel createUser(@Nonnull final UserDto userDto);


    /**
     *
     * get user parameter
     *
     * @param password
     * @param userName
     * @return UserFacadeModel
     */
    @Nonnull
    UserFacadeModel getUserParameterForLogin(@Nonnull String userName, @Nonnull String password) ;
}
