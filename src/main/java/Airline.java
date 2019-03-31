public class Airline {

    private String airline;
    private String contact;

    public Airline(String airline, String contact) {
        this.airline = airline;
        this.contact = contact;
    }

    public String getAirline() {
        return this.airline;
    }

    public String getContact() {
        return this.contact;
    }

    public void addAirline(String newAirline) {
        this.airline = newAirline;
    }

    public void addContact(String newContact) {
        this.contact = newContact;
    }

}
