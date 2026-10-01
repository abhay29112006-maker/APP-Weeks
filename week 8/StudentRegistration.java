import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class StudentRegistration extends JFrame {

    JTextField nameField;
    JTextField registerField;

    JRadioButton maleButton;
    JRadioButton femaleButton;

    JComboBox<String> departmentBox;

    JButton submitButton;

    public StudentRegistration() {

        setTitle("Student Registration System");
        setSize(450, 350);

        setDefaultCloseOperation(
                JFrame.EXIT_ON_CLOSE);

        setLayout(new GridLayout(5, 2, 10, 10));

        // Student Name
        JLabel nameLabel =
                new JLabel("Student Name:");

        nameField =
                new JTextField();

        // Register Number
        JLabel registerLabel =
                new JLabel("Register Number:");

        registerField =
                new JTextField();

        // Gender
        JLabel genderLabel =
                new JLabel("Gender:");

        maleButton =
                new JRadioButton("Male");

        femaleButton =
                new JRadioButton("Female");

        ButtonGroup genderGroup =
                new ButtonGroup();

        genderGroup.add(maleButton);
        genderGroup.add(femaleButton);

        JPanel genderPanel =
                new JPanel();

        genderPanel.add(maleButton);
        genderPanel.add(femaleButton);

        // Department
        JLabel departmentLabel =
                new JLabel("Department:");

        String departments[] = {
            "CSE",
            "ECE",
            "EEE",
            "Mechanical",
            "Civil"
        };

        departmentBox =
                new JComboBox<>(departments);

        // Submit Button
        submitButton =
                new JButton("Submit");

        // Add components
        add(nameLabel);
        add(nameField);

        add(registerLabel);
        add(registerField);

        add(genderLabel);
        add(genderPanel);

        add(departmentLabel);
        add(departmentBox);

        add(submitButton);

        // Button action
        submitButton.addActionListener(
                new ActionListener() {

                    public void actionPerformed(
                            ActionEvent e) {

                        String name =
                                nameField.getText();

                        String registerNumber =
                                registerField.getText();

                        String gender = "";

                        if (maleButton.isSelected()) {
                            gender = "Male";
                        }
                        else if (femaleButton.isSelected()) {
                            gender = "Female";
                        }

                        String department =
                                (String) departmentBox
                                .getSelectedItem();

                        String message =
                                "Student Name: " + name
                                + "\nRegister Number: "
                                + registerNumber
                                + "\nGender: " + gender
                                + "\nDepartment: "
                                + department;

                        JOptionPane.showMessageDialog(
                                StudentRegistration.this,
                                message,
                                "Registration Details",
                                JOptionPane.INFORMATION_MESSAGE
                        );
                    }
                }
        );

        setLocationRelativeTo(null);

        setVisible(true);
    }


    public static void main(String[] args) {

        new StudentRegistration();
    }
}