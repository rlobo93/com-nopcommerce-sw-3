package electronics;

import com.google.common.base.Verify;
import javafx.scene.control.Tab;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Mouse;
import utility.Utility;


public class ElectronicsTest extends Utility {
    String BaseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp(){
        openBrowser(BaseUrl);
    }


public void test()throws InterruptedException{

//       1.1 Mouse Hover on “Electronics”Tab
    mouseHoverToElement(By.xpath("//body/div[6]/div[2]/ul[1]/li[2]/a[1]"));

//    1.2 Mouse Hover on “Cell phones” and click
    mouseHoverToElement(By.xpath("//body/div[6]/div[2]/ul[1]/li[2]/ul[1]/li[2]/a[1]"));
    clickOnElement(By.xpath("//body/div[6]/div[2]/ul[1]/li[2]/ul[1]/li[2]/a[1]"));

//    1.3 Verify the text “Cell phones”
    String expectedMessage = "Cell phones";
    String actualMessage = getTextFromElement(By.xpath("//h1[contains(text(),'Cell phones')]"));
    Assert.assertEquals(actualMessage, expectedMessage);
    Thread.sleep(1000);

}



@Test
    public void verifyThatTheProductAddedSuccessfullyAndPlaceOrderSuccessfully() throws InterruptedException{
//        2.1 Mouse Hover on “Electronics” Tab
    mouseHoverToElement(By.xpath("//body/div[6]/div[2]/ul[1]/li[2]/a[1]"));


//        2.2 Mouse Hover on “Cell phones” and click
    mouseHoverToElement(By.xpath("//body/div[6]/div[2]/ul[1]/li[2]/ul[1]/li[2]/a[1]"));
    clickOnElement(By.xpath("//body/div[6]/div[2]/ul[1]/li[2]/ul[1]/li[2]/a[1]"));

//        2.3 Verify the text “Cell phones”
    String expectedMessage = "Cell phones";
    String actualMessage = getTextFromElement(By.xpath("//h1[contains(text(),'Cell phones')]"));
    Assert.assertEquals(actualMessage, expectedMessage);
    Thread.sleep(1000);

//        2.4 Click on List View Tab
    mouseHoverToElement(By.xpath("//a[contains(text(),'List')]"));
    clickOnElement(By.xpath("//a[contains(text(),'List')]"));
    Thread.sleep(1000);

//        2.5 Click on product name “Nokia Lumia 1020” link
    mouseHoverToElement(By.xpath("//a[contains(text(),'Nokia Lumia 1020')]"));
    clickOnElement(By.xpath("//a[contains(text(),'Nokia Lumia 1020')]"));

//        2.6 Verify the text “Nokia Lumia 1020”
    String expectedMessage1 = "Nokia Lumia 1020";
    String actualMessage1 = getTextFromElement(By.xpath("//h1[contains(text(),'Nokia Lumia 1020')]"));
    Assert.assertEquals(actualMessage1, expectedMessage1);
    Thread.sleep(1000);

//        2.7 Verify the price “$349.00”
    String expectedMessage2 = "$349.00";
    String actualMessage2 = getTextFromElement(By.xpath("//span[@id='price-value-20']"));
    Assert.assertEquals(actualMessage2, expectedMessage2);
    Thread.sleep(1000);

//        2.8 Change quantity to 2

    clearValue(By.xpath("//input[@id='product_enteredQuantity_20']"));
    sendTextToElement(By.xpath("//input[@id='product_enteredQuantity_20']"),"2");
    Thread.sleep(3000);

//        2.9 Click on “ADD TO CART” tab
    clickOnElement(By.id("add-to-cart-button-20"));



//        2.10 Verify the Message "The product has been added to your shopping cart" on Top green Bar
    String expectedMessage3 = "The product has been added to your shopping cart";
    String actualMessage3 = getTextFromElement(By.xpath("//body/div[@id='bar-notification']/div[1]/p[1]"));
    Assert.assertEquals(actualMessage3, expectedMessage3);
    Thread.sleep(1000);

//        After that close the bar clicking on the cross button.
    clickOnElement(By.xpath("//body/div[@id='bar-notification']/div[1]/span[1]"));

//        2.11 Then MouseHover on "Shopping cart" and Click on "GO TO CART" button.
    mouseHoverToElement(By.xpath("//span[contains(text(),'Shopping cart')]"));
    clickOnElement(By.xpath("//span[contains(text(),'Shopping cart')]"));

//        2.12 Verify the message "Shopping cart"
    String expectedMessage4 = "Shopping cart";
    String actualMessage4 = getTextFromElement(By.xpath("//h1[contains(text(),'Shopping cart')]"));
    Assert.assertEquals(actualMessage4, expectedMessage4);
    Thread.sleep(1000);

////        2.13 Verify the quantity is 2
//   int expectedMessage5 = 2;
//    int actualMessage5 = getNumberFromElement(By.xpath("//input[@id='itemquantity11218']"));
//    Assert.assertEquals(actualMessage5, expectedMessage5);
//    Thread.sleep(1000);


//        2.14 Verify the Total $698.00
    String expectedMessage6 = "$698.00";
    String actualMessage6 = getTextFromElement(By.xpath("//body[1]/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[3]/div[2]/div[1]/table[1]/tbody[1]/tr[4]/td[2]/span[1]/strong[1]"));
    Assert.assertEquals(actualMessage6, expectedMessage6);
    Thread.sleep(1000);

//        2.15 click on checkbox “I agree with the terms of service”
    clickOnElement(By.xpath("//input[@id='termsofservice']"));

//        2.16 Click on checkout
    clickOnElement(By.id("checkout"));

//        2.17 Verify the Text “Welcome, Please Sign In!”
    String expectedMessage7 = "Welcome, Please Sign In!";
    String actualMessage7 = getTextFromElement(By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]"));
    Assert.assertEquals(actualMessage7, expectedMessage7);
    Thread.sleep(1000);

//        2.18 Click on “REGISTER” tab
    clickOnElement(By.xpath("//button[contains(text(),'Register')]"));

//        2.19 Verify the text “Register”
    String expectedMessage8 = "Register";
    String actualMessage8 = getTextFromElement(By.xpath("//h1[contains(text(),'Register')]"));
    Assert.assertEquals(actualMessage8, expectedMessage8);
    Thread.sleep(1000);

//        2.20 Fill the mandatory fields
    //Gender
    clickOnElement(By.id("gender-male"));
    Thread.sleep(1000);
    //First name:
    sendTextToElement(By.xpath("//input[@id='FirstName']"),"Ron");
    Thread.sleep(1000);
    //Last name
    sendTextToElement(By.xpath("//input[@id='LastName']"),"Jira");
    Thread.sleep(1000);
    //Date of birth:
    selectByValueFromDropDown(By.name("DateOfBirthDay"),"9");
    selectByVisibleFromDropDown(By.name("DateOfBirthMonth"),"November");

    //selectByValueFromDropDown(By.name("DateOfBirthMonth"),"November");
    selectByValueFromDropDown(By.name("DateOfBirthYear"),"1991");
    Thread.sleep(1000);
    //Email:
    sendTextToElement(By.id("Email"),"r12@gmail.co.uk");
    Thread.sleep(1000);
    //Password:
    sendTextToElement(By.id("Password"),"ron1234");
    //Confirm password
    sendTextToElement(By.id("ConfirmPassword"),"ron1234");

    Thread.sleep(1000);

//        2.21 Click on “REGISTER” Button
    clickOnElement(By.id("register-button"));
    Thread.sleep(1000);

//        2.22 Verify the message “Your registration completed”
    String expectedMessage9 = "Your registration completed";
    String actualMessage9 = getTextFromElement(By.xpath("//div[contains(text(),'Your registration completed')]"));
    Assert.assertEquals(actualMessage9, expectedMessage9);
    Thread.sleep(1000);

//        2.23 Click on “CONTINUE” tab

    clickOnElement(By.xpath("//a[contains(text(),'Continue')]"));

//        2.24 Verify the text “Shopping cart”
    String expectedMessage10 = "Shopping cart";
    String actualMessage10 = getTextFromElement(By.xpath("//h1[contains(text(),'Shopping cart')]"));
    Assert.assertEquals(actualMessage10, expectedMessage10);
    Thread.sleep(1000);

//        2.25 click on checkbox “I agree with the terms of service”
clickOnElement(By.xpath("//input[@id='termsofservice']"));

//        2.26 Click on “CHECKOUT”
    clickOnElement(By.xpath("//button[@id='checkout']"));
Thread.sleep(2000);

//        2.27 Fill the Mandatory fields
    //first name
    clearValue(By.id("BillingNewAddress_FirstName"));
    sendTextToElement(By.id("BillingNewAddress_FirstName"),"Ron");
    Thread.sleep(1000);

    //Last name
    clearValue(By.id("BillingNewAddress_LastName"));
    sendTextToElement(By.id("BillingNewAddress_LastName"),"Jira");
    Thread.sleep(1000);

    //Email
    clearValue(By.id("BillingNewAddress_Email"));
    sendTextToElement(By.id("BillingNewAddress_Email"),"rlo@gamil.co.uk");
    Thread.sleep(1000);
    //Country

    selectByVisibleFromDropDown(By.xpath("//select[@id='BillingNewAddress_CountryId']"),"United Kingdom");
    Thread.sleep(1000);

    //City
    sendTextToElement(By.id("BillingNewAddress_City"),"london");
    Thread.sleep(1000);

    //Address 1:
    sendTextToElement(By.id("BillingNewAddress_Address1"),"105 london street");
    Thread.sleep(1000);

    //zip
    sendTextToElement(By.id("BillingNewAddress_ZipPostalCode"),"UB10 10BU");
    Thread.sleep(1000);

    //Phone number:
    sendTextToElement(By.id("BillingNewAddress_PhoneNumber"),"0712345678");
    Thread.sleep(1000);



//        2.28 Click on “CONTINUE”
    clickOnElement(By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[1]/div[2]/div[1]/button[4]"));
    Thread.sleep(1000);

//        2.29 Click on Radio Button “2nd Day Air ($0.00)”
    clickOnElement(By.id("shippingoption_2"));

    Thread.sleep(1000);

//        2.30 Click on “CONTINUE”
    clickOnElement(By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[3]/div[2]/form[1]/div[2]/button[1]"));
    Thread.sleep(1000);

//        2.31 Select Radio Button “Credit Card”
    clickOnElement(By.id("paymentmethod_1"));
    clickOnElement(By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[4]/div[2]/div[1]/button[1]"));
    Thread.sleep(1000);


//        2.32 Select “Visa” From Select credit card dropdown

    selectByVisibleFromDropDown(By.id("CreditCardType"),"Visa");
    Thread.sleep(1000);

//        2.33 Fill all the details
    //Cardholder name:
    sendTextToElement(By.id("CardholderName"),"MR R Jira");

    //Card number:
    sendTextToElement(By.id("CardNumber"),"4111111111111111");

    //Expiration date:
    selectByVisibleFromDropDown(By.id("ExpireMonth"),"09");
    selectByVisibleFromDropDown(By.id("ExpireYear"),"2027");
    Thread.sleep(1000);

    //Card code:
    sendTextToElement(By.id("CardCode"),"007");
    Thread.sleep(1000);

//        2.34 Click on “CONTINUE”CHECKOUT”
    clickOnElement(By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[5]/div[2]/div[1]/button[1]"));
Thread.sleep(1000);

//        2.35 Verify “Payment Method” is “Credit Card”
    String expectedMessage11 = "Credit Card";
    String actualMessage11 = getTextFromElement(By.xpath("//span[contains(text(),'Credit Card')]"));
    Assert.assertEquals(actualMessage11, expectedMessage11);
    Thread.sleep(1000);

//        2.36 Verify “Shipping Method” is “2nd Day Air”
    String expectedMessage12 = "2nd Day Air";
    String actualMessage12 = getTextFromElement(By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[6]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/ul[1]/li[1]/span[2]"));
    Assert.assertEquals(actualMessage12, expectedMessage12);
    Thread.sleep(1000);


//        2.37 Verify Total is “$698.00”
    String expectedMessage13 = "$698.00";
    String actualMessage13 = getTextFromElement(By.xpath("//body[1]/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[6]/div[2]/div[1]/div[1]/div[1]/div[1]/form[1]/div[3]/div[1]/div[1]/table[1]/tbody[1]/tr[4]/td[2]/span[1]/strong[1]"));
    Assert.assertEquals(actualMessage13, expectedMessage13);
    Thread.sleep(1000);

//        2.38 Click on “CONFIRM”
    clickOnElement(By.xpath("//button[contains(text(),'Confirm')]"));
    Thread.sleep(1000);

//        2.39 Verify the Text “Thank you”
    String expectedMessage14 = "Thank you";
    String actualMessage14 = getTextFromElement(By.xpath("//h1[contains(text(),'Thank you')]"));
    Assert.assertEquals(actualMessage14, expectedMessage14);
    Thread.sleep(1000);

//        2.40 Verify the message “Your order has been successfully processed!”
    String expectedMessage15 = "Your order has been successfully processed!";
    String actualMessage15 = getTextFromElement(By.xpath("//strong[contains(text(),'Your order has been successfully processed!')]"));
    Assert.assertEquals(actualMessage15, expectedMessage15);
    Thread.sleep(1000);

//        2.41 Click on “CONTINUE”
    clickOnElement(By.xpath("//button[contains(text(),'Continue')]"));
    Thread.sleep(1000);

//        2.42 Verify the text “Welcome to our store”
    String expectedMessage16 = "Welcome to our store";
    String actualMessage16 = getTextFromElement(By.xpath("//h2[contains(text(),'Welcome to our store')]"));
    Assert.assertEquals(actualMessage16, expectedMessage16);
    Thread.sleep(1000);

//        2.43 Click on “Logout” link

    mouseHoverToElement(By.xpath("//h2[contains(text(),'Welcome to our store')]"));
    clickOnElement(By.xpath("//h2[contains(text(),'Welcome to our store')]"));


//        2.44 Verify the URL is “https://demo.nopcommerce.com/”
   String expectedMessage17 = "https://demo.nopcommerce.com/";
   String actualMessage17 = driver.getCurrentUrl();
   Assert.assertEquals(actualMessage17, expectedMessage17);

    }



}

