package Demo.PLT_Automation_Task.utility;

import Demo.PLT_Automation_Task.browserfactory.ManageBrowser;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class Utility extends ManageBrowser{

        /*Utility Class extends to ManageDriver for the driver to finding locators
         *All common methods are fixed in the utility Class.
         */
         /**
         * This method will click on element-
         */
        public void clickOnElement(WebElement element) {
            element.click();
        }

        /**
         * This method will get text from element-
         */
        public String getTextFromElement(WebElement element) {
            return element.getText();
        }

        /**
         * This method will send text on element-
         */
        public void sendTextToElement(WebElement element, String str) {
            element.sendKeys(str);
        }

        /**
         * This method will return list of web elements-----keep this method
         */
        public List<WebElement> webElementList(By by) {
            return driver.findElements(by);
        }

        /**
         * This method will use to hover mouse on element and click-------- KEEP THIS METHOD
         */
        public void mouseHoverToElementAndClick(WebElement element) {
            Actions actions = new Actions(driver);
            actions.moveToElement(element).click().perform();
        }


     /**
     * This method will scroll-
     */
    public static void scrolltoView(WebElement element){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", element);
    }

    }


