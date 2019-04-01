import java.util.ArrayList;

public class Flight {

    private PlaneType plane;
    private String destination;
    private Gate gate;
    private ArrayList<Airport> flight;

    public Flight(PlaneType plane, String destination, Gate gate) {
        this.plane = plane;
        this.flight = new ArrayList<>();
        this.destination = destination;
        this.gate = gate;

    }


    public PlaneType getPlane() {
        return this.plane;
    }

    public String getDestination() {
        return this.destination;
    }

    public double checkFlight() {
        return this.flight.size();
    }

    public Gate getGate() {
        return this.gate;
    }

    public void addFlight(PlaneType newPlane, String newDestination, Gate newGate) {
        this.plane = newPlane;
        this.destination = newDestination;
        this.gate = newGate;
    }

    public void addFlightNumber(Airport flight) {
        this.flight.add(flight);
    }
}