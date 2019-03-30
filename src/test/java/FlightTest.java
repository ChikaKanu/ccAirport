import org.junit.Before;

import java.util.ArrayList;

public class FlightTest {

    private Flight flight;

    @Before
    public void before() {
        flight = new Flight (PlaneType.BOING737, 3024, "France", 0);
    }

}
