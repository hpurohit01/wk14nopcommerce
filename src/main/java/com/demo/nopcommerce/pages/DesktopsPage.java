package com.demo.nopcommerce.pages;

import com.demo.nopcommerce.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

import java.util.logging.Logger;

public class DesktopsPage extends Utility {

    private static final Logger log = java.util.logging.LogManager.getLogManager().getLogger(DesktopsPage.class.getName());


        @FindBy(xpath = "//h1[contains(text(),'Desktops')]")
        WebElement desktopText;

        public String getDesktopPageNavigationText(){

            Reporter.log("Navigate to desktop page and verify navigated page welcome text "+ desktopText.toString()+ "<br>");
            log.info("Navigate to desktop page and verify navigated page welcome text "+ desktopText.toString());
            return desktopText.getText();
        }
    }


