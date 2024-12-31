import org.example.Car;
import org.example.Customer;
import org.example.RentalAgency;
import org.example.Vehicle;
import org.junit.jupiter.api.Test;



import static org.junit.jupiter.api.Assertions.*;

class RentalAgencyTest {

    @Test
    void testAddVehicle() {
        RentalAgency agency = new RentalAgency();
        Vehicle car = new Car("C1", "Toyota Corolla", 100);
        agency.addVehicle(car);

        assertDoesNotThrow(() -> agency.rentVehicle("C1", new Customer("John Doe", "C123"), 3));
    }

    @Test
    void testRentVehicle() {
        RentalAgency agency = new RentalAgency();
        Vehicle car = new Car("C1", "Toyota Corolla", 100);
        agency.addVehicle(car);

        Customer customer = new Customer("John Doe", "C123");
        Vehicle rentedVehicle = agency.rentVehicle("C1", customer, 3);

        assertNotNull(rentedVehicle);
        assertFalse(rentedVehicle.isAvailable());
        assertEquals(1, customer.getRentalHistory().size());
    }

    @Test
    void testReturnVehicle() {
        RentalAgency agency = new RentalAgency();
        Vehicle car = new Car("C1", "Toyota Corolla", 100);
        agency.addVehicle(car);

        Customer customer = new Customer("John Doe", "C123");
        agency.rentVehicle("C1", customer, 3);
        agency.returnVehicle("C1");

        assertTrue(car.isAvailable());
    }
}

