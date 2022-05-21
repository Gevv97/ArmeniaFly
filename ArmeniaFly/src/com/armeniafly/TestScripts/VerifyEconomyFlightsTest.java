package com.armeniafly.TestScripts;

import com.armeniafly.Pages.EconomyFlights;
import com.armeniafly.Pages.ModifySearch;
import com.armeniafly.Pages.SearchFlight;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import utils.ScreenshotMethod;

import java.io.IOException;
import java.time.Duration;

public class VerifyEconomyFlightsTest extends Base
{
    @Test
    public void verifyStandardEconomyFlight() throws InterruptedException
    {
        try {
            SearchFlight searchFlight = new SearchFlight(driver);
            ModifySearch modifySearch = new ModifySearch(driver);
            EconomyFlights economy = new EconomyFlights(driver);

            searchFlight.searchTab();
            searchFlight.clickDeparture();

            WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(20));
            wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@class,'_2a1tb')]")));

            searchFlight.enterDeparturePlace("Yerevan");
            Thread.sleep(2000);
            searchFlight.clickYerevan();
            searchFlight.clickArrival();

            WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(20));
            wait2.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#websky > div > div._2FgxC > div > div > form > div:nth-child(1) > div._2_MOj._2BIIt._2JxWI > div > div > div.iwglb.aIETQ._2RvhJ._1bMPd > div > div:nth-child(3) > div")));

            searchFlight.enterArrivalPlace("Tbilisi");
            Thread.sleep(2000);
            searchFlight.clickTbilisi();

            searchFlight.clickDate();
            WebDriverWait wait3 = new WebDriverWait(driver, Duration.ofSeconds(20));
            wait3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@class,'_23l0u _1w_Ek')]")));

            while (true) {
                String actualMonth = searchFlight.getMonth();
                String actualYear = searchFlight.getYear();
                //Outbound date is June 2, 2022
                if ((actualMonth.equals("June")) && (actualYear.equals("2022"))) {
                    break;
                } else {
                    searchFlight.clickNext();
                }
            }

            searchFlight.selectDepartureDate();
            while (true) {
                String actualMonth = searchFlight.getMonth();
                String actualYear = searchFlight.getYear();
                //return date is July 3, 2022
                if ((actualMonth.equals("July")) && (actualYear.equals("2022"))) {
                    break;
                } else {
                    searchFlight.clickNext();
                }
            }
            searchFlight.selectArrivalDate();
            searchFlight.clickSearch();

            modifySearch.selectFlightDetails();
            economy.clickEconomy();

            String actualText = economy.verifyEconomyText();
            String expectedText = "Economy";
            Assert.assertEquals(actualText, expectedText);
        }
        catch(Exception ex)
        {
            System.out.println(ex.getMessage());
        }
    }

    @AfterMethod
    public void takeScreenshotOnFailure(ITestResult testResult) throws IOException
    {
        if(testResult.getStatus() == ITestResult.FAILURE)
        {
            ScreenshotMethod.takeScreenshot("C:\\Testing\\F_screenshots", driver, "screenshot");
        }
    }
}
