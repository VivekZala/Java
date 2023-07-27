//import java.lang.annotation.Annotation;
@MyAnno(name="Ajay",project="Bank")
public class user_defined_annotations {

    //@MyAnno(name="Ajay")
    int data;
    
    //@MyAnno(name="Ajay")
    public static void main(String[] args) 
    {
        //@MyAnno(name="Ajay")
        int x;
    }
    
}

@interface MyAnno
{
    String name();
    String project();
    String date() default "today";
    String version() default "13";
            }
