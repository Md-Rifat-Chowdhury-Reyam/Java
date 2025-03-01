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

class Rectangle implements Shape{

      double length;
     double width;

    public Rectangle(double length, double width)
    {
        this.length = length;
        this.width = width;
    }
    public double area(){
        return (length* width);
    }

}


public class M{
    public static void main(String[] args) 
    {
        Circle c = new Circle(5.0);
        System.out.println("Area of Circle: "+ c.area());

        Rectangle r = new Rectangle(5, 6);
     System.out.println(" Rectangle Area: "+ r.area());
       
    } 
}