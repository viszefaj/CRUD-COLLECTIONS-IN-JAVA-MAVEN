package ENTITIES;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@Documented
public @interface MyAnnoDefault {
    public String status() default "PENDING";
}
