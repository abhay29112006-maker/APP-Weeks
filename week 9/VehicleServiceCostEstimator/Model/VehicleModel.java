package Model;

public class VehicleModel {

    private String registrationNumber;
    private String vehicleType;
    private int totalCost;

    public void calculateCost(String regNo, String type,
                              boolean generalService,
                              boolean oilChange,
                              boolean brakeService,
                              boolean batteryCheck) {

        registrationNumber = regNo;
        vehicleType = type;
        totalCost = 0;

        if (generalService) {
            totalCost = totalCost + 1000;
        }

        if (oilChange) {
            totalCost = totalCost + 800;
        }

        if (brakeService) {
            totalCost = totalCost + 1200;
        }

        if (batteryCheck) {
            totalCost = totalCost + 500;
        }
    }

    public int getTotalCost() {
        return totalCost;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public String getVehicleType() {
        return vehicleType;
    }
}