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
    public void canAddContact() {
        airline.addContact("0131456782");
        assertEquals("0131456782", airline.getContact());
    }
    @Test
    public void canGetAirline() {
        assertEquals("AirFrance", airline.getAirline());
    }

    @Test
    public void canAddAirline() {
        airline.addAirline("BA");
        assertEquals("BA", airline.getAirline());
    }

}
