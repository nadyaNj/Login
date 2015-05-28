package com.home.login.web.admin.ui.pages.user.helper;

import com.home.login.web.admin.ui.pages.user.model.UserPageModel;
import com.home.login.web.facade.user.model.UserFacadeModel;

/**
 * Created: Nadya Dainelyan
 * DATE:    5/27/15
 * TIME:    10:20 PM
 */
public interface UserPageHelper {
    /**
     * make registration
     *
     * @param userPageModel
     */
    void createUser(UserPageModel userPageModel);

    /**
     * verify login and get his parameters
     *
     * @param userName
     * @param password
     * @return UserFacadeModel
     */
    UserFacadeModel getLoginUser(final String userName, final String password);
}
