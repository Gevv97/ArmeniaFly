package com.armeniafly.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlightsTotalCalculation
{
    @FindBy(css="#websky > div:nth-child(2) > div > div._2BFYs._1lvrE > div._3VxjT._143iY > div > div:nth-child(2) > span > span")
    private WebElement total;

    public FlightsTotalCalculation(WebDriver driver)
    {
        PageFactory.initElements(driver, this);
    }
    public String getFlightsTotal()
    {
        return total.getText();
    }

}
