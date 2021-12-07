package com.demo.nopcommerce.pages;

import com.demo.nopcommerce.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

import java.util.logging.LogManager;

public class ComputerPage extends Utility {


    private static final java.util.logging.Logger log = LogManager.getLogManager().getLogger(ComputerPage.class.getName());


    @FindBy(xpath = "//h2[@class='title']/a[@href='/desktops']")
        WebElement desktopLink;

        @FindBy(xpath = "//h1[contains(text(),'Computers')]")
        WebElement computerText;


        public String getComputerNavigationText() {
            Reporter.log("Navigate to computer page and verify navigated page welcome text " + computerText.toString() + "<br>");
            log.info("Navigate to computer page and verify navigated page welcome text " + computerText.toString());
            return computerText.getText();
        }

        public void clickOnDesktop() {
            Reporter.log("Click on desktop option "+desktopLink.toString()+"<br>");
            mouseHoverToElementAndClick(desktopLink);
            log.info("Click on desktop option "+desktopLink.toString());
        }

    }


