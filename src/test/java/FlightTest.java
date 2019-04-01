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

    @Test
    public void canAddFlight() {
        flight.addFlight(PlaneType.BOING777, 4024, "London", Gate.GATE6);
        assertEquals(PlaneType.BOING777, flight.getPlane());
        assertEquals(4024, flight.getFlightNumber());
        assertEquals("London", flight.getDestination());
        assertEquals(Gate.GATE6, flight.getGate());
    }

}
