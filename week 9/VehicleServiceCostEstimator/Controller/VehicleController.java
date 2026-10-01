package Controller;

import Model.VehicleModel;
import View.VehicleView;

import java.awt.event.*;

public class VehicleController {

    private VehicleModel model;
    private VehicleView view;

    public VehicleController(VehicleModel model, VehicleView view) {

        this.model = model;
        this.view = view;

        view.calculateButton.addActionListener(
            new ActionListener() {

                public void actionPerformed(ActionEvent e) {
                    calculateCost();
                }
            }
        );
    }

    private void calculateCost() {

        String registrationNumber =
                view.registrationField.getText();

        String vehicleType = "";

        if (view.twoWheelerButton.isSelected()) {
            vehicleType = "Two Wheeler";
        }
        else if (view.carButton.isSelected()) {
            vehicleType = "Car";
        }

        boolean general =
                view.generalService.isSelected();

        boolean oil =
                view.oilChange.isSelected();

        boolean brake =
                view.brakeService.isSelected();

        boolean battery =
                view.batteryCheck.isSelected();

        model.calculateCost(
                registrationNumber,
                vehicleType,
                general,
                oil,
                brake,
                battery
        );

        view.resultLabel.setText(
                "Total Cost: Rs." + model.getTotalCost()
        );
    }
}