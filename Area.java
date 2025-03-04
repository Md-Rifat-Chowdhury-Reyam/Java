public class Area {
    

    private double length;
    private double breadth;


    public Area(double length, double breadth )
    {
        this.length = length;
        this.breadth = breadth;

    }

    public double getArea()
    {
        return length*breadth;
    }

}
