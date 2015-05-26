package com.home.login.web.facade.util;

import org.springframework.core.convert.converter.GenericConverter;

import javax.annotation.Nonnull;
import java.util.List;

/**
 * Created: Nadya Dainelyan
 * DATE:    5/25/15
 * TIME:    9:51 PM
 */
public interface UniversalConverter extends GenericConverter {

    @Nonnull
    <T> List<T> convertList(@Nonnull final List<?> items, @Nonnull final Class<T> clazz);


    @Nonnull
    <T> T convert(@Nonnull final Object o, @Nonnull final Class<T> clazz);

}
