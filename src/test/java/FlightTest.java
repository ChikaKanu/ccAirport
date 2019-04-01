import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    private Flight flight;
    private Airport flightNumber;

    @Before
    public void before() {
        flight = new Flight (PlaneType.BOING737,"France", Gate.GATE1);
        flightNumber = new Airport("GLA",40000, 3024);
    }

    @Test
    public void hasName() {
        assertEquals(PlaneType.BOING737, flight.getPlane());
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
        flight.addFlight(PlaneType.BOING777, "London", Gate.GATE6);
        assertEquals(PlaneType.BOING777, flight.getPlane());
        assertEquals("London", flight.getDestination());
        assertEquals(Gate.GATE6, flight.getGate());
    }

}
