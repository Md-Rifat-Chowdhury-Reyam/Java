import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

public class EventDemo
{
    JLabel jlab;
    EventDemo()
    {
       JFrame jfram = new JFrame("Event Demo");
       jfram.setSize(300, 300);
       jfram.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
       jfram.setLayout(new FlowLayout());


       jfram.setVisible(true);
       
       JButton bt1 = new JButton("Muab");
       JButton bt2 = new JButton ("Mahadi");

       bt1.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e){
            jlab.setText("I am Muab");
            
        } 
       });

       bt2.addActionListener( new ActionListener() {
        
        public void actionPerformed(ActionEvent e)
        {
            jlab.setText("I am Mahadi");
        }
       });


       jfram.add(bt1);
       jfram.add(bt2);

       jlab =  new JLabel(" see the name ");
       jfram.add(jlab);
    }


    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run()
            {
                new EventDemo();
            }
        });
    }
}       
