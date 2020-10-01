package LearningCode0921;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

public class AnnotationDemo {
}
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@interface Myannotation{
    String name() default "";
}