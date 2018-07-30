package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import pages.TicketstowroldHomePage;

public class Ticketstoworldimpl {

    TicketstowroldHomePage tks = new TicketstowroldHomePage();
    private WebDriver driver = null;

    public void SetDriverDetailsAndlaunchBrowser() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Users/lmco/Desktop/Seleniumpractise/src/main/resources/chromedriver");

// Initialize browser
        driver = new ChromeDriver();


// Open facebook
        driver.get("https://www.ticketstoworld.co.uk/");
        Thread.sleep(3000);

    }


    public void fillFlightSearchDetails() {

        new Select(tks.FlyFrom(driver)).selectByVisibleText("London Heathrow");
        tks.Flyto(driver).sendKeys("Hyderabad");
           tks.DepartureDate(driver).sendKeys("17-Aug-2018");
    }

}