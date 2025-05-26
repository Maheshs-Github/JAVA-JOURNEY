import javax.swing.*;
import java.awt.*;

public class BlinkTextThread extends JFrame implements Runnable {
    private JLabel label;
    private boolean visible = true;

    public BlinkTextThread() {
        setTitle("Blinking Text");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
        // setLocationRelativeTo(null);

        label = new JLabel("Blinking Text");
        // label.setFont(new Font("Arial", Font.BOLD, 24));
        // label.setHorizontalAlignment(JLabel.CENTER);
        // label.setHorizontalAlignment(JLabel.CENTER);
        // label.setFont(new Font("Georgia", Font.BOLD, 20));
        // Label1=new JLabel("Text Blinking");
        // Label1.setFont(new Font("Georgia",Font.ITALIC,20));
        // Label1.setHorizontalAlignment(JLabel.CENTER);
        // add(Label1);
        add(label);

        Thread blinkThread = new Thread(this);
        blinkThread.start();
        setVisible(true);
    }

    // @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(500); // Pause for 500 milliseconds
            } catch (Exception e) {
                e.printStackTrace();
            }

            visible =!visible;
            label.setVisible(visible);
            // Label1.setVisible(visible);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            // @Override
            public void run() {
                new BlinkTextThread();
            }
        });
    }
}