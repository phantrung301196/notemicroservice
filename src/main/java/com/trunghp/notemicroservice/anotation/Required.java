package com.trunghp.notemicroservice.anotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import com.trunghp.notemicroservice.anotation.impl.RequiredImpl;

import jakarta.validation.Constraint;

@Target({ ElementType.FIELD, ElementType.PARAMETER })
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Constraint(validatedBy = RequiredImpl.class)
public @interface Required {

}
