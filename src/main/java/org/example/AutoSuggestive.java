package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AutoSuggestive {

    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver","C:\\Users\\Ladi\\Desktop\\chromedriver-win64\\chromedriver.exe");

        ChromeOptions opt = new ChromeOptions();
        opt.addArguments("--remote-allow-origins=*");
        WebDriver webDriver = new ChromeDriver(opt);
        webDriver.manage().window().maximize();
        webDriver.get("https://rahulshettyacademy.com/dropdownsPractise/");

        webDriver.findElement(By.id("autosuggest")).sendKeys("ind");

        Thread.sleep(3000);

        List<WebElement> options = webDriver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));

        for(WebElement option :options)

        {

            if(option.getText().equalsIgnoreCase("India")) {
                option.click();
                break;
            }}

    }

}
