package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DinamicDropDowns {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\Ladi\\Desktop\\chromedriver-win64\\chromedriver.exe");

        ChromeOptions opt = new ChromeOptions();
        opt.addArguments("--remote-allow-origins=*");
        WebDriver webDriver = new ChromeDriver(opt);
        webDriver.manage().window().maximize();
        webDriver.get("https://spicejet.com");

        webDriver.findElement(By.xpath("//div[@data-testid='to-testID-origin']")).click();
        Thread.sleep(3000);
         webDriver.findElement(By.xpath("//div[@class='css-1dbjc4n r-1loqt21 r-p1pxzi r-qi0n3 r-1otgn73']")).click();
        Thread.sleep(3000);
        webDriver.findElement(By.xpath("(//div[@class='css-1dbjc4n r-1awozwy r-1loqt21 r-18u37iz r-1wtj0ep r-b5h31w r-rnv2vh r-5njf8e r-1otgn73'])[20]")).click();
    }
}
