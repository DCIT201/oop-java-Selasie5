package org.example;

public abstract class Vehicle {
    private final String vehicleId;
    private final String model;
    private final double baseRentalRate;
    private boolean isAvailable;

    public Vehicle(String vehicleId, String model, double baseRentalRate) {
        this.vehicleId = vehicleId;
        this.model = model;
        this.baseRentalRate = baseRentalRate;
        this.isAvailable = true;
    }

    public String getVehicleId() { return vehicleId; }
    public String getModel() { return model; }
    public double getBaseRentalRate() { return baseRentalRate; }
    public boolean isAvailable() { return isAvailable; }

    public void setAvailable(boolean available) { isAvailable = available; }

    public abstract double calculateRentalCost(int days);
    public abstract boolean isAvailableForRental();

    @Override
    public String toString() {
        return "Vehicle{" +
                "vehicleId='" + vehicleId + '\'' +
                ", model='" + model + '\'' +
                ", baseRentalRate=" + baseRentalRate +
                ", isAvailable=" + isAvailable +
                '}';
    }
}

