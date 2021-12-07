package com.demo.nopcommerce.testsuite;

import com.demo.nopcommerce.pages.HomePage;
import com.demo.nopcommerce.pages.LoginPage;
import com.demo.nopcommerce.pages.RegisterPage;
import com.demo.nopcommerce.testbase.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
@Listeners

public class RegistrationTest extends TestBase {

        HomePage homePage;
        LoginPage loginPage;
        SoftAssert softAssert;
        RegisterPage registerPage;

        @BeforeMethod(groups = {"smoke","sanity","regression"})
        public void setUp(){

            homePage = new HomePage();
            loginPage = new LoginPage();
            softAssert = new SoftAssert();
            registerPage = new RegisterPage();
        }

        @Test(groups = {"smoke","regression"})
        public void verifyUserShouldNotAbleToRegisterLeavingMandatoryFieldEmpty() throws InterruptedException {

            homePage.clickOnRegisterTab();

            String expectedPageNavigationText = "Register";
            String actualPageNavigationText = registerPage.getTextRegisterText();
            softAssert.assertEquals(expectedPageNavigationText,actualPageNavigationText);

            Thread.sleep(1000);
            registerPage.enterFirstName("");
            Thread.sleep(1000);
            registerPage.enterLastName("Murphy");
            Thread.sleep(1000);
            registerPage.enterEmail("Max","@gmail.com");
            Thread.sleep(1000);
            registerPage.enterPassword("xyz123456789");
            Thread.sleep(1000);
            registerPage.enterConfirmPassword("xyz123456789");
            Thread.sleep(1000);
            registerPage.clickOnRegisterButton();

            String expectedErrorMessage = "First name is required.";
            String actualErrorMessage = registerPage.getErrorMessage();
            softAssert.assertEquals(expectedErrorMessage,actualErrorMessage);

            softAssert.assertAll();
        }

        @Test(groups = {"sanity","regression"})
        public void verifyUserShouldAbleToRegisterWithValidInputInAllMandatoryFields() throws InterruptedException {

            homePage.clickOnRegisterTab();

            String expectedPageNavigationText = "Register";
            String actualPageNavigationText = registerPage.getTextRegisterText();
            softAssert.assertEquals(expectedPageNavigationText,actualPageNavigationText);

            Thread.sleep(1000);
            registerPage.enterFirstName("Max");
            registerPage.enterLastName("Murphy");
            Thread.sleep(1000);
            registerPage.enterEmail("Max","@gmail.com");
            registerPage.enterPassword("xyz123456789");
            Thread.sleep(1000);
            registerPage.enterConfirmPassword("xyz123456789");
            Thread.sleep(1000);
            registerPage.clickOnRegisterButton();

            String expectedRegistrationText = "Your registration completed";
            String actualRegistrationText = registerPage.getRegistrationCompleteText();
            softAssert.assertEquals(expectedRegistrationText,actualRegistrationText);

            softAssert.assertAll();

        }


    }

