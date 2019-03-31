import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class AirlineTest {

    private Airline airline;

    @Before
    public void before() {
        airline = new Airline("AirFrance", "0131547684");
    }

    @Test
    public void canGetAirline() {
        assertEquals("AirFrance", airline.getAirline());
    }

}
