import javax.swing.*;
import java.awt.*;

public class StudentView extends JFrame {

    JTextField nameField;
    JTextField mark1Field;
    JTextField mark2Field;
    JTextField mark3Field;

    JLabel totalLabel;
    JLabel averageLabel;
    JLabel gradeLabel;

    JButton calculateButton;

    public StudentView() {
        setTitle("Student Grade Calculator");
        setSize(400, 350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(7, 2, 10, 10));

        JLabel nameLabel = new JLabel("Student Name:");
        JLabel mark1Label = new JLabel("Subject 1 Marks:");
        JLabel mark2Label = new JLabel("Subject 2 Marks:");
        JLabel mark3Label = new JLabel("Subject 3 Marks:");

        nameField = new JTextField();
        mark1Field = new JTextField();
        mark2Field = new JTextField();
        mark3Field = new JTextField();

        calculateButton = new JButton("Calculate Result");

        totalLabel = new JLabel("Total: ");
        averageLabel = new JLabel("Average: ");
        gradeLabel = new JLabel("Grade: ");

        add(nameLabel);
        add(nameField);

        add(mark1Label);
        add(mark1Field);

        add(mark2Label);
        add(mark2Field);

        add(mark3Label);
        add(mark3Field);

        add(calculateButton);
        add(new JLabel());

        add(totalLabel);
        add(new JLabel());

        add(averageLabel);
        add(gradeLabel);

        setVisible(true);
    }
}