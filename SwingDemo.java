import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

public class SwingDemo
{
    SwingDemo()
    {
        JFrame jframe= new JFrame("Swing App");

        jframe.setSize(300, 300);

        jframe.setDefaultCloseOperation(jframe.EXIT_ON_CLOSE);

        JLabel jlab = new JLabel("Hello I am Rifat Chowdhury", JLabel.CENTER);

        jframe.add(jlab);

        jframe.setVisible(true);

    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            
            public void run()

            {
                new SwingDemo();
            }
        });
    }
}   