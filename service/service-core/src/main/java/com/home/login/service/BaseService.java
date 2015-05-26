package com.home.login.service;

import com.home.login.service.common.AbstractEntityModel;
import com.home.login.service.common.dto.AbstractEntityDto;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

/**
 * Created: Nadya Dainelyan
 * DATE:    5/24/15
 * TIME:    8:09 PM
 */
public interface BaseService<T extends AbstractEntityModel> {


    /**
     * get entity by id
     *
     * @param id
     * @return T
     */
    @Nullable
    T getById(@Nonnull Long id);


    /**
     * create entity
     *
     * @param entity
     * @return T
     */
    @Nonnull
    T  createEntity(@Nonnull final T entity);


    /**
     * update entity
     *
     * @param id
     * @param dto
     * @return T
     */
    @Nonnull
    public T updateEntity(@Nonnull final Long id, @Nonnull final AbstractEntityDto<T> dto);

}
