package com.weiboinfo.intermediateCertificationManager.common;

import java.lang.annotation.Retention;  
import java.lang.annotation.RetentionPolicy;


@Retention(RetentionPolicy.RUNTIME)
public @interface Error {
	String msg() default "";
}
