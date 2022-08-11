import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

public class LoginPage implements ActionListener {

    HashMap<String,String> loginInfo = new HashMap<String,String>();
    JFrame frame = new JFrame();
    JButton loginBtn = new JButton("Login");
    JButton resetBtn = new JButton("Reset");
    JTextField userIDField = new JTextField();
    JPasswordField passwordField = new JPasswordField();
    JLabel userIDLabel = new JLabel("userID: ");
    JLabel userPasswordLabel = new JLabel("password: ");
    JLabel messageLabel = new JLabel();

    LoginPage(HashMap<String,String> loginInfoOriginal) {

        loginInfo = loginInfoOriginal;

        userIDLabel.setBounds(50,100,75,25);
        userPasswordLabel.setBounds(50,150,75,25);

        messageLabel.setBounds(125,250,250,35);
        messageLabel.setFont(new Font(null,Font.ITALIC,25));

        userIDField.setBounds(125,100,200,25);
        passwordField.setBounds(125,150,200,25);

        loginBtn.setBounds(125,200,100,25);
        loginBtn.setFocusable(false);
        loginBtn.addActionListener(this);

        resetBtn.setBounds(225,200,100,25);
        resetBtn.setFocusable(false);
        resetBtn.addActionListener(this);

        frame.add(userIDLabel);
        frame.add(userPasswordLabel);
        frame.add(messageLabel);
        frame.add(userIDField);
        frame.add(passwordField);
        frame.add(loginBtn);
        frame.add(resetBtn);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,420);
        frame.setLayout(null);
        frame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource() == resetBtn) {
            userIDField.setText("");
            passwordField.setText("");
        }

        if(e.getSource() == loginBtn) {
            String userID = userIDField.getText();
            String password = String.valueOf(passwordField.getPassword());

            if(loginInfo.containsKey(userID)) {
                if(loginInfo.get(userID).equals(password)) {
                    messageLabel.setForeground(Color.green);
                    messageLabel.setText("Login Succesful !");
                    WelcomePage welcomePage = new WelcomePage(userID);
                    frame.dispose();
                }else {
                    messageLabel.setForeground(Color.red);
                    messageLabel.setText("Wrong Password !");
                }
            }
            else {
                messageLabel.setForeground(Color.red);
                messageLabel.setText("Wrong Username !");
            }
        }

    }
}
