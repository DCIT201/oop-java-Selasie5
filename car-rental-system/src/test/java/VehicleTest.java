import org.example.Car;
import org.example.Vehicle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;



class VehicleTest {

    @Test
    void testVehicleCreation() {
        Vehicle car = new Car("C1", "Toyota Corolla", 100);
        assertEquals("C1", car.getVehicleId());
        assertEquals("Toyota Corolla", car.getModel());
        assertEquals(100, car.getBaseRentalRate());
        assertTrue(car.isAvailable());
    }

    @Test
    void testSetAvailability() {
        Vehicle car = new Car("C1", "Toyota Corolla", 100);
        car.setAvailable(false);
        assertFalse(car.isAvailable());
    }
}
