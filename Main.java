package Interface;

import java.awt.*;

import javax.swing.*;

public interface dMain {

    void draw();
        
} 

class Circle implements dMain{

    public void draw()
    {
        JFrame frame = new JFrame();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 600);
        frame.setVisible(true);

        JPanel panel = new JPanel()
        {
            @Override

            public void paintComponent(Graphics g)
            {
                super.paintComponent(g);
                g.setColor(Color.YELLOW);
                int[] xPoints = {
                    100,
                    100,
                    100
                };
                int[] yPoints = {
                    100,
                    300,
                    300
                };
                g.fillPolygon(xPoints, yPoints, 3);
            }
        };
        frame.add(panel);



    }
}

public class Main {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.draw();
    }
}

