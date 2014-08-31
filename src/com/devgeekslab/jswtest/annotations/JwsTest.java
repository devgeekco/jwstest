package com.devgeekslab.jswtest.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


/**
 * This annotation will be used to make the 
 * test recognizable by JwsTest unit engine.
 * <p>
 * <b>Settings Available</b>
 *  Set jws_task_timeout in SECONDS default
 * 
 * @author Ankit Singh
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.TYPE, ElementType.METHOD})
public @interface JwsTest {

	long jws_task_timeout() default 100;
}
