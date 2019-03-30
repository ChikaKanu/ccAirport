public class Passenger {

    private String name;
    private int passport;
    private String destination;
    private Boolean checkedIn;

    public Passenger(String name, int passport, String destination, Boolean checkedIn) {

        this.name = name;
        this.passport = passport;
        this.destination = destination;
        this.checkedIn = checkedIn;
    }

    public String getName() {
        return this.name;
    }

    public int getPassport() {
        return this.passport;
    }

    public String getDestination() {
        return this.destination;
    }
    public Boolean getCheckedInStatus() {
        return this.checkedIn;
    }

}
