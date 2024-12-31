package org.example;
import java.util.ArrayList;
import java.util.List;



public class Customer {
    private final String name;
    private final String customerId;
    private final List<Vehicle> rentalHistory;

    public Customer(String name, String customerId) {
        this.name = name;
        this.customerId = customerId;
        this.rentalHistory = new ArrayList<>();
    }

    public void addRental(Vehicle vehicle) {
        rentalHistory.add(vehicle);
    }

    public List<Vehicle> getRentalHistory() {
        return rentalHistory;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", customerId='" + customerId + '\'' +
                ", rentalHistory=" + rentalHistory +
                '}';
    }

    public String getName() {
        return name;
    }

    public String getCustomerId() {
        return customerId;
    }
}
