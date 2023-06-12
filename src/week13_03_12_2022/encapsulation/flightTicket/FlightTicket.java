package week13_03_12_2022.encapsulation.flightTicket;

public class FlightTicket {

private String type;
private String departure;
private String arrivalLocation;

    public FlightTicket(String type, String departure, String arrivalLocation) {
       setType(type);
       setDeparture(departure);
       setArrivalLocation(arrivalLocation);
    }

    public void setType(String type) {
      type=type.toLowerCase();
        if (!(type.equals("first")||type.equals("business")||type.equals("economy"))){
            return;
        }

        this.type = type;
    }

    public void setDeparture(String departure) {
        this.departure = departure;
    }

    public void setArrivalLocation(String arrivalLocation) {
        this.arrivalLocation = arrivalLocation;
    }

    public String getType() {
        return type;
    }

    public String getDeparture() {
        return departure;
    }

    public String getArrivalLocation() {
        return arrivalLocation;
    }

    public String toString() {
        return  "FlightTicket{" +
                "type='" + type + '\'' +
                ", departure='" + departure + '\'' +
                ", arrivalLocation='" + arrivalLocation + '\'' +
                '}';
    }
}
/*
FlightTicket Task

 declare these instance variables in FlightTicket class:
            type(first, business, economy
            departure location/airport
            arrival location/airport

         encapsulate all of them

         create constructor to set up the object

            Note: type should only be first, business, or economy

________________________________________


Then create 10 objects in Airport class in static block

Examples :

  FlightTicket ticket1 = new FlightTicket("first", "Chicago", "Virgina");
  FlightTicket ticket1 = new FlightTicket("business", "Chicago", "Virgina");
  .
  .
  .

Tasks:

1- create a method returns list of flight tickets are first as type (try to make it dynamic)
2- create a metthod returns list of flight tickets are from Chicago   (try to make it dynamic)
 */