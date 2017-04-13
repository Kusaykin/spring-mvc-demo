package com.dinsoft.springdemo.mvc.validation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by din on 13.04.17.
 */
@Constraint(validatedBy = CourseCodeConsrainValidator.class)
@Target({ ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface CourseCode {

    // define default course code
    public String value() default "LUV";

    // define default error message
    public String message() default "must start with LUV";

   // define default group
    public Class<?>[] groups() default {};


    // define default payloads
    public  Class<? extends Payload>[] payload() default {};

}
