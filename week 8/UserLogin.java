import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class UserLogin extends JFrame {

    JTextField usernameField;
    JPasswordField passwordField;

    JCheckBox rememberMe;
    JCheckBox notifications;

    JButton loginButton;

    public UserLogin() {

        setTitle("User Login System");
        setSize(450, 300);

        setDefaultCloseOperation(
                JFrame.EXIT_ON_CLOSE);

        setLayout(new GridLayout(4, 2, 10, 10));

        // Username
        JLabel usernameLabel =
                new JLabel("Username:");

        usernameField =
                new JTextField();

        // Password
        JLabel passwordLabel =
                new JLabel("Password:");

        passwordField =
                new JPasswordField();

        // Preferences
        JLabel preferencesLabel =
                new JLabel("Preferences:");

        rememberMe =
                new JCheckBox("Remember Me");

        notifications =
                new JCheckBox("Receive Notifications");

        JPanel preferencePanel =
                new JPanel();

        preferencePanel.add(rememberMe);
        preferencePanel.add(notifications);

        // Login Button
        loginButton =
                new JButton("Login");

        // Add components
        add(usernameLabel);
        add(usernameField);

        add(passwordLabel);
        add(passwordField);

        add(preferencesLabel);
        add(preferencePanel);

        add(loginButton);

        // Login button action
        loginButton.addActionListener(
                new ActionListener() {

                    public void actionPerformed(
                            ActionEvent e) {

                        String username =
                                usernameField.getText();

                        String password =
                                new String(
                                    passwordField.getPassword()
                                );

                        boolean remember =
                                rememberMe.isSelected();

                        boolean notification =
                                notifications.isSelected();

                        String message =
                                "Login Successful!"
                                + "\nUsername: "
                                + username
                                + "\nRemember Me: "
                                + remember
                                + "\nReceive Notifications: "
                                + notification;

                        JOptionPane.showMessageDialog(
                                UserLogin.this,
                                message,
                                "Login Result",
                                JOptionPane.INFORMATION_MESSAGE
                        );
                    }
                }
        );

        setLocationRelativeTo(null);

        setVisible(true);
    }


    public static void main(String[] args) {

        new UserLogin();
    }
}