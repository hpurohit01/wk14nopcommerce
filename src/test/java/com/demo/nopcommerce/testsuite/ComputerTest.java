package com.demo.nopcommerce.testsuite;

import com.demo.nopcommerce.pages.DesktopsPage;
import com.demo.nopcommerce.pages.HomePage;
import com.demo.nopcommerce.testbase.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

@Listeners
    public class ComputerTest extends TestBase {

        SoftAssert softAssert;
        HomePage homePage;
        DesktopsPage desktopPage;
       // NotebookPage  notebooksPage;
       // SoftwarePage softwarePage;

        @BeforeMethod(groups = {"smoke", "sanity", "regression"})
        public void setUp() {

            softAssert = new SoftAssert();
            homePage = new HomePage();
            desktopPage = new DesktopsPage();
            //notebooksPage = new NotebooksPage();
            //softwarePage = new SoftwarePage();
        }

        @Test(groups = {"smoke", "regression"})
        public void verifyUserAbleToNavigateToComputersSubMenuProductDesktopPageSuccessfully() throws InterruptedException {

            homePage.mouseHoverOnComputerTab();
            Thread.sleep(500);
           // homePage.clickOnDesktopFromComputerDropDown();

            String expectedDesktopPageNavigationText = "Desktops";
            String actualDesktopPageNavigationText = desktopPage.getDesktopPageNavigationText();
            softAssert.assertEquals(expectedDesktopPageNavigationText, actualDesktopPageNavigationText);

            softAssert.assertAll();
        }

        @Test(groups = {"sanity", "regression"})
        public void verifyUserAbleToNavigateToComputersSubMenuProductNotebooksPageSuccessfully() throws InterruptedException {

            homePage.mouseHoverOnComputerTab();
            Thread.sleep(1000);
         //   homePage.clickNotebooksFromComputerDropDown();

            String expectedNotebooksPageNavigationText = "Notebooks";
            //String actualNotebooksPageNavigationText = notebooksPage.getNotebooksPageNavigationText();
            //softAssert.assertEquals(expectedNotebooksPageNavigationText, actualNotebooksPageNavigationText);

            softAssert.assertAll();

        }

        @Test(groups = {"sanity", "regression"})
        public void verifyUserAbleToNavigateToComputersSubMenuProductSoftwarePageSuccessfully() throws InterruptedException {

            homePage.mouseHoverOnComputerTab();
            Thread.sleep(1000);
          //  homePage.clickOnSoftwareFromComputerDropDown();

            String expectedSoftwarePageNavigationText = "Software";
           // String actualSoftwarePageNavigationText = softwarePage.getSoftwarePageNavigationText();
           // softAssert.assertEquals(expectedSoftwarePageNavigationText, actualSoftwarePageNavigationText);

            softAssert.assertAll();

        }
    }

