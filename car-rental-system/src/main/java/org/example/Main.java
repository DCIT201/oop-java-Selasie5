package org.example;

public class Main {
    public static void main(String[] args) {
        RentalAgency rentalAgency = getRentalAgency();

        // Show Available Vehicles
        System.out.println("Available Vehicles:");
        rentalAgency.showAvailableVehicles();

        // Return Vehicle
        rentalAgency.returnVehicle("C1");

        // Show Available Vehicles Again
        System.out.println("Available Vehicles After Return:");
        rentalAgency.showAvailableVehicles();
    }

    private static RentalAgency getRentalAgency() {
        RentalAgency rentalAgency = new RentalAgency();

        // Add Vehicles
        Vehicle car = new Car("C1", "Toyota Corolla", 100);
        Vehicle motorcycle = new Motorcycle("M1", "Yamaha R1", 50);
        Vehicle truck = new Truck("T1", "Ford F-150", 200);

        rentalAgency.addVehicle(car);
        rentalAgency.addVehicle(motorcycle);
        rentalAgency.addVehicle(truck);

        // Add Customers
        Customer customer = new Customer("John Doe", "C123");

        // Rent Vehicle
        rentalAgency.rentVehicle("C1", customer, 5);
        return rentalAgency;
    }
}
