package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Alert {
    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver","C:\\Users\\Ladi\\Desktop\\chromedriver-win64\\chromedriver.exe");

        ChromeOptions opt = new ChromeOptions();
        opt.addArguments("--remote-allow-origins=*");
        WebDriver webDriver = new ChromeDriver(opt);
        webDriver.manage().window().maximize();
        webDriver.get("https://rahulshettyacademy.com/AutomationPractice/");

        String text="Vlad";

        webDriver.findElement(By.id("name")).sendKeys(text);

        webDriver.findElement(By.cssSelector("[id='alertbtn']")).click();

        System.out.println(webDriver.switchTo().alert().getText());

        webDriver.switchTo().alert().accept();

        webDriver.findElement(By.id("confirmbtn")).click();

        System.out.println(webDriver.switchTo().alert().getText());



        webDriver.switchTo().alert().dismiss();

    }
}
