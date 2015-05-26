package com.home.login.web.facade.user.annotation;

import org.springframework.stereotype.Component;

import java.lang.annotation.*;

/**
 * Created: Nadya Dainelyan
 * DATE:    5/25/15
 * TIME:    11:34 PM
 */

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Component
public @interface Facade {
}
