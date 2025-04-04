import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;


public class FormWithSwing {

  

    FormWithSwing()
    {

        JFrame jframe = new JFrame("Sign Up Form");
        jframe.setSize(600, 600);
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe.setVisible(true);
        jframe.setLayout(new FlowLayout());


        JLabel jlabelHeading = new JLabel("Sign Up Form", JLabel.CENTER);

        jframe.add(jlabelHeading);

        JLabel jlabelName = new JLabel("Name :", JLabel.CENTER);
        jframe.add(jlabelName);


        
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
