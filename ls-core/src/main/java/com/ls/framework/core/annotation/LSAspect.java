package com.ls.framework.core.annotation;

import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface LSAspect {
	
	String value();
	
	String cls() default "";
}
