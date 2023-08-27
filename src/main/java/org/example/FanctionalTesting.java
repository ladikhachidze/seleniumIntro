package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

public class FanctionalTesting {

    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver","C:\\Users\\Ladi\\Desktop\\chromedriver-win64\\chromedriver.exe");

        ChromeOptions opt = new ChromeOptions();
        opt.addArguments("--remote-allow-origins=*");
        WebDriver webDriver = new ChromeDriver(opt);
        webDriver.manage().window().maximize();
        webDriver.get("https://rahulshettyacademy.com/seleniumPractise/");



        Thread.sleep(3000);

        WebDriverWait w = new WebDriverWait(webDriver,Duration.ofSeconds(5));

        String[] itemsNeeded= {"Cucumber","Brocolli","Beetroot"};

        addItems(webDriver,itemsNeeded);

        webDriver.findElement(By.cssSelector("img[alt='Cart']")).click();

        webDriver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();

        w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input.promoCode")));



        webDriver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");

        webDriver.findElement(By.cssSelector("button.promoBtn")).click();

//explicit wait



        w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));

        System.out.println(webDriver.findElement(By.cssSelector("span.promoInfo")).getText());

    }

    public static  void addItems(WebDriver driver,String[] itemsNeeded){

        int j=0;

        List<WebElement> products= driver.findElements(By.cssSelector("h4.product-name"));

        for(int i=0;i<products.size();i++) {


            String[] name=products.get(i).getText().split("-");

            String formattedName=name[0].trim();



            List itemsNeededList = Arrays.asList(itemsNeeded);

            if(itemsNeededList.contains(formattedName)) {

                j++;



                driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();

                if(j==itemsNeeded.length) {

                    break;

                }
            }
        }
    }
}
