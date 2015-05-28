package com.home.login.web.admin.ui.pages.user.helper.impl;

import com.home.login.service.user.dto.UserDto;
import com.home.login.web.admin.ui.pages.user.helper.UserPageHelper;
import com.home.login.web.admin.ui.pages.user.model.UserPageModel;
import com.home.login.web.facade.user.UserServiceFacade;
import com.home.login.web.facade.user.model.UserFacadeModel;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created: Nadya Dainelyan
 * DATE:    5/27/15
 * TIME:    10:21 PM
 */
public class UserPageHelperImpl implements UserPageHelper {
    @Autowired
    UserServiceFacade userServiceFacade;

    @Override
    public void createUser(UserPageModel userPageModel) {
        UserDto userDto = new UserDto();

        userDto.setUserName(userPageModel.getUserName());
        userDto.setPassword(userPageModel.getPassword());
        userDto.setFirstName(userPageModel.getFirstName());
        userDto.setSecondName(userPageModel.getSecondName());
        userDto.setBirthday(userPageModel.getBirthday());
        userDto.setGender(userPageModel.getGender());

        userServiceFacade.createUser(userDto);
    }

    @Override
    public UserFacadeModel getLoginUser(String userName, String password) {
        return userServiceFacade.getUserParameterForLogin(userName, password);
    }
}
