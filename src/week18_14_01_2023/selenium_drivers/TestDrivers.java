package week18_14_01_2023.selenium_drivers;

public class TestDrivers {


    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        driver.get("https://youtube.com");
        driver=new FireFoxDriver();
        driver.get("https://google.com");
        //todo I'm  confused so that ı need to come back
        System.out.println(((TakeScreenShot) driver).getScreenShotAs());

        ((JavaScriptExecuter)driver).executeScript("dfkjgdfkg");


    }

}
