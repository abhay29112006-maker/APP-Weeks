package View;

import javax.swing.*;
import java.awt.*;

public class VehicleView extends JFrame {

    public JTextField registrationField;

    public JRadioButton twoWheelerButton;
    public JRadioButton carButton;

    public JCheckBox generalService;
    public JCheckBox oilChange;
    public JCheckBox brakeService;
    public JCheckBox batteryCheck;

    public JButton calculateButton;

    public JLabel resultLabel;

    public VehicleView() {

        setTitle("Vehicle Service Cost Estimator");
        setSize(450, 450);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLayout(new GridLayout(9, 2, 10, 10));

        JLabel registrationLabel =
                new JLabel("Registration Number:");

        registrationField = new JTextField();

        JLabel vehicleLabel =
                new JLabel("Vehicle Type:");

        twoWheelerButton =
                new JRadioButton("Two Wheeler");

        carButton =
                new JRadioButton("Car");

        ButtonGroup group = new ButtonGroup();
        group.add(twoWheelerButton);
        group.add(carButton);

        JPanel vehiclePanel = new JPanel();
        vehiclePanel.add(twoWheelerButton);
        vehiclePanel.add(carButton);

        generalService =
                new JCheckBox("General Service - Rs.1000");

        oilChange =
                new JCheckBox("Oil Change - Rs.800");

        brakeService =
                new JCheckBox("Brake Service - Rs.1200");

        batteryCheck =
                new JCheckBox("Battery Check - Rs.500");

        calculateButton =
                new JButton("Calculate Cost");

        resultLabel =
                new JLabel("Total Cost: Rs.0");

        add(registrationLabel);
        add(registrationField);

        add(vehicleLabel);
        add(vehiclePanel);

        add(generalService);
        add(new JLabel());

        add(oilChange);
        add(new JLabel());

        add(brakeService);
        add(new JLabel());

        add(batteryCheck);
        add(new JLabel());

        add(calculateButton);
        add(new JLabel());

        add(resultLabel);
        add(new JLabel());

        setVisible(true);
    }
}