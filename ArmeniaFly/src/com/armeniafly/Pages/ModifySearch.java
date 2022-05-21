package com.armeniafly.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ModifySearch
{
    @FindBy(xpath="//span[contains(@class,'_3xkgb _4NZG')]")
    private WebElement modify;
    @FindBy(xpath="//div[contains(@class,'MaOUN G7DAd xr69S')]")
    private WebElement passenger;
    @FindBy(xpath="//button[contains(@class,'MuiButtonBase-root _2SJR5 jhtXT')]")
    private WebElement morePassenger;
    @FindBy(xpath = "//div[contains(@class,'_1d4hF _1aFFO')]")
    private WebElement clickFlightDetails;

    public ModifySearch(WebDriver driver)
    {
        PageFactory.initElements(driver, this);
    }
    public void clickModifySearch()
    {
        modify.click();
    }
    public void clickPassenger()
    {
        passenger.click();
    }
    public void addPassenger()
    {
        morePassenger.click();
    }
    public void selectFlightDetails()
    {
        clickFlightDetails.click();
    }
}
