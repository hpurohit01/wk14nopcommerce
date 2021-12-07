package resources.testdata;

import org.testng.annotations.DataProvider;

public class TestData {


    @DataProvider(name = "processor")
    public Object[][] getData() {

        Object[][] data = new Object[][]{


             /*   {"2.2 GHz Intel Pentium Dual-Core E2200","2GB","320 GB"},
                {"Vista Home[+$50.00]","Microsoft Office[+$50.00]"},
                {},*/

                {"test1@gmail.com", "test123"},
                {"test2@gmail.com", "test456"},
                {"test3@gmail.com", "test789"}
        };
        return data;
    }

}

