import java.util.ArrayList;

public class Plane {

    private PlaneType plane;
    private Airline airline;
    private ArrayList<Passenger> passengers;

    public Plane(PlaneType plane, Airline airline) {
        this.plane = plane;
        this.airline = airline;
        this.passengers = new ArrayList<>();
    }

}
