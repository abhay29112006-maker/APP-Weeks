import Model.EmployeeModel;
import View.EmployeeView;
import Controller.EmployeeController;

public class Main {

    public static void main(String[] args) {

        EmployeeModel model =
                new EmployeeModel();

        EmployeeView view =
                new EmployeeView();

        EmployeeController controller =
                new EmployeeController(model, view);
    }
}