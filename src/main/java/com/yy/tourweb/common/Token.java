package com.yy.tourweb.common;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)  
@Retention(RetentionPolicy.RUNTIME)
public @interface Token {
	boolean needSaveToken() default false;
    boolean needRemoveToken() default false;
}
