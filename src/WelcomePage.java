import javax.swing.*;
import java.awt.*;

public class WelcomePage {

    JLabel label = new JLabel();
    JFrame frame = new JFrame();

    WelcomePage(String name) {

        label.setText("Hello " + name);
        label.setBounds(0,0,200,35);
        label.setFont(new Font(null,Font.PLAIN,25));
        frame.add(label);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,420);
        frame.setVisible(true);
    }

}
