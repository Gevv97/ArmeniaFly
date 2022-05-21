package com.armeniafly.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PremiumEconomyFlight
{
    @FindBy(css="#websky > div:nth-child(2) > div > div._2BFYs._1lvrE > div._3QUwQ.Ekosm > div:nth-child(2) > div > div._238cm._1UjQv._3Koy0._3BS9H > div > div.sgFTz._2syPO")
    private WebElement premiumText;
    @FindBy(css ="#websky > div:nth-child(2) > div > div._2BFYs._1lvrE > div._3QUwQ.Ekosm > div:nth-child(2) > div > div._238cm._1UjQv._3Koy0._3BS9H > div > div._3I3yV > span")
    private WebElement premiumPrice;
    @FindBy(xpath="//div[contains(@class,'_1d4hF _1aFFO _3MAmk TCC8N')]")
    private WebElement premiumFlight;

    public PremiumEconomyFlight(WebDriver driver)
    {
        PageFactory.initElements(driver, this);
    }
    public String getPremiumText()
    {
        return premiumText.getText();
    }
    public String getPremiumPrice()
    {
        return premiumPrice.getText();
    }
    public void selectPremiumFlight()
    {
        premiumFlight.click();
    }
}
