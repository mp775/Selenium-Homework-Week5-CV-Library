package resources.testdata;

import org.testng.annotations.DataProvider;

public class TestData {
    @DataProvider(name = "jobSearchDataSet")
    public Object[][] getData(){
        Object[][] data = new Object[][]{
                {"Tester", "Harrow", "up to 5 miles", "30000", "500000", "Per annum", "Permanent", "Permanent Tester jobs in Harrow"},
                {"Developer", "Reading", "up to 2 miles", "40000", "600000", "Per day", "Contract", "Contract Developer jobs in Reading"},
                {"Test Manager", "Manchester", "up to 7 miles", "45000", "650000", "Per month", "Permanent", "Permanent Test Manager jobs in Manchester"},
                {"Devops Engineer", "Luton", "up to 15 miles", "35000", "600000", "Per week", "Part Time", "Part Time Devops Engineer jobs in Luton"},
                {"Test Analyst", "London", "up to 10 miles", "45000", "650000", "Per day", "Contract", "Contract Test Analyst jobs in London"},
                {"Account Manager", "Leeds", "up to 5 miles", "40000", "600000", "Per annum", "Permanent", "Permanent Account Manager jobs in Leeds"}

        };
        return data;
    }
}
