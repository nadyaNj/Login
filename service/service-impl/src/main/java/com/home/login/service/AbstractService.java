package com.home.login.service;

import com.home.login.persistence.repository.AbstractRepository;
import com.home.login.service.common.AbstractEntityModel;
import com.home.login.service.common.dto.AbstractEntityDto;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import javax.persistence.EntityNotFoundException;
import java.time.LocalDateTime;

/**
 * Created: Nadya Dainelyan
 * DATE:    5/25/15
 * TIME:    7:09 PM
 */
public abstract class AbstractService<T extends AbstractEntityModel> implements BaseService<T> {

    @Nullable
    @Override
    public T getById(@Nonnull final Long id) {
        return getRepository().findOne(id);
    }

    @Nonnull
    @Override
    public T createEntity(@Nonnull final T entity) {
        entity.setCreated(LocalDateTime.now());
        entity.setUpdated(LocalDateTime.now());
        return getRepository().save(entity);
    }

    @Transactional(propagation = Propagation.REQUIRES_NEW, rollbackFor = Exception.class)
    @Nonnull
    @Override
    public T updateEntity(@Nonnull final Long id, @Nonnull final AbstractEntityDto<T> dto) throws EntityNotFoundException{
        final T entity = getRepository().findOne(id);

        if (entity == null) {
            throw new EntityNotFoundException("Entity not found");
        }

        dto.updateModelProperties(entity);
        entity.setUpdated(LocalDateTime.now());

        return entity;
    }

    /*Abstract methods*/
    @Nonnull
    protected abstract AbstractRepository<T> getRepository();
}
