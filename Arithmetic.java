package OOP.Inheritance;

public class Arithmetic 
{

    
        int a,b;

            public  void sum()
            {
                System.out.println(a + b);
            }

            public void sub()
            {
                System.out.println(a-b);
            }



    
        
 

    public static void main(String[] args)
     {
        
        Arithmetic obj = new Arithmetic();

        obj.a = 10;
        obj.b = 8;

        obj.sum();
        obj.sub();

    }
    
}
