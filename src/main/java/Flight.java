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

}