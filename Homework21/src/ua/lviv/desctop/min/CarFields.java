package ua.lviv.desctop.min;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface CarFields {

	String value() default "nice car dude!";
}
