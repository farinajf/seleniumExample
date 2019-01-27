/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.google.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 *
 * @author fran
 */
public class GoogleHomePageTest {
    private WebDriver driver;
    private String    url = "https://google.com";

    @BeforeClass
    public void testSetUp() {
        System.setProperty("webdriver.gecko.driver", "/usr/local/bin/geckodriver");
        driver = new FirefoxDriver();
    }

    @Test
    public void verifyGooglePageTitle() {
        driver.navigate().to(url);

        final String title = driver.getTitle();

        System.out.println("Title: " + title);

        AssertJUnit.assertEquals(title,"Google");
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
