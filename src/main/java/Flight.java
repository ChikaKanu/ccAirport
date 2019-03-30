import java.util.ArrayList;

public class Flight {

    private PlaneType plane;
    private int flightNumber;
    private String destination;
    private int gate;

    public Flight(PlaneType plane, int flightNumber, String destination, int gate) {
        this.plane = plane;
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.gate = gate;

    }

}