public class Flight {

    private PlaneType plane;
    private int flightNumber;
    private String destination;
    private Gate gate;

    public Flight(PlaneType plane, int flightNumber, String destination, Gate gate) {
        this.plane = plane;
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.gate = gate;

    }

    public PlaneType getPlane() {
        return this.plane;
    }

    public int getFlightNumber() {
        return this.flightNumber;
    }

    public String getDestination() {
        return this.destination;
    }

    public Gate getGate() {
        return this.gate;
    }

    public void addFlight(PlaneType newPlane, int newFlightNumber, String newDestination, Gate newGate) {
        this.plane = newPlane;
        this.flightNumber = newFlightNumber;
        this.destination = newDestination;
        this.gate = newGate;
    }
}