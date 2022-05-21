package com.armeniafly.Pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import sun.awt.windows.WEmbeddedFrame;

public class SearchFlight
{
    @FindBy(css = "#websky > div > div._3uX9C.Y5wUT._3pWXm > div > div > div > button.MuiButtonBase-root.MuiTab-root._3MEYq.MuiTab-textColorInherit.Mui-selected._3jvuX._1KiXr > span > div > div.LVFCt.iMnm9")
    private WebElement search;
    @FindBy(name="departure_0")
    private WebElement from;
    @FindBy(xpath="//div[contains(@class,'cYLPM')]")
    private WebElement selectYerevan;
    @FindBy(name="arrival_0")
    private  WebElement to;
    @FindBy(css="#websky > div > div._2FgxC > div > div > form > div:nth-child(1) > div._2_MOj._2BIIt._2JxWI > div > div > div.iwglb.aIETQ._2RvhJ._1bMPd > div > div:nth-child(3) > div > div._1VDRp > div:nth-child(2)")
    private WebElement selectTbilisi;
    @FindBy(css="#websky > div > div._2FgxC > div > div > form > div:nth-child(1) > div._2_MOj._2BIIt._2JxWI > div > div > div.iwglb.aIETQ._3b7Yk.ZVBdm > div._1ClQM > div")
    private WebElement date;
    @FindBy(xpath = "//div[contains(@class,'fJD13 fJD13 jUxl8 jUxl8 g81fo _1kG1D _3eiwm _3eiwm')]")
    private WebElement month;
    @FindBy(xpath = "//div[contains(@class,'fJD13 fJD13 _2cuzb _2cuzb _3NgEN _3nk_S _3eiwm _3eiwm')]")
    private WebElement year;
    @FindBy(css="#websky > div > div._2FgxC > div > div > form > div:nth-child(1) > div._2_MOj._2BIIt._2JxWI > div > div > div.iwglb.aIETQ._3b7Yk.ZVBdm > div._15edQ._2YsI2 > div._23l0u._1w_Ek > div._1LKe3._1LKe3 > div > div > div:nth-child(1) > div:nth-child(3) > div:nth-child(4)")
    private  WebElement setDepartureDate;
    @FindBy(css="#websky > div > div._2FgxC > div > div > form > div:nth-child(1) > div._2_MOj._2BIIt._2JxWI > div > div > div.iwglb.aIETQ._3b7Yk.ZVBdm > div._15edQ._2YsI2 > div._23l0u._1w_Ek > div._1LKe3._1LKe3 > div > div > div:nth-child(1) > div:nth-child(3) > div:nth-child(7)")
    private  WebElement setArrivalDate;
    @FindBy(xpath="//div[contains(@class,'_19DEu _19DEu _2ArH5')]")
    private WebElement clickArrow;
    @FindBy(xpath="//button[contains(@type,'submit')]")
    private WebElement searchButton;

    @FindBy(css="#websky > div:nth-child(2) > div > div._2BFYs._1lvrE > div.pJbfq > div.d1OfY > div._3pUFQ")
    private WebElement searchConfirmation;

    public SearchFlight(WebDriver driver)
    {
        PageFactory.initElements(driver, this);
    }
    public void searchTab()
    {
        search.click();
    }
    public void clickDeparture()
    {
        from.click();
    }
    public void enterDeparturePlace(String place1)
    {
        from.sendKeys(place1);
    }
    public void clickYerevan()
    {
        selectYerevan.click();
    }
    public void clickArrival()
    {
        to.click();
    }
    public void enterArrivalPlace(String place2)
    {
        to.sendKeys(place2);
    }
    public void clickTbilisi()
    {
        selectTbilisi.click();
    }
    public void clickDate()
    {
        date.click();
    }
    public String getMonth()
    {
       return month.getText();
    }
    public String getYear()
    {
        return year.getText();
    }
    public void selectDepartureDate()
    {
        setDepartureDate.click();
    }
    public void selectArrivalDate()
    {
        setArrivalDate.click();
    }
    public void clickNext()
    {
        clickArrow.click();
    }
    public void clickSearch()
    {
        searchButton.click();
    }
}
