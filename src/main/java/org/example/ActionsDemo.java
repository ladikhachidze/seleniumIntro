package org.example;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;
import java.util.function.Function;

public class ActionsDemo {
    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver","C:\\Users\\Ladi\\Desktop\\chromedriver-win64\\chromedriver.exe");

        ChromeOptions opt = new ChromeOptions();
        opt.addArguments("--remote-allow-origins=*");
        WebDriver webDriver = new ChromeDriver(opt);
        webDriver.manage().window().maximize();
        webDriver.get("https://google.com");


                webDriver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("amazon.com");
        Thread.sleep(1111);
                webDriver.findElement(By.xpath("//div[@class='lJ9FBc']//input[@name='btnK']")).click();
        Thread.sleep(1111);
                webDriver.findElement(By.cssSelector("span[class='ellip']")).click();



            Thread.sleep(3000);

        Actions a = new Actions(webDriver);
        a.moveToElement(webDriver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")))
                .click()
                .keyDown(Keys.LEFT_SHIFT)
                .sendKeys("sneekers men")
                .keyDown(Keys.ENTER).build().perform();



    }
}
