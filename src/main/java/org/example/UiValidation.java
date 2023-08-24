package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

public class UiValidation {
    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver","C:\\Users\\Ladi\\Desktop\\chromedriver-win64\\chromedriver.exe");


        ChromeOptions opt = new ChromeOptions();
        opt.addArguments("--remote-allow-origins=*");
        WebDriver webDriver = new ChromeDriver(opt);
        webDriver.manage().window().maximize();
        webDriver.get("https://rahulshettyacademy.com/dropdownsPractise/");


        System.out.println(webDriver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled());

        System.out.println(webDriver.findElement(By.id("Div1")).getAttribute("style"));

        webDriver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();

        System.out.println(webDriver.findElement(By.id("Div1")).getAttribute("style"));

        if(webDriver.findElement(By.id("Div1")).getAttribute("style").contains("1"))

        {

            System.out.println("its enabled");

            Assert.assertTrue(true);

        }

        else

        {

            Assert.assertTrue(false);

        }

    }
}
