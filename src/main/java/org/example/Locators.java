package org.example;

import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Locators {
    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver","C:\\Users\\Ladi\\Desktop\\chromedriver-win64\\chromedriver.exe");

        ChromeOptions opt = new ChromeOptions();
        opt.addArguments("--remote-allow-origins=*");
        WebDriver webDriver = new ChromeDriver(opt);
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        webDriver.get("https://cydeo.com/");






        webDriver.findElement(By.className("eicon-close")).click();
        webDriver.findElement(By.id("mega-menu-item-322")).click();
        webDriver.findElement(By.id("username")).sendKeys("ladikhachidze@gmail.com");
        webDriver.findElement(By.id("password")).sendKeys("L@di311314");
        webDriver.findElement(By.className("c72d38f49")).click();
        webDriver.findElement(By.cssSelector("a.sc-hBUSln.gsEQBj")).click();
//        webDriver.findElement(By.linkText("Log Out")).click();
        Thread.sleep(2000);
        webDriver.findElement(By.xpath("(//img[@alt='Cydeo Learning logo'])[1]")).click();
       webDriver.findElement(By.xpath("//buttn[@class=NS_SideMenu-Button-Dropdown]")).click();


    }
}
