import org.junit.Before;
import org.junit.Test;

import javax.lang.model.type.ArrayType;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class PlaneTest {
    Plane plane;
    PlaneType planeType;
    Airline airline;
    Passenger passenger1;
    Passenger passenger2;
    Passenger passenger3;
    Passenger passenger4;
    ArrayList<Plane> passengers;
    ArrayList<Plane> airLine;


    @Before
    public void before() {
        plane = new Plane(PlaneType.AIRBUSA220);
        airline = new Airline("BA", "0135489703");
        passenger1 = new Passenger("Chika", 101234657, "Italy", true );
        passenger2 = new Passenger("John", 345234657, "Italy", true );
        passenger3 = new Passenger("Emil", 501234657, "Italy", true );
        passenger4 = new Passenger("Abdul", 967134657, "Italy", true );
        passengers = new ArrayList<>();
        airLine = new ArrayList<>();
    }

    @Test
    public void canGetPlane() {
        assertEquals(PlaneType.AIRBUSA220, plane.getPlane());
    }


    @Test
    public void canGetAirline() {
       plane.addAirline(airline);
        assertEquals(1, plane.getNumberOfAirLine());
    }


    @Test
    public void getAllPassenger() {
        plane.addPassenger(passenger1);
        plane.addPassenger(passenger2);
        plane.addPassenger(passenger2);
        assertEquals(3, plane.getNumberOfPassengers());
    }

    @Test
    public void canAddPlane() {
        plane.addPlane(PlaneType.AIRBUSA380);
        assertEquals(PlaneType.AIRBUSA380, plane.getPlane());
    }

    @Test
    public void canCheckPassengerTrue() {
        plane.addPassenger(passenger1);
        plane.addPassenger(passenger2);
        plane.addPassenger(passenger2);
        assertEquals(true, plane.checkPassenger(passenger1));
    }

    @Test
    public void canCheckPassengerFalse() {
        plane.addPassenger(passenger1);
        plane.addPassenger(passenger2);
        plane.addPassenger(passenger2);
        assertEquals(false, plane.checkPassenger(passenger4));
    }

    @Test
    public void canGetPlaneCapacity() {
        plane = new Plane(PlaneType.AIRBUSA320);
        assertEquals(230, plane.getPlaneCapacity());
    }

}
