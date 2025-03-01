interface Shape {

    double area();

    
} 

class Circle implements Shape
{
    private double radius;

    public  Circle (double radius)
    {
        this.radius = radius;
    }

    public double area()
    {
        return (Math.PI*radius*radius );  
    }
}


public class Main{
    public static void main(String[] args) 
    {
        Circle c = new Circle(5.0);
        System.out.println("Area of Circle: "+ c.area());
       
    } 
}