import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;

public class CourseManagement extends JFrame {

    JList<String> courseList;

    JTable table;
    DefaultTableModel tableModel;

    JTextField nameField;

    JButton addButton;
    JButton removeButton;

    public CourseManagement() {

        setTitle("Student Course Management System");
        setSize(700, 450);

        setDefaultCloseOperation(
                JFrame.EXIT_ON_CLOSE);

        setLayout(new BorderLayout(10, 10));

        // Available courses
        String[] courses = {
            "Java Programming",
            "Data Structures",
            "Database Management",
            "Computer Networks",
            "Operating Systems"
        };

        courseList = new JList<>(courses);

        courseList.setSelectionMode(
                ListSelectionModel.SINGLE_SELECTION);

        JScrollPane courseScrollPane =
                new JScrollPane(courseList);

        courseScrollPane.setBorder(
                BorderFactory.createTitledBorder(
                        "Available Courses"));

        // Student name
        JPanel inputPanel =
                new JPanel();

        JLabel nameLabel =
                new JLabel("Student Name:");

        nameField =
                new JTextField(15);

        inputPanel.add(nameLabel);
        inputPanel.add(nameField);

        // Buttons
        addButton =
                new JButton("Add Registration");

        removeButton =
                new JButton("Remove Registration");

        inputPanel.add(addButton);
        inputPanel.add(removeButton);

        // Table
        String[] columns = {
            "Student Name",
            "Selected Course",
            "Enrollment Status"
        };

        tableModel =
                new DefaultTableModel(columns, 0);

        table =
                new JTable(tableModel);

        JScrollPane tableScrollPane =
                new JScrollPane(table);

        tableScrollPane.setBorder(
                BorderFactory.createTitledBorder(
                        "Course Registrations"));

        // Add components
        add(courseScrollPane,
                BorderLayout.WEST);

        add(inputPanel,
                BorderLayout.NORTH);

        add(tableScrollPane,
                BorderLayout.CENTER);

        // Add registration
        addButton.addActionListener(
                new ActionListener() {

                    public void actionPerformed(
                            ActionEvent e) {

                        String studentName =
                                nameField.getText();

                        String course =
                                courseList.getSelectedValue();

                        if (studentName.isEmpty()
                                || course == null) {

                            JOptionPane.showMessageDialog(
                                    CourseManagement.this,
                                    "Enter student name "
                                    + "and select a course."
                            );

                        } else {

                            tableModel.addRow(
                                    new Object[]{
                                        studentName,
                                        course,
                                        "Enrolled"
                                    }
                            );

                            nameField.setText("");

                            JOptionPane.showMessageDialog(
                                    CourseManagement.this,
                                    "Course registration added!"
                            );
                        }
                    }
                }
        );

        // Remove registration
        removeButton.addActionListener(
                new ActionListener() {

                    public void actionPerformed(
                            ActionEvent e) {

                        int row =
                                table.getSelectedRow();

                        if (row >= 0) {

                            tableModel.removeRow(row);

                            JOptionPane.showMessageDialog(
                                    CourseManagement.this,
                                    "Registration removed!"
                            );

                        } else {

                            JOptionPane.showMessageDialog(
                                    CourseManagement.this,
                                    "Select a registration "
                                    + "to remove."
                            );
                        }
                    }
                }
        );

        setLocationRelativeTo(null);

        setVisible(true);
    }


    public static void main(String[] args) {

        new CourseManagement();
    }
}