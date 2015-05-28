package com.home.login.persistence.repository;

import com.home.login.service.common.AbstractEntityModel;
import org.springframework.data.repository.CrudRepository;

/**
 * Created: Nadya Dainelyan
 * DATE:    5/25/15
 * TIME:    7:11 PM
 */
public interface AbstractRepository<T extends AbstractEntityModel> extends CrudRepository<T, Long> {
}
