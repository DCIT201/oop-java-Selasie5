import org.example.Car;
import org.example.Customer;
import org.example.RentalTransaction;
import org.example.Vehicle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RentalTransactionTest {

    @Test
    void testTransactionDetails() {
        Customer customer = new Customer("John Doe", "C123");
        Vehicle car = new Car("C1", "Toyota Corolla", 100);

        RentalTransaction transaction = new RentalTransaction(customer, car, 3);

        assertEquals(300, transaction.getCost());
        assertEquals("John Doe", transaction.customer.getName());
        assertEquals("C1", transaction.vehicle.getVehicleId());
    }
}
