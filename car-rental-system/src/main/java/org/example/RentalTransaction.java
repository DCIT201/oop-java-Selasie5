package org.example;

public class RentalTransaction {
    public final Customer customer;
    public final Vehicle vehicle;
    private final int rentalDays;
    private final double cost;

    public RentalTransaction(Customer customer, Vehicle vehicle, int rentalDays) {
        this.customer = customer;
        this.vehicle = vehicle;
        this.rentalDays = rentalDays;
        this.cost = vehicle.calculateRentalCost(rentalDays);
    }

    public double getCost() { return cost; }

    @Override
    public String toString() {
        return "RentalTransaction{" +
                "customer=" + customer +
                ", vehicle=" + vehicle +
                ", rentalDays=" + rentalDays +
                ", cost=" + cost +
                '}';
    }
}

