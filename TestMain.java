package Interface;

interface Draw {

    void draw();
        
}
interface Move {

    void move(int x, int y);
    
}
class Circle implements Draw, Move{
    double Pi = 3.14;
    int radius;
    public Circle(int radius)
    {
        this.radius = radius;
    }

    @Override
    public void draw()
    {
        System.out.println("circle is drawn");
    }

    @Override
    public void move(int x, int y)
    {
        System.out.println(" circle is moved to x = " + x + " y = " + y);
    }
    
}

public class TestMain{
    public static void main(String[] args) {
        Circle c = new Circle(5);
        c.move(5, 6);
        c.draw();
    }
}