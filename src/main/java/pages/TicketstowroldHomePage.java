package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TicketstowroldHomePage {


 private static WebElement element = null;

    public  WebElement FlyFrom(WebDriver driver){
        element = driver.findElement(By.cssSelector(".pickkss"));
       // System.out.println("The element is::::::::::::;;;" +element.getText());
        return element;
    }

    public  WebElement Flyto(WebDriver driver)
    {
       driver.findElement(By.className("//input[@class='pickk ac_input']"));
        return  element;

    }
    public WebElement DepartureDate(WebDriver driver)

    {
        return driver.findElement(By.id("//input[@name='FDptDateDDMMYY']"));

    }
}