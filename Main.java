package Interface;

import java.awt.*;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

interface Drawing
{
  void draw();
}

class Circle implements Drawing{

    public void draw()
    {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.setVisible(true);
    
        JPanel panel = new JPanel()
        {
            @Override
            protected void paintComponent(Graphics g)
            {
                super.paintComponent(g);
                g.setColor(Color.RED);
                g.fillOval(100, 100, 200, 200);
            }
        };
        frame.add(panel);
    }
   } 

   public class Main
   {
    public static void main(String[] args) {
        
        /**
         * Creates an instance of the Circle class and assigns it to the Drawing interface reference.
         * This demonstrates polymorphism where a Circle object is treated as a Drawing type.
         */
        Drawing circle = new Circle();
        circle.draw();
    }
   }