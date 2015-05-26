package com.home.login.persistence.repository;

import com.home.login.service.common.AbstractEntityModel;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created: Nadya Dainelyan
 * DATE:    5/25/15
 * TIME:    7:11 PM
 */
public interface AbstractRepository<T extends AbstractEntityModel> extends JpaRepository<T, Long> {
}
