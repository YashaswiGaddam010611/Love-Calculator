package com.yashaswi.lc.validators;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Documented
@Retention(RUNTIME)
@Target(FIELD)
@Constraint(validatedBy = PhoneValidator.class)
public @interface PhoneNumber {
	String message() default "{phoneValidationErrorMessage}";

	Class<?>[] groups() default {};

	Class<? extends Payload>[] payload() default {};
}
