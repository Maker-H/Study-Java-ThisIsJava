import java.lang.annotation.*;


@Target({ElementType.METHOD}) //applied to method only
@Retention(RetentionPolicy.RUNTIME)

public @interface In_PrintAnnotation{
    String value() default "-"; //used at dividing line
    int number() default 15;// number of repetitive ouput
	    

}//end of class
