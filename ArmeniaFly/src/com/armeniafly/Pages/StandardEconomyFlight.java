package com.armeniafly.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StandardEconomyFlight
{
    @FindBy(xpath = "//div[contains(@class,'sgFTz _2syPO')]")
    private WebElement standardText;
    @FindBy(xpath = "//span[contains(@class,'DHk3Z _2aUrq _29868')]")
    private WebElement standardPrice;
    @FindBy(css="#websky > div:nth-child(2) > div > div._2BFYs._1lvrE > div._2oBnE > div._1d4hF._1aFFO > div._238cm._1UjQv > div > button")
    private WebElement clickReturnFlightButton;

    public StandardEconomyFlight(WebDriver driver)
    {
        PageFactory.initElements(driver, this);
    }
    public String getStandardText()
    {
        return standardText.getText();
    }
    public String getStandardPrice()
    {
        return standardPrice.getText();
    }
    public void returnFlightButton()
    {
        clickReturnFlightButton.click();
    }
}
