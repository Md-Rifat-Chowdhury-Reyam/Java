package Excercise;

abstract class  shape {

    public abstract double cArea();
    public abstract  double cParameter();
}

class Circle extends shape{

    double radius;
    public Circle(double radius)
    {
        this.radius = radius;
    }

    @Override
    public double cArea()
    {
        return Math.PI*radius*radius;
    }
    @Override
    public double cParameter()
    {
        return 2*Math.PI*radius;
    }
}

class TriAngle extends shape{
    
    private double base;
    private double height;
    private double hyperbole;
    public TriAngle(double base, double height, double hyperbole)
    {
        this.base = base;
        this.height = height;
        this.hyperbole = hyperbole;
    }

    @Override
    public double cArea()
    {
        return 0.5*base*height;
    }
    @Override
    public double cParameter()
    {
        return base+height+hyperbole;
    }


} 

public class testM{
    public static void main(String[] args) {
        
        Circle c = new Circle(5);
        System.out.println("Area of Circle: "+ c.cArea());
        System.out.println("Parameter of circle "+c.cParameter());

        TriAngle t = new TriAngle(5, 6, 7);
    System.out.println("Area of Triangle : "+ t.cArea());
System.out.println("Parameter of Triangle :"+ t.cParameter());    }
}