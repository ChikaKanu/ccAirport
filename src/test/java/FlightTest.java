import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    private Flight flight;

    @Before
    public void before() {
        flight = new Flight (PlaneType.BOING737, 3024, "France", Gate.GATE1);
    }

    @Test
    public void hasName() {
        assertEquals(PlaneType.BOING737, flight.getPlane());
    }

    @Test
    public void hasFlightNumber() {
        assertEquals(3024, flight.getFlightNumber());
    }

    @Test
    public void hasDestination() {
        assertEquals("France", flight.getDestination());
    }

    @Test
    public void hasGate() {
        assertEquals(Gate.GATE1, flight.getGate());
    }

}
