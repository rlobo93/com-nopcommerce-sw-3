package computer;

import com.google.common.base.Verify;
import javafx.scene.control.Tab;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.Computer;
import org.openqa.selenium.By;
import utility.Utility;

import java.awt.*;

public class TestSuite extends Utility {

    String BaseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp(){
        openBrowser(BaseUrl);
    }


    @Test
    public void testName() {

//    1.1 Click on Computer Menu.
        clickOnElement(By.xpath("//body/div[6]/div[2]/ul[1]/li[1]/a[1]"));

//    1.2 Click on Desktop
        mouseHoverToElement(By.xpath("//body/div[6]/div[3]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]/img[1]"));
        clickOnElement(By.xpath("//body/div[6]/div[3]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]/img[1]"));

//    1.3 Select Sort By position "Name: Z to A"
        mouseHoverToElement(By.xpath("//select[@id='products-orderby']"));
        mouseHoverAndClick(By.xpath("//select[@id='products-orderby']"));
        selectByValueFromDropDown(By.xpath("//select[@id='products-orderby']"),"6");
//    1.4 Verify the Product will arrange in Descending order.



    }



@Test
public void verifyProductAddedToShoppingCartSuccessFully() throws InterruptedException {

//    2.1 Click on Computer Menu.
    clickOnElement(By.xpath("//body/div[6]/div[2]/ul[1]/li[1]/a[1]"));

//    2.2 Click on Desktop
    mouseHoverToElement(By.xpath("//body/div[6]/div[3]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]/img[1]"));
    clickOnElement(By.xpath("//body/div[6]/div[3]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]/img[1]"));

//    2.3 Select Sort By position "Name: A to Z"
    mouseHoverToElement(By.xpath("//select[@id='products-orderby']"));
    clickOnElement(By.xpath("//select[@id='products-orderby']"));
    selectByValueFromDropDown(By.xpath("//select[@id='products-orderby']"),"5");

//    2.4 Click on "Add To Cart"
    mouseHoverAndClick(By.xpath("//body/div[6]/div[3]/div[1]/div[3]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[2]/button[1]"));
    clickOnElement(By.xpath("//body/div[6]/div[3]/div[1]/div[3]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[2]/button[1]"));

    Thread.sleep(2000);

//    2.5 Verify the Text "Build your own computer"
    String expectedMessage ="Build your own computer";
    String actualMessage = getTextFromElement(By.xpath("//h1[contains(text(),'Build your own computer')]"));
    Assert.assertEquals(actualMessage,expectedMessage);

//    2.6 Select "2.2 GHz Intel Pentium Dual-Core E2200" using Select class
    mouseHoverToElement(By.xpath("//select[@id='product_attribute_1']"));
    clickOnElement(By.xpath("//select[@id='product_attribute_1']"));
    selectByValueFromDropDown(By.xpath("//select[@id='product_attribute_1']"),"1");

//    2.7.Select "8GB [+$60.00]" using Select class.
    mouseHoverToElement(By.xpath("//select[@id='product_attribute_2']"));
    clickOnElement(By.xpath("//select[@id='product_attribute_2']"));
    selectByValueFromDropDown(By.xpath("//select[@id='product_attribute_2']"),"5");

Thread.sleep(1000);

//    2.8 Select HDD radio "400 GB [+$100.00]"
    mouseHoverToElement(By.id("product_attribute_3_7"));
    clickOnElement(By.id("product_attribute_3_7"));

//    2.9 Select OS radio "Vista Premium [+$60.00]"
    mouseHoverToElement(By.id("product_attribute_4_9"));
    clickOnElement(By.id("product_attribute_4_9"));
    Thread.sleep(1000);

//    2.10 Check Two Check boxes "Microsoft Office [+$50.00]" and "Total Commander [+$5.00]"
    mouseHoverToElement(By.id("product_attribute_5_12"));
    clickOnElement(By.id("product_attribute_5_12"));

    Thread.sleep(1000);

//    2.11 Verify the price "$1,475.00"
    String expectedMessage2 ="$1,475.00";
    String actualMessage2 = getTextFromElement(By.id("price-value-1"));
    Assert.assertEquals(actualMessage2,expectedMessage2);

//    2.12 Click on "ADD TO CARD" Button.
    mouseHoverToElement(By.id("add-to-cart-button-1"));
    clickOnElement(By.id("add-to-cart-button-1"));



//    2.13 Verify the Message "The product has been added to your shopping cart" on Top green Bar
//    After that close the bar clicking on the cross button.
    String expectedMessage3 ="The product has been added to your shopping cart";
    String actualMessage3 = getTextFromElement(By.xpath("//body/div[@id='bar-notification']/div[1]/p[1]"));
    Assert.assertEquals(actualMessage3,expectedMessage3);
    mouseHoverToElement(By.xpath("//body/div[@id='bar-notification']/div[1]/span[1]"));
    clickOnElement(By.xpath("//body/div[@id='bar-notification']/div[1]/span[1]"));

Thread.sleep(1000);

//    2.14 Then MouseHover on "Shopping cart" and Click on "GO TO CART" button.
    mouseHoverToElement(By.xpath("//span[contains(text(),'Shopping cart')]"));
    clickOnElement(By.xpath("//span[contains(text(),'Shopping cart')]"));

//    2.15 Verify the message "Shopping cart"
    String expectedMessage4 ="Shopping cart";
    String actualMessage4 = getTextFromElement(By.xpath("//h1[contains(text(),'Shopping cart')]"));
    Assert.assertEquals(actualMessage4,expectedMessage4);

//    2.16 Change the Qty to "2" and Click on "Update shopping cart"
    clearValue(By.xpath("//input[@value='1']"));
    sendTextToElement(By.xpath("//input[@value='1']"),"2");
    //Click on "Update shopping cart"
    clickOnElement(By.id("updatecart"));
    Thread.sleep(2000);

//    2.17 Verify the Total"$2,950.00"
    String expectedMessage5 ="$2,950.00";
    String actualMessage5 = getTextFromElement(By.xpath("//body[1]/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[3]/div[2]/div[1]/table[1]/tbody[1]/tr[4]/td[2]/span[1]/strong[1]"));
    Assert.assertEquals(actualMessage5,expectedMessage5);

//    2.18 click on checkbox “I agree with the terms of service”
    clickOnElement(By.id("termsofservice"));

//    2.19 Click on “CHECKOUT”
    clickOnElement(By.id("checkout"));
    Thread.sleep(1000);

//    2.20 Verify the Text “Welcome, Please Sign In!”
    String expectedMessage6 ="Welcome, Please Sign In!";
    String actualMessage6 = getTextFromElement(By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]"));
    Assert.assertEquals(actualMessage6,expectedMessage6);


//    2.21Click on “CHECKOUT AS GUEST”Tab
    clickOnElement(By.xpath("//button[contains(text(),'Checkout as Guest')]"));

//    2.22 Fill the all mandatory field
    //first name
    sendTextToElement(By.id("BillingNewAddress_FirstName"),"Ron");
    Thread.sleep(1000);

    //Last name
    sendTextToElement(By.id("BillingNewAddress_LastName"),"Jira");
    Thread.sleep(1000);
    //Email
    sendTextToElement(By.id("BillingNewAddress_Email"),"rlobo1993@gamil.co.uk");
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

//    2.23 Click on “CONTINUE”
    clickOnElement(By.xpath(" //button[@class='button-1 new-address-next-step-button'][@onclick='Billing.save()']"));
    Thread.sleep(1000);

//    2.24 Click on Radio Button “Next Day Air($0.00)”
    clickOnElement(By.id("shippingoption_1"));

    Thread.sleep(1000);

//    2.25 Click on “CONTINUE”
    clickOnElement(By.xpath(" //button[@class='button-1 shipping-method-next-step-button']"));

    Thread.sleep(1000);

//    2.26 Select Radio Button “Credit Card”
    clickOnElement(By.id("paymentmethod_1"));
    clickOnElement(By.xpath(" //button[@class='button-1 payment-method-next-step-button']"));

    Thread.sleep(1000);

//    2.27 Select “Master card” From Select credit card dropdown

    selectByVisibleFromDropDown(By.id("CreditCardType"),"Master card");

//    2.28 Fill all the details
    //Cardholder name:
    sendTextToElement(By.id("CardholderName"),"MR R Jira");
    //Card number:
    sendTextToElement(By.id("CardNumber"),"5512345678912345");
    //Expiration date:
selectByVisibleFromDropDown(By.id("ExpireMonth"),"09");
selectByVisibleFromDropDown(By.id("ExpireYear"),"2027");
    Thread.sleep(1000);
//Card code:
    sendTextToElement(By.id("CardCode"),"007");


    Thread.sleep(1000);

//    2.29 Click on “CONTINUE”

    clickOnElement(By.xpath("//button[@class='button-1 payment-info-next-step-button']"));
    Thread.sleep(1000);

//    2.30 Verify “Payment Method” is “Credit Card”
    String expectedMessage7 ="Credit Card";
    String actualMessage7 = getTextFromElement(By.xpath("//span[contains(text(),'Credit Card')]"));
    Assert.assertEquals(actualMessage7,expectedMessage7);
    Thread.sleep(1000);


//    2.32 Verify “Shipping Method” is “Next Day Air”
    String expectedMessage8 ="Next Day Air";
    String actualMessage8 = getTextFromElement(By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[6]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/ul[1]/li[1]/span[2]"));
    Assert.assertEquals(actualMessage8,expectedMessage8);

//    2.33 Verify Total is “$2,950.00”
    String expectedMessage9 ="$2,950.00";
    String actualMessage9 = getTextFromElement(By.xpath("//body[1]/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[6]/div[2]/div[1]/div[1]/div[1]/div[1]/form[1]/div[3]/div[1]/div[1]/table[1]/tbody[1]/tr[4]/td[2]/span[1]/strong[1]"));
    Assert.assertEquals(actualMessage9,expectedMessage9);
    Thread.sleep(1000);

//    2.34 Click on “CONFIRM”
    clickOnElement(By.xpath("//button[contains(text(),'Confirm')]"));

    Thread.sleep(1000);
//    2.35 Verify the Text “Thank You”
    String expectedMessage10 ="Thank you";
    String actualMessage10 = getTextFromElement(By.xpath("//h1[contains(text(),'Thank you')]"));
    Assert.assertEquals(actualMessage10,expectedMessage10);
    Thread.sleep(1000);

//    2.36 Verify the message “Your order has been successfully processed!”
    String expectedMessage11 ="Your order has been successfully processed!";
    String actualMessage11 = getTextFromElement(By.xpath("//strong[contains(text(),'Your order has been successfully processed!')]"));
    Assert.assertEquals(actualMessage11,expectedMessage11);
    Thread.sleep(1000);

//    2.37 Click on “CONTINUE”
    clickOnElement(By.xpath("//button[contains(text(),'Continue')]"));
    Thread.sleep(1000);

//    2.37 Verify the text “Welcome to our store”
    String expectedMessage12 ="Welcome to our store";
    String actualMessage12 = getTextFromElement(By.xpath("//h2[contains(text(),'Welcome to our store')]"));
    Assert.assertEquals(actualMessage12,expectedMessage12);

}








}
