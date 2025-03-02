package Interface;

public interface Shape {
    double getArea();

}

class  Rectangle implements Shape{

    double length, height;

    public Rectangle (double length, double height)
    {
        this.length = length;
        this.height = height;
    }

    @Override
    public double getArea()
    {
        return length*height;
       
       
    }

}

public class ShapeTest
{
    public static void main(String[] args) {
        Rectangle r = new Rectangle(5, 06);
       
        System.out.println("Area of rectangle is " + r.getArea());
    }
    
}