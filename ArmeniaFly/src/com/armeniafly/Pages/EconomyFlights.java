package com.armeniafly.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EconomyFlights
{
    @FindBy(xpath="//button[contains(@class,'MuiButtonBase-root _1j_Ta _1eLPl _1sWhs _3bCf3 _1tw7A _3DvNp _32EeP')]")
    private WebElement selectEconomy;
    @FindBy(css="body > div.MuiDialog-root > div.MuiDialog-container.MuiDialog-scrollPaper > div > div > div._3lPtV > div > div:nth-child(1) > div > div > div > div > div.slick-slide.slick-active.slick-current > div > div > button")
    private WebElement standardButton;
    @FindBy(css="body > div.MuiDialog-root > div.MuiDialog-container.MuiDialog-scrollPaper > div > div > div._3lPtV > div > div:nth-child(1) > div > div > div > div > div:nth-child(2) > div > div > button")
    private WebElement flexiButton;
    @FindBy(css="body > div.MuiDialog-root > div.MuiDialog-container.MuiDialog-scrollPaper > div > div > div._3lPtV > div > div:nth-child(1) > div > div > div > div > div:nth-child(3) > div > div > button")
    private WebElement premiumButton;

    public EconomyFlights(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
    }
    public void clickEconomy()
    {
        selectEconomy.click();
    }
    public String verifyEconomyText()
    {
        return selectEconomy.getText();
    }
    public void selectStandard()
    {
        standardButton.click();
    }
    public void selectFlexi()
    {
        flexiButton.click();
    }
    public void selectPremium()
    {
        premiumButton.click();
    }
}
