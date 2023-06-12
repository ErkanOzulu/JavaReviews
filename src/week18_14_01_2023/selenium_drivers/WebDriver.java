package week18_14_01_2023.selenium_drivers;

public interface WebDriver extends SearchContext {

    void get(String url);
    void close();
    void quit();

}
