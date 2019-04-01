import java.util.ArrayList;
import java.util.HashMap;

public class Airport {

    private String airportCode;
    private double bank;
    private ArrayList<Hangar> collectionOfHangars;
    private HashMap<String, Gate> collectionOfFlightToGates;
    private HashMap<String, Double> departures;
    private HashMap<String, Double> arrivals;
    private HashMap<String, String> planeToHangars;

    public Airport(String airportCode, double bank) {
        this.airportCode = airportCode;
        this.bank = bank;
        this.collectionOfHangars = new ArrayList<>();
        this.collectionOfFlightToGates = new HashMap<>();
        this.departures = new HashMap<>();
        this.arrivals = new HashMap<>();
        this.planeToHangars = new HashMap<>();
    }

    public String getAirportCode() {
        return this.airportCode;
    }

    public double getBank() {
        return this.bank;
    }

    public void recieveMoney(double amount) {
       double bankAmount = this.bank;
       this.bank = bankAmount + amount;
    }

    public void payMoney(double amount) {
        double bankAmount = this.bank;
        this.bank = bankAmount - amount;
    }

    public void addHangarsToCollection(Hangar hangar) {
        this.collectionOfHangars.add(hangar);
    }

    public void removeHangarsFromCollection(Hangar hangar) {
        this.collectionOfHangars.remove(hangar);
    }

//    public Flight createFlight() {
//
//    }










//
//    public void recieveMoney(double amount) {
//        double bankAmount = this.bank;
//        this.bank = bankAmount + amount;
//    }
//
//    public void payMoney(double amount) {
//        double bankAmount = this.bank;
//        this.bank = bankAmount - amount;
//    }
}
