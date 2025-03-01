
abstract class AbsClassM {

    String color;

    abstract double area();
    public abstract String toString();

    public AbsClassM( String color)
    {
        System.out.println("Constructor called");
         this.color = color;
    }


    public String getColor(){
        return color;
    }

}

class Circle extends AbsClassM {

    double radius;

    public Circle(String color, double radius)
    {
        

        super(color);
        this.radius =radius;
        System.out.println("circle constructor called");

    }

    @Override
    double area()
    {
        return Math.PI*Math.pow(radius,2);
    }

    @Override
    public String toString()
    {
        return "circle color "+ super.getColor()+" and area "+ area();
    }
    


}


class Rectangle extends AbsClassM{
    double length;
    double width;

    public Rectangle(String color, double length, double width)
    {
        super(color);
        this.length = length;
        this.width = width;
        System.out.println("Rectangle constructor called");
    }

    @Override
    double area()

    {
        return length*width;
    }
    @Override
    public String toString()
    {
        return "Rectangle color "+super.getColor()+" and area "+ area();
    }

}

public class MMain{

    public static void main(String []args)
    {
        AbsClassM obj1 = new Circle("Red",2);

        System.out.println(obj1.toString());

        AbsClassM obj2 = new Rectangle("Blue",2 ,2);
        System.out.println(obj2.toString());
    }
}