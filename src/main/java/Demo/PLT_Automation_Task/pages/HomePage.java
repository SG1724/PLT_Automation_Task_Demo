package Demo.PLT_Automation_Task.pages;

import Demo.PLT_Automation_Task.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class HomePage extends Utility {

  @CacheLookup
  @FindBy (id = "onetrust-accept-btn-handler")
  WebElement accepptCookies;
    @CacheLookup
    @FindBy(id = "clothing")
    WebElement clothing;

    @CacheLookup
    @FindBy(id ="tops")
    WebElement Tops;

    public void mouseHoverOnClothingAndClick() {
        mouseHoverToElementAndClick(clothing);
    }

public String getAcceptCookies(){

    try {
        accepptCookies .click();
    } catch (Exception e) {
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", driver.findElement(By.id("onetrust-accept-btn-handler") ));
    }
    return getTextFromElement(accepptCookies );
}

}
