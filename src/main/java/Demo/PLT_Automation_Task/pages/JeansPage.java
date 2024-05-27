package Demo.PLT_Automation_Task.pages;

import Demo.PLT_Automation_Task.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class JeansPage extends Utility {

    @CacheLookup
    @FindBy (xpath = "//h3[text()=\"PRETTYLITTLETHING Tall Washed Black High Rise Straight Leg Jeans\"]")
    WebElement Tall;

    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='10']")
    WebElement Size;
    @CacheLookup
    @FindBy(xpath = "//h1[@id='pdp-name']")
    WebElement ProductName;

    @CacheLookup
    @FindBy(id = "add-to-bag-button")
    WebElement addToCart;

    @CacheLookup
    @FindBy(xpath = "//p[@class='absolute w-full inline-start-0 top-0 mb-0 font-brand-thin leading-6']")
    WebElement bag;



    @CacheLookup
    @FindBy(id = "checkout-button-top")
    WebElement checkout;


    @CacheLookup
    @FindBy(xpath = "//input[@id='customer-email']")
    WebElement emailField;
    @CacheLookup
    @FindBy(xpath = "//button[@type='submit']")
    WebElement continueButton;

    @CacheLookup
    @FindBy(id = "customer-password")
    WebElement passwordField;

    @CacheLookup
    @FindBy(xpath = "//button[@class=\"btn c-button c-button--large \"]")
    WebElement continueButton1;

    @CacheLookup
    @FindBy(xpath = "//li[@class='bag-item__name']")
    WebElement productName;

    @CacheLookup
    @FindBy(xpath = "//li[normalize-space()='Clothes Size: 10']")
    WebElement clothesSize;

    @CacheLookup
    @FindBy(xpath = "//li[@class='bag__totals-item subtotal']")
    WebElement subTotal;

    @CacheLookup
    @FindBy(xpath = "//li[@class='bag__totals-item']")
    WebElement saverDelivery;

    @CacheLookup
    @FindBy(xpath = "//button[contains(@class,'btn c-button c-button btn--payment')]")
    WebElement payWithCard;

    @CacheLookup
    @FindBy(xpath = "//button[contains(@class,'btn c-button c-button btn--payment')]")
    WebElement Card;




    public void clickOnTall() {
        clickOnElement(Tall);
    }

    public void clickOnSize() {
        clickOnElement(Size);
    }

    public String getProductNameText() {
        try {
            ProductName.click();
        } catch (Exception e) {
            JavascriptExecutor executor = (JavascriptExecutor) driver;
            executor.executeScript("arguments[0].click();", driver.findElement(By.xpath("//h1[@id='pdp-name']")));
        }

        return getTextFromElement(ProductName);
    }


    public String getSize() {

        try {
            Size.click();
        } catch (Exception e) {
            JavascriptExecutor executor = (JavascriptExecutor) driver;
            executor.executeScript("arguments[0].click();", driver.findElement(By.xpath("//span[normalize-space()='10']")));
        }

        return getTextFromElement(Size);
    }


    public void clickOnAddToCart() {
        clickOnElement(addToCart);
    }

    public void clickOnBag() {
        clickOnElement(bag);
    }


    public void clickOnCheckout() {
        clickOnElement(checkout);
    }

    public void enterEmailId(String email) {
        try {
            emailField.click();
        } catch (Exception e) {
            JavascriptExecutor executor = (JavascriptExecutor) driver;
            executor.executeScript("arguments[0].click();", driver.findElement(By.xpath("//input[@id='customer-email']")));
        }
        sendTextToElement(emailField, email);
    }

    public void clickOnContinueButton() {
        clickOnElement(continueButton);
    }

    public void enterPassword(String Password) {
        try {
            passwordField.click();
        } catch (Exception e) {
            JavascriptExecutor executor = (JavascriptExecutor) driver;
            executor.executeScript("arguments[0].click();", driver.findElement(By.id("customer-password")));
        }
        sendTextToElement(passwordField, Password);
    }

    public void clickOnContinueButton1() {
        clickOnElement(continueButton1);
    }

    public String getProductName() {
        try {
            productName.click();
        } catch (Exception e) {
            JavascriptExecutor executor = (JavascriptExecutor) driver;
            executor.executeScript("arguments[0].click();", driver.findElement(By.xpath("//li[@class='bag-item__name']")));
        }
        return getTextFromElement(productName);
    }

    public String getClothesSize() {
        try {
            clothesSize.click();
        } catch (Exception e) {
            JavascriptExecutor executor = (JavascriptExecutor) driver;
            executor.executeScript("arguments[0].click();", driver.findElement(By.xpath("//li[normalize-space()='Clothes Size: 10']")));
        }
        return getTextFromElement(clothesSize);
    }

    public String getSubTotal() {
        try {
            subTotal.click();
        } catch (Exception e) {
            JavascriptExecutor executor = (JavascriptExecutor) driver;
            executor.executeScript("arguments[0].click();", driver.findElement(By.xpath("//li[@class='bag__totals-item subtotal']")));
        }

        return getTextFromElement(subTotal);
    }

    public String getDeliveryTotal() {
        try {
            saverDelivery.click();
        } catch (Exception e) {
            JavascriptExecutor executor = (JavascriptExecutor) driver;
            executor.executeScript("arguments[0].click();", driver.findElement(By.xpath("//li[@class='bag__totals-item']")));
        }

        return getTextFromElement(saverDelivery);
    }
    public void scrollToPaymentMethod(){
        scrolltoView(payWithCard);

    }
    public void clickOnPayWithCard(){
        clickOnElement(Card);
    }}




