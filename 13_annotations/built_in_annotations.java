import java.lang.annotation.*;

public class built_in_annotations {

    int data;
    //@MyAnno(name="Ajay",project="Bank")
    
    
    //@MyAnno(name="Ajay")
    public static void main(String[] args) 
    {
        //@MyAnno(name="Ajay")
        int x;
    }
}

//@Retention(RetentionPolicy.Class)
//@Documented
//@Target(value=ElementType.LOCAL_VARIABLE,ElementType.METHOD)
//Repeatable(MyAnno.class)
@interface MyAnno
{
    String name();
    String project();
    String date() default "today";
    String version() default "13";
            }

//@MyAnno(name="Ajay",project="Bank")