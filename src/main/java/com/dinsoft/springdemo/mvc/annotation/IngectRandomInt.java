package com.dinsoft.springdemo.mvc.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface IngectRandomInt {
    int min();
    int max();
}
