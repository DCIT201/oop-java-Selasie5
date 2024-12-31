import org.example.Motorcycle;
import org.example.Truck;
import org.example.Car;
import org.example.Vehicle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VehicleInheritanceTest {

    @Test
    void testCarRentalCost() {
        Vehicle car = new Car("C1", "Toyota Corolla", 100);
        assertEquals(500, car.calculateRentalCost(5));
    }

    @Test
    void testMotorcycleRentalCost() {
        Vehicle motorcycle = new Motorcycle("M1", "Yamaha R1", 50);
        assertEquals(200, motorcycle.calculateRentalCost(5)); // 50 * 5 * 0.8
    }

    @Test
    void testTruckRentalCost() {
        Vehicle truck = new Truck("T1", "Ford F-150", 200);
        assertEquals(1500, truck.calculateRentalCost(5)); // 200 * 5 * 1.5
    }
}
