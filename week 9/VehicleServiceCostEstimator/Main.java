import Model.VehicleModel;
import View.VehicleView;
import Controller.VehicleController;

public class Main {

    public static void main(String[] args) {

        VehicleModel model = new VehicleModel();

        VehicleView view = new VehicleView();

        VehicleController controller =
                new VehicleController(model, view);
    }
}