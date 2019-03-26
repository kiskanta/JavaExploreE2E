package com.ksh.j8.anno;

import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Target;

//@Target(ElementType.CONSTRUCTOR)
@Repeatable(Games.class)
public @interface Game {
	String name();  
	String day(); 
}
