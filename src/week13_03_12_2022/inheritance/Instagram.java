package week13_03_12_2022.inheritance;

public class Instagram extends MobileApp{

    public Instagram(double version){
        super("Instagram",version);
    }


    /*
    public  Instagram(){
       super();
    }
    */



    /*
    instead of that one I need to use extends keyword and MobileApp
  public   String name;
  public  double version;
    public void useTheApp(int minutes){
        System.out.println("The user is using " + name + " application for " + minutes + " minutes");
    }
    public  void  download(){
        System.out.println(name + " application is downloading by the user.");
    }
    public String toString() {
        return "MobileApp{" +
                "name='" + name + '\'' +
                ", version=" + version +
                '}';
    }
    */



}
