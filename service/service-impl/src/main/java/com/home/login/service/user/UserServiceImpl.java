package com.home.login.service.user;

import com.home.login.persistence.repository.AbstractRepository;
import com.home.login.persistence.repository.user.UserRepository;
import com.home.login.service.AbstractService;
import com.home.login.service.user.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Nonnull;

/**
 * Created: Nadya Dainelyan
 * DATE:    5/25/15
 * TIME:    4:04 PM
 */

@Service
public class UserServiceImpl extends AbstractService<User> implements UserService {

    @Autowired
    private UserRepository userRepository;


    @Nonnull
    @Override
    protected AbstractRepository<User> getRepository() {
        return userRepository;
    }

    @Override
    public User findByUserNamePassword(@Nonnull String userName, @Nonnull String password) {
        return userRepository.findByUserNamePassword(userName, password);
    }
}
