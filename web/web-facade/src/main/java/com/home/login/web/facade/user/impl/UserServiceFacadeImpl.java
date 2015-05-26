package com.home.login.web.facade.user.impl;

import com.home.login.service.user.UserService;
import com.home.login.service.user.dto.UserDto;
import com.home.login.service.user.model.User;
import com.home.login.web.facade.user.UserServiceFacade;
import com.home.login.web.facade.user.annotation.Facade;
import com.home.login.web.facade.user.model.UserFacadeModel;
import com.home.login.web.facade.util.UniversalConverter;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Nonnull;

/**
 * Created: Nadya Dainelyan
 * DATE:    5/25/15
 * TIME:    10:25 PM
 */

@Facade
public class UserServiceFacadeImpl implements UserServiceFacade {
    @Autowired
    private UserService userService;

    @Autowired
    private UniversalConverter universalConverter;

    @Nonnull
    @Override
    public UserFacadeModel createUser(@Nonnull UserDto userDto) {
        User user = new User();

        userDto.updateModelProperties(user);

        user = userService.createEntity(user);

        return universalConverter.convert(user, UserFacadeModel.class);
    }

    @Nonnull
    @Override
    public UserFacadeModel getUserParameterForLogin(@Nonnull String userName, @Nonnull String password) {

        User user = new User();


        return null;
    }
}
