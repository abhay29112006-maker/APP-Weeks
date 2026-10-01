package Controller;

import Model.EmployeeModel;
import View.EmployeeView;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class EmployeeController {

    private EmployeeModel model;
    private EmployeeView view;

    public EmployeeController(EmployeeModel model,
                              EmployeeView view) {

        this.model = model;
        this.view = view;

        // Login Button
        view.loginButton.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                login();
            }
        });
    }

    private void login() {

        String username =
                view.usernameField.getText();

        String password =
                new String(view.passwordField.getPassword());

        boolean valid =
                model.validateLogin(username, password);

        if (valid) {

            JOptionPane.showMessageDialog(
                    view.loginFrame,
                    "Login Successful!"
            );

            view.loginFrame.dispose();

            view.createMainWindow();

            addMainWindowListeners();

        } else {

            JOptionPane.showMessageDialog(
                    view.loginFrame,
                    "Invalid Username or Password"
            );
        }
    }

    private void addMainWindowListeners() {

        // Add Employee
        view.addEmployeeItem.addActionListener(
                new ActionListener() {

                    public void actionPerformed(ActionEvent e) {
                        addEmployee();
                    }
                }
        );

        // View Employee
        view.viewEmployeeItem.addActionListener(
                new ActionListener() {

                    public void actionPerformed(ActionEvent e) {
                        viewEmployee();
                    }
                }
        );

        // Change Password
        view.changePasswordItem.addActionListener(
                new ActionListener() {

                    public void actionPerformed(ActionEvent e) {
                        changePassword();
                    }
                }
        );

        // Logout
        view.logoutItem.addActionListener(
                new ActionListener() {

                    public void actionPerformed(ActionEvent e) {

                        view.mainFrame.dispose();

                        view.createLoginWindow();
                    }
                }
        );

        // Exit Application
        view.exitItem.addActionListener(
                new ActionListener() {

                    public void actionPerformed(ActionEvent e) {

                        System.exit(0);
                    }
                }
        );
    }

    private void addEmployee() {

        JFrame frame = new JFrame("Add Employee");

        frame.setSize(400, 250);

        frame.setLayout(new GridLayout(4, 2, 10, 10));

        JLabel idLabel =
                new JLabel("Employee ID:");

        JLabel nameLabel =
                new JLabel("Employee Name:");

        JLabel departmentLabel =
                new JLabel("Department:");

        JTextField idField =
                new JTextField();

        JTextField nameField =
                new JTextField();

        JTextField departmentField =
                new JTextField();

        JButton addButton =
                new JButton("Add Employee");

        frame.add(idLabel);
        frame.add(idField);

        frame.add(nameLabel);
        frame.add(nameField);

        frame.add(departmentLabel);
        frame.add(departmentField);

        frame.add(addButton);

        addButton.addActionListener(
                new ActionListener() {

                    public void actionPerformed(ActionEvent e) {

                        JOptionPane.showMessageDialog(
                                frame,
                                "Employee Added Successfully!"
                        );

                        frame.dispose();
                    }
                }
        );

        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    private void viewEmployee() {

        JOptionPane.showMessageDialog(
                view.mainFrame,
                "Employee details can be viewed here."
        );
    }

    private void changePassword() {

        JFrame frame =
                new JFrame("Change Password");

        frame.setSize(400, 250);

        frame.setLayout(
                new GridLayout(4, 2, 10, 10)
        );

        JLabel oldLabel =
                new JLabel("Old Password:");

        JLabel newLabel =
                new JLabel("New Password:");

        JLabel confirmLabel =
                new JLabel("Confirm Password:");

        JPasswordField oldPassword =
                new JPasswordField();

        JPasswordField newPassword =
                new JPasswordField();

        JPasswordField confirmPassword =
                new JPasswordField();

        JButton changeButton =
                new JButton("Change Password");

        frame.add(oldLabel);
        frame.add(oldPassword);

        frame.add(newLabel);
        frame.add(newPassword);

        frame.add(confirmLabel);
        frame.add(confirmPassword);

        frame.add(changeButton);

        changeButton.addActionListener(
                new ActionListener() {

                    public void actionPerformed(ActionEvent e) {

                        String oldPass =
                                new String(
                                        oldPassword.getPassword()
                                );

                        String newPass =
                                new String(
                                        newPassword.getPassword()
                                );

                        String confirmPass =
                                new String(
                                        confirmPassword.getPassword()
                                );

                        boolean result =
                                model.changePassword(
                                        oldPass,
                                        newPass,
                                        confirmPass
                                );

                        if (!oldPass.equals("admin123")
                                && !result) {

                            JOptionPane.showMessageDialog(
                                    frame,
                                    "Old Password is incorrect"
                            );

                        } else if (!newPass.equals(confirmPass)) {

                            JOptionPane.showMessageDialog(
                                    frame,
                                    "New Password and Confirm Password do not match"
                            );

                        } else if (result) {

                            JOptionPane.showMessageDialog(
                                    frame,
                                    "Password Changed Successfully!"
                            );

                            frame.dispose();
                        }
                    }
                }
        );

        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}