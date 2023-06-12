package week13_03_12_2022.encapsulation.adress;

public class Adress {

    private String  country, state, city, street;
    private String zipCode;


    public Adress(String country, String state, String city, String street, String zipCode) {
       setCountry(country);
        setState(state);
        setCity(city);
        setStreet(street);
        setZipCode(zipCode);
    }

    public Adress() {
        setCountry(country);
        setState(state);
        setCity(city);
        setStreet(street);
        setZipCode(zipCode);
    }

    public String getStreet() {

        return street;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getCountry() {
        return country;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setStreet(String street) {
        if (street.equals("")||street.length()>50){
            System.out.println("Invalid Street");
           System.exit(0);
        }else

         this.street = street;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setZipCode(String zipCode) {
        if (zipCode.length()!=5){
            System.out.println("Invalid zip code");
           return;
        }
        this.zipCode = zipCode;
    }

    public String toString() {
        return "Adress{" +
                "country='" + country + '\'' +
                ", state='" + state + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", zipCode='" + zipCode + '\'' +
                '}';
    }
}
/*
AdressTask

    Create a class named Address

            Private variables:
                    street, city, state, zipCode,country

            encapsulate all the fields

            add a constructor that can set all the instances
                  overload constr with no arg constr

            - if the street name isEmpty or street length is bigger than 50
             otherwise
                 ERROR : Invalid Street

            - ZipCode length should be equal 5 otherwise
                 ERROR :Invalid ZipCode

            DO NOT duplicate any code fragments
________________________________
Then create Address objects.
 */