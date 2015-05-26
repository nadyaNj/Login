package com.home.login.persistence.repository.user;

import com.home.login.persistence.repository.AbstractRepository;
import com.home.login.service.user.model.User;
import org.springframework.stereotype.Repository;

/**
 * Created: Nadya Dainelyan
 * DATE:    5/24/15
 * TIME:    1:35 PM
 */

@Repository
public interface UserRepository extends AbstractRepository<User>, UserCustomRepository {
    
}
