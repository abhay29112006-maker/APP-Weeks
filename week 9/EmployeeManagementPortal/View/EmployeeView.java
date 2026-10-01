package View;

import javax.swing.*;
import java.awt.*;

public class EmployeeView {

    public JFrame loginFrame;
    public JFrame mainFrame;

    public JTextField usernameField;
    public JPasswordField passwordField;

    public JButton loginButton;

    public JMenuItem addEmployeeItem;
    public JMenuItem viewEmployeeItem;
    public JMenuItem changePasswordItem;
    public JMenuItem logoutItem;
    public JMenuItem exitItem;

    public EmployeeView() {
        createLoginWindow();
    }

    public void createLoginWindow() {

        loginFrame = new JFrame("Employee Management Portal");

        loginFrame.setSize(400, 250);
        loginFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        loginFrame.setLayout(new GridLayout(3, 2, 10, 10));

        JLabel usernameLabel = new JLabel("Username:");
        JLabel passwordLabel = new JLabel("Password:");

        usernameField = new JTextField();

        passwordField = new JPasswordField();

        loginButton = new JButton("Login");

        loginFrame.add(usernameLabel);
        loginFrame.add(usernameField);

        loginFrame.add(passwordLabel);
        loginFrame.add(passwordField);

        loginFrame.add(loginButton);

        loginFrame.setLocationRelativeTo(null);
        loginFrame.setVisible(true);
    }

    public void createMainWindow() {

        mainFrame = new JFrame("Employee Management Portal");

        mainFrame.setSize(600, 400);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JMenuBar menuBar = new JMenuBar();

        // Employee Menu
        JMenu employeeMenu = new JMenu("Employee");

        addEmployeeItem = new JMenuItem("Add Employee");
        viewEmployeeItem = new JMenuItem("View Employee");

        employeeMenu.add(addEmployeeItem);
        employeeMenu.add(viewEmployeeItem);

        // Tools Menu
        JMenu toolsMenu = new JMenu("Tools");

        changePasswordItem = new JMenuItem("Change Password");

        toolsMenu.add(changePasswordItem);

        // Exit Menu
        JMenu exitMenu = new JMenu("Exit");

        logoutItem = new JMenuItem("Logout");
        exitItem = new JMenuItem("Exit Application");

        exitMenu.add(logoutItem);
        exitMenu.add(exitItem);

        menuBar.add(employeeMenu);
        menuBar.add(toolsMenu);
        menuBar.add(exitMenu);

        mainFrame.setJMenuBar(menuBar);

        JLabel welcomeLabel =
                new JLabel("Welcome to Employee Management Portal",
                        SwingConstants.CENTER);

        mainFrame.add(welcomeLabel);

        mainFrame.setLocationRelativeTo(null);
        mainFrame.setVisible(true);
    }
}