package com.armeniafly.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlexiEconomyFlight
{
    @FindBy(xpath = "//div[contains(@class,'sgFTz _2syPO')]")
    private WebElement flexiText;
    @FindBy(css = "#websky > div:nth-child(2) > div > div._2BFYs._1lvrE > div._3QUwQ.Ekosm > div > div > div._238cm._1UjQv._3Koy0._3BS9H > div > div._3I3yV > span")
    private WebElement flexiPrice;

    public FlexiEconomyFlight(WebDriver driver)
    {
        PageFactory.initElements(driver, this);
    }
    public String getFlexiText()
    {
        return flexiText.getText();
    }
    public String getFlexiPrice()
    {
        return flexiPrice.getText();
    }
}
