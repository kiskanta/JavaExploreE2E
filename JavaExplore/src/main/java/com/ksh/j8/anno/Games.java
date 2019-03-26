package com.ksh.j8.anno;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
//@Target(ElementType.CONSTRUCTOR)
public @interface Games {
	Game[] value();
}
