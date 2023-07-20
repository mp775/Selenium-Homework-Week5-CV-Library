package com.cv.library.testsuite;

import com.cv.library.pages.HomePage;
import com.cv.library.pages.ResultPage;
import com.cv.library.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import resources.testdata.TestData;

public class JobSearchTest extends BaseTest {
    HomePage homePage;
    ResultPage resultPage;

    @BeforeMethod
    public void inIt() {
        homePage = new HomePage();
        resultPage = new ResultPage();
    }

    @Test(dataProvider = "jobSearchDataSet", dataProviderClass = TestData.class)
    public void verifyJobSearchResultUsingDifferentDataSet(String jobTitle, String location, String distance, String salaryMin, String salaryMax, String salaryType, String jobType,
                                                           String result) {
        homePage.enterJobTitle(jobTitle);
        homePage.enterLocation(location);
        homePage.selectDistance(distance);
        homePage.clickOnMoreSearchOptionLink();
        homePage.enterMinSalary(salaryMin);
        homePage.enterMaxSalary(salaryMax);
        homePage.selectSalaryType(salaryType);
        homePage.selectJobType(jobType);
        homePage.clickOnFindJobsButton();
        String actualResult = resultPage.verifyTheResults(result);
        Assert.assertEquals(actualResult, result, "Search result validation failed");
    }
}
