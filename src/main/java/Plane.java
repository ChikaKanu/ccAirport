import java.util.ArrayList;
public class Plane {

    private PlaneType plane;
    private ArrayList<Airline> airline;
    private ArrayList<Passenger> passengers;

    public Plane(PlaneType plane) {
        this.plane = plane;
        this.airline = new ArrayList<>();
        this.passengers = new ArrayList<>();
    }

    public PlaneType getPlane() {
        return this.plane;
    }

//    public ArrayList getAllPassengers() {
//        return this.passengers;
//    }
//
//    public ArrayList getAirline() {
//        return this.airline;
//    }


    public boolean checkPassenger(Passenger name) {
        for (Passenger passenger : this.passengers) {
            if (passenger == name) {
                return true;
            }
        }
        return false;
    }

    public void addPlane(PlaneType newPlane) {
        this.plane = newPlane;
    }

    public void addAirline(Airline airline) {
        this.airline.add(airline);
    }

    public void addPassenger(Passenger name) {
        this.passengers.add(name);
    }

    public int getPlaneCapacity() {
        return this.plane.getValue();
    }

    public int getNumberOfPassengers() {
        return this.passengers.size();
    }

    public int getNumberOfAirLine() {
        return this.airline.size();
    }

}


