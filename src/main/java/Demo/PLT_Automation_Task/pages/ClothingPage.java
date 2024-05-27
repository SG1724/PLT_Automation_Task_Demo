package Demo.PLT_Automation_Task.pages;

import Demo.PLT_Automation_Task.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class ClothingPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//div[@class=\"plpCategoryLinkTable__grid grid grid-flow-row-dense\"]//a")
    List<WebElement> PlpList;

    @CacheLookup
    @FindBy(xpath = "//a[@href='/clothing/jeans.html']")
    WebElement Jeans;


    public void getPlpList() {
        //  List<WebElement> PlpList=driver.findElements(By.xpath("//div[@class=\"plpCategoryLinkTable__grid grid grid-flow-row-dense\"]//a"));
       for(WebElement P: PlpList){
          // P.getText();
           System.out.println(P.getText());
       }
    }


    public void clickOnJeans() {
        // Create an explicit wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Use the explicit wait to handle StaleElementException
       try {
           // Wait until the element is present on the page
           WebElement ele = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@href='/clothing/jeans.html']")));
        } catch (Exception e) {
           System.out.println("StaleElementException occurred. Refreshing the page.");
           // Refresh the page
           driver.navigate().refresh();
           // Re-locate the element after page refresh

           WebElement refreshedEle = driver.findElement(By.xpath("//a[@href='/clothing/jeans.html']") );

        refreshedEle.sendKeys("Selenium");

       System.out.println("Search text entered successfully after page refresh.");
        }
       clickOnElement(Jeans);
    }
}





