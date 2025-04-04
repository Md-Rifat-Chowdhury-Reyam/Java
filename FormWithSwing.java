import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;


public class FormWithSwing {

  

    FormWithSwing()
    {

        JFrame jframe = new JFrame("Sign Up Form");
        jframe.setSize(600, 300);
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe.setLayout(new FlowLayout());
        jframe.setVisible(true);


        JLabel jlabelHeading = new JLabel("Sign Up Form", JLabel.CENTER);
        jframe.add(jlabelHeading);
        

        JLabel jlabelName = new JLabel("Name :");
        jframe.add(jlabelName);
        JButton JbtName = new JButton(" Name");
        jframe.add(JbtName);

        JLabel jlabAddress = new JLabel("Address :");
        jframe.add(jlabAddress);
        JButton JbtAddreess = new JButton("Address");
        jframe.add(JbtAddreess);

        JbtName.addActionListener(new ActionListener() {
            
            public void actionPerformed(ActionEvent e)
            {
                System.out.println("Name button clicked " + JbtName.getText());
                JbtName.setText("Md Rifat Chowdhury");
            }
        });

        JbtAddreess.addActionListener(new ActionListener() {
            
            public void actionPerformed(ActionEvent e)
            {
            JbtAddreess.setText("Dhaka, Bangladesh"); 
            System.out.println("Address button clicked " + JbtAddreess.getText());
            }
        });

       
        
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable()
        {
            public void run()
            {
                new FormWithSwing();
            }

        });
    }
}
