package learn_selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;

public class SeleniumChrome
{
    public static void main(String[] args)
    {
        String path = System.getProperty("user.dir") + File.separator + "src" + File.separator + "main" + File.separator + "resources" + File.separator + "chromedriver.exe";
        System.setProperty("webdriver.chrome.driver",path);

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");

    }
}
