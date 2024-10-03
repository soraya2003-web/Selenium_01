package learn_selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.io.File;

public class SeleniumEdge
{
    public static void main(String[] args)
    {
        String path = System.getProperty("user.dir") + File.separator + "src" + File.separator + "main" + File.separator + "resources" + File.separator + "msedgedriver.exe";
        System.setProperty("webdriver.edge.driver",path);

        WebDriver driver = new EdgeDriver();
        driver.get("http://www.walmart.com/");
    }
}
