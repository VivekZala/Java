public class javadocs {
    public static void main(String ...args) {
        int i;
        @SuppressWarnings("deprecation")

        B b = new B();
    
        b.show();
    }
}
class A
{
    public void display()
    {
        
    }
}

class B extends A
{
    @Override
    public void display()
    {
        
    }
    @Deprecated
    public void show()
    {
        
    }
    
}
