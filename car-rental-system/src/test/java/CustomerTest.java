import org.example.Car;
import org.example.Customer;
import org.example.Vehicle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {

    @Test
    void testCustomerCreation() {
        Customer customer = new Customer("John Doe", "C123");

        assertEquals("John Doe", customer.getName());
        assertEquals("C123", customer.getCustomerId());
        assertTrue(customer.getRentalHistory().isEmpty());
    }

    @Test
    void testAddRental() {
        Customer customer = new Customer("John Doe", "C123");
        Vehicle car = new Car("C1", "Toyota Corolla", 100);

        customer.addRental(car);
        assertEquals(1, customer.getRentalHistory().size());
    }
}

