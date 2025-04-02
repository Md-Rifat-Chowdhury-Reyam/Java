import javax.swing.*;
import java.awt.event.*;
import java.awt.*;


public class EventDemo {
    
    JLabel jlab;

    EventDemo()
    {
        JFrame jframe = new  JFrame("Event Swing");
        jframe.setSize(300, 200);
        jframe.setLayout(new FlowLayout());

        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        JButton jbt = new JButton("Click me");
        JButton jbt1 = new JButton("open me");

       
        

        jbt1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                jlab.setText("You clicked the button 2");
            }
        });
        jbt.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                jlab.setText("You clicked the button 1");
            }
        });
       


        jframe.add(jbt);
        jframe.add(jbt1);


        jlab = new JLabel("press a button");

        jframe.add(jlab);

        jframe.setVisible(true);


    }

    public static void main(String[] args) {
        
        SwingUtilities.invokeLater(new Runnable() 
        {
            public void run()
            {
                new EventDemo();
            }
        });
    }
    
}
