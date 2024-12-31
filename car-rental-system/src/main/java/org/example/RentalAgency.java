package org.example;

import java.util.ArrayList;
import java.util.List;

public class RentalAgency {
    private final List<Vehicle> vehicles;

    public RentalAgency() {
        this.vehicles = new ArrayList<>();
    }

    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
    }

    public Vehicle rentVehicle(String vehicleId, Customer customer, int days) {
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getVehicleId().equals(vehicleId) && vehicle.isAvailableForRental()) {
                vehicle.setAvailable(false);
                customer.addRental(vehicle);
                System.out.println("Rented: " + vehicle);
                return vehicle;
            }
        }
        System.out.println("Vehicle not available!");
        return null;
    }

    public void returnVehicle(String vehicleId) {
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getVehicleId().equals(vehicleId)) {
                vehicle.setAvailable(true);
                System.out.println("Vehicle returned: " + vehicle);
            }
        }
    }

    public void showAvailableVehicles() {
        for (Vehicle vehicle : vehicles) {
            if (vehicle.isAvailable()) {
                System.out.println(vehicle);
            }
        }
    }
}
