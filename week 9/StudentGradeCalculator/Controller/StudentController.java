import java.awt.event.*;

public class StudentController {

    private StudentModel model;
    private StudentView view;

    public StudentController(StudentModel model, StudentView view) {
        this.model = model;
        this.view = view;

        view.calculateButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calculateResult();
            }
        });
    }

    private void calculateResult() {
        try {
            String name = view.nameField.getText();

            int mark1 = Integer.parseInt(view.mark1Field.getText());
            int mark2 = Integer.parseInt(view.mark2Field.getText());
            int mark3 = Integer.parseInt(view.mark3Field.getText());

            model.calculateResult(name, mark1, mark2, mark3);

            view.totalLabel.setText("Total: " + model.getTotal());
            view.averageLabel.setText(
                "Average: " + String.format("%.2f", model.getAverage())
            );
            view.gradeLabel.setText("Grade: " + model.getGrade());

        } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(
                view,
                "Please enter valid marks."
            );
        }
    }
}