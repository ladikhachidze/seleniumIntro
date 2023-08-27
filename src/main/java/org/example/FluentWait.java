package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;
import java.util.function.Function;

public class FluentWait {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\Ladi\\Desktop\\chromedriver-win64\\chromedriver.exe");

        ChromeOptions opt = new ChromeOptions();
        opt.addArguments("--remote-allow-origins=*");
        WebDriver webDriver = new ChromeDriver(opt);
        webDriver.manage().window().maximize();
        webDriver.get("https://the-internet.herokuapp.com/dynamic_loading/1");

        webDriver.findElement(By.cssSelector("[id='start'] button")).click();

        Wait<WebDriver> wait = new org.openqa.selenium.support.ui
                .FluentWait<WebDriver>(webDriver)
                .withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofSeconds(3))
                .ignoring(NoSuchElementException.class);


        WebElement foo = wait.until(new Function<WebDriver, WebElement>() {
            @Override
            public WebElement apply(WebDriver driver) {

                if (webDriver.findElement(By.cssSelector("[id='finish'] h4")).isDisplayed()){

                    return webDriver.findElement(By.cssSelector("[id='finish'] h4"));
                }else {
                    return null;
                }


            }
        });


        System.out.println(webDriver.findElement(By.cssSelector("[id='finish'] h4")).getText());


    }


}
