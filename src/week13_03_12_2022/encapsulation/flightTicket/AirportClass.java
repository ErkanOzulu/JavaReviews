package week13_03_12_2022.encapsulation.flightTicket;

import week11_19_11_2022.custom_class.FirstClass;

import java.util.ArrayList;
import java.util.Arrays;

public class AirportClass {
  static   ArrayList<FlightTicket>flightTickets=new ArrayList<>();
  static   {

    FlightTicket ticket1 = new FlightTicket("first", "Chicago", "Virgina");
    FlightTicket ticket2 = new FlightTicket("business", "Chicago", "Virgina");
    FlightTicket ticket3 = new FlightTicket("economy", "Chicago", "Virgina");
    FlightTicket ticket4 = new FlightTicket("economy", "Washington", "Virgina");
    FlightTicket ticket5 = new FlightTicket("business", "Arizona", "Florence");
    FlightTicket ticket6 = new FlightTicket("business", "Colorado", "Denver");
    FlightTicket ticket7 = new FlightTicket("first", "Connecticut", "Bristol");
    FlightTicket ticket8 = new FlightTicket("business", "Chicago", "Virgina");
    FlightTicket ticket9 = new FlightTicket("first", "Florida", "Bartow");
    FlightTicket ticket10 = new FlightTicket("first", "Indiana", "Bedford");
    flightTickets.addAll(Arrays.asList(ticket1,ticket2,ticket3,ticket4,ticket5,ticket6,ticket7,ticket8,ticket9,ticket10));

    }



    public static void main(String[] args) {



      ArrayList<FlightTicket> listFirstClass = firstClass("first");
      System.out.println(listFirstClass);

      ArrayList<FlightTicket> departureFrom = departureFrom("Chicago");
      System.out.println(departureFrom);

    }


      private static ArrayList<FlightTicket> departureFrom (String state){

        ArrayList<FlightTicket> result = new ArrayList<>();

        for (FlightTicket ticket : flightTickets) {

          if (ticket.getDeparture().equalsIgnoreCase(state)) {

            result.add(ticket);

          }
        }
        return result;
      }

      private static ArrayList<FlightTicket> firstClass (String type){
        ArrayList<FlightTicket> result = new ArrayList<>();

        for (FlightTicket ticket : flightTickets) {

          if (ticket.getType().equalsIgnoreCase(type)) {

            result.add(ticket);
          }
        }
        return result;


      }

}
/*
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
