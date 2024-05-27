package Demo.PLT_Automation_Task.testsuite;

import Demo.PLT_Automation_Task.pages.ClothingPage;
import Demo.PLT_Automation_Task.pages.HomePage;
import Demo.PLT_Automation_Task.pages.JeansPage;
import Demo.PLT_Automation_Task.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CheckOutPageTest extends BaseTest {
    JeansPage jeansPage;
    HomePage homePage;
    ClothingPage clothingPage;

    @BeforeMethod
    public void inIt() {
        jeansPage = new JeansPage();
        homePage = new HomePage();
        clothingPage = new ClothingPage();

    }
    @Test
    public void verifyUserSuccessfullyAbleToCheckOut() throws InterruptedException {
        //Accept Cookies
        homePage.getAcceptCookies();
        Thread.sleep(2000);

        //Mouse hover on Element clothing
        homePage.mouseHoverOnClothingAndClick();
        Thread.sleep(2000);

        //Verify Display PLP get List By
        clothingPage.getPlpList();
        Thread.sleep(2000);

        //Click On Jeans
        clothingPage.clickOnJeans();
        Thread.sleep(2000);

        //Click On Product
        jeansPage.clickOnTall();
        Thread.sleep(2000);

        //Click On Product Size
        jeansPage.clickOnSize();
        Thread.sleep(2000);

        //Verify message "The product name displayed"
        String expectedErrorMessage = "PRETTYLITTLETHING Tall Washed Black High Rise Straight Leg Jeans";
        String actualErrorMessage = jeansPage.getProductNameText();
        Assert.assertEquals(expectedErrorMessage, actualErrorMessage, " message not displayed");
        Thread.sleep(2000);

        //Verify message "The product SIZE displayed"
        String expectedErrorMessage1 = "10";
        String actualErrorMessage1 = jeansPage.getSize();
        Assert.assertEquals(expectedErrorMessage1, actualErrorMessage1, " message not displayed");
        Thread.sleep(2000);

        //Click on add to cart
        jeansPage.clickOnAddToCart();
        Thread.sleep(2000);

        //Click on bag
        jeansPage.clickOnBag();
        Thread.sleep(2000);

        //Click on Checkout
        jeansPage.clickOnCheckout();
        Thread.sleep(2000);


        // Enter EmailId
        Thread.sleep(2000);
        jeansPage.enterEmailId("samuelsmith33211@gmail.com");

        //Click on continue button
        jeansPage.clickOnContinueButton();
        Thread.sleep(2000);

        //Enter password
        jeansPage.enterPassword("Sam@33211");
        Thread.sleep(2000);

        //Click on continue button
        jeansPage.clickOnContinueButton1();
        Thread.sleep(2000);

        //Verify the 'ProductName'
        jeansPage.getProductName();
        Thread.sleep(2000);


        //Verify the 'ProductSize'
        jeansPage.getClothesSize();
        Thread.sleep(2000);

        //Verify the 'Product Total Price'
        jeansPage.getSubTotal();
        Thread.sleep(2000);

        //Verify the 'Product Delivery Price'
        jeansPage.getDeliveryTotal();
        Thread.sleep(2000);

        //Scroll down tp payment
        jeansPage.scrollToPaymentMethod();
        Thread.sleep(2000);

        //Select  card for payment
        jeansPage.clickOnPayWithCard();
        Thread.sleep(2000);

    }
}