import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class PassengerTest {
    private Passenger passenger;

    @Before
    public void before() {
        passenger = new Passenger("Chika", 101234657, "Italy", true );
    }


    @Test
    public void shouldGetName() {
        assertEquals("Chika", passenger.getName());
    }

    @Test
    public void shouldGetPassport() {
        assertEquals(101234657, passenger.getPassport());
    }

    @Test
    public void shouldGetDestination() {
        assertEquals("Italy", passenger.getDestination());
    }

    @Test
    public void shouldGetCheckInStatus() {
        assertEquals(true, passenger.getCheckedInStatus());
    }

}
