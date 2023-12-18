package menu;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import javax.swing.border.*;

public class LogIn {

    public LogIn() {
        UserNameAndPasswords userNameAndPasswords = new UserNameAndPasswords();
        new LoginPage(userNameAndPasswords.getLoginInfo());
    }

}

class UserNameAndPasswords {
    private HashMap<String, String> loginInfo = new HashMap<>();

    UserNameAndPasswords() {
        // Default admin login
        loginInfo.put("admin", "password");
    }

    public HashMap<String, String> getLoginInfo() {
        return loginInfo;
    }

    public void addLoginInfo(String username, String password) {
        loginInfo.put(username, password);
    }
}

class LoginPage implements ActionListener {

    private JFrame frame;
    private JLabel userNameLabel, passwordLabel, messageLabel, backgroundLabel;
    private JTextField userNamefield;
    private JPasswordField passwordField;
    private JButton loginButton;
    private JButton registerButton; // New button for registration
    private JButton resetButton;
    private ImageIcon backgroundImg;

    private HashMap<String, String> loginInfo;

    LoginPage(HashMap<String, String> loginInfoOriginal) {
        this.loginInfo = loginInfoOriginal;

        UIManager.put("Button.font", new Font("Monospaced", Font.BOLD, 17));
        

        backgroundImg = new ImageIcon("C:/Users/playb/OneDrive/Documents/PROJECT_OOP/Ebike/lib/misc/logo.jpg");
        backgroundLabel = new JLabel(backgroundImg);

        frame = new JFrame();
        frame.setLayout(new BorderLayout());

        userNameLabel = new JLabel("User Name:");
        userNameLabel.setFont(new Font("Monospaced", Font.BOLD, 17));
        userNameLabel.setBounds(450, 200, 100, 30);
        userNameLabel.setForeground(new Color(255, 255, 255)); // Brown font color

        userNamefield = new JTextField();
        userNamefield.setBorder(new LineBorder(Color.BLACK, 2));
        userNamefield.setBounds(550, 200, 200, 30);

        passwordLabel = new JLabel("Password: ");
        passwordLabel.setFont((new Font("Monospaced", Font.BOLD, 17)));
        passwordLabel.setBounds(450, 250, 100, 30);
        passwordLabel.setForeground(new Color(255, 255, 255)); // Brown font color

        passwordField = new JPasswordField();
        passwordField.setBorder(new LineBorder(Color.BLACK, 2));
        passwordField.setBounds(550, 250, 200, 30);

        loginButton = new JButton("Login");
        loginButton.setBounds(500, 300, 100, 30);
        loginButton.setBorder(new LineBorder(Color.BLACK, 2));
        loginButton.addActionListener(this);
        loginButton.setBackground(new Color(255, 255, 255)); // Light Brown button color
        loginButton.setForeground(new Color(51, 25, 0)); // Dark Brown font color

        registerButton = new JButton("Register");
        registerButton.setBorder(new LineBorder(Color.BLACK, 2));
        registerButton.setBounds(620, 300, 100, 30);
        registerButton.addActionListener(this);
        registerButton.setBackground(new Color(255, 255, 255)); // Light Brown button color
        registerButton.setForeground(new Color(51, 25, 0)); // Dark Brown font color

        resetButton = new JButton("Reset");
        resetButton.setBorder(new LineBorder(Color.BLACK, 2));
        resetButton.setBounds(558, 350, 100, 30);
        resetButton.addActionListener(this);
        resetButton.setBackground(new Color(255, 255, 255)); // Light Brown button color
        resetButton.setForeground(new Color(51, 25, 0)); // Dark Brown font color

        messageLabel = new JLabel();
        messageLabel.setFont(new Font("SANS_SERIF", Font.BOLD, 15));
        messageLabel.setBounds(530, 130, 200, 50);
        messageLabel.setForeground(new Color(102, 51, 0)); // Red color

        frame.add(userNameLabel);
        frame.add(userNamefield);
        frame.add(passwordLabel);
        frame.add(passwordField);
        frame.add(loginButton);
        frame.add(registerButton);
        frame.add(resetButton);
        frame.add(messageLabel);

        frame.add(backgroundLabel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1200, 660);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == resetButton) {
            userNamefield.setText("");
            passwordField.setText("");
            messageLabel.setText("");
        } else if (e.getSource() == loginButton) {
            performLogin();
        } else if (e.getSource() == registerButton) {
            performRegistration();
        }
    }

    private void performLogin() {
        String userID = userNamefield.getText();
        String password = String.valueOf(passwordField.getPassword());

        if (loginInfo.containsKey(userID)) {
            if (loginInfo.get(userID).equals(password)) {
                messageLabel.setForeground(new Color(102, 51, 0));
                messageLabel.setText("Login successful");
                new Option(); 
                frame.dispose();
            } else {
                messageLabel.setForeground(Color.red);
                messageLabel.setText("Wrong password");
            }
        } else {
            messageLabel.setForeground(Color.red);
            messageLabel.setText("Username not found");
        }
    }

    private void performRegistration() {
        String userID = userNamefield.getText();
        String password = String.valueOf(passwordField.getPassword());

        if (!userID.isEmpty() && !password.isEmpty()) {
            if (!loginInfo.containsKey(userID)) {
                loginInfo.put(userID, password);
                messageLabel.setForeground(new Color(0, 128, 0));
                messageLabel.setText("Registration successful");
            } else {
                messageLabel.setForeground(Color.red);
                messageLabel.setText("Username already exists");
            }
        } else {
            messageLabel.setForeground(Color.red);
            messageLabel.setText("<html>Please enter both<br>username and password</html>");
        }
    }
}