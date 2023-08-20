package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class UpdatedDropDowns {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\Ladi\\Desktop\\chromedriver-win64\\chromedriver.exe");

        ChromeOptions opt = new ChromeOptions();
        opt.addArguments("--remote-allow-origins=*");
        WebDriver webDriver = new ChromeDriver(opt);
        webDriver.manage().window().maximize();
        webDriver.get("https://spicejet.com");
        webDriver.findElement(By.xpath("(//div[@class='css-1dbjc4n'])[57]")).click();
        Thread.sleep(2000);


        System.out.println(webDriver.findElement(By.xpath("(//div[@class='css-1dbjc4n'])[57]")).getText());
        int i = 1;
        while (i<5){
            webDriver.findElement(By.xpath("//div[@class='css-1dbjc4n r-k8qxaj r-d9fdf6']//div[1]//div[2]//div[3]")).click();
            i++;
        }
        Thread.sleep(2000);


        for (int j = 0; j < 5; j++) {
            webDriver.findElement(By.xpath("(//*[name()='svg'][@data-testid='svg-img'])[20]")).click();
        }

        System.out.println(webDriver.findElement(By.xpath("(//div[@class='css-1dbjc4n'])[57]")).getText());

        Thread.sleep(2000);
        webDriver.findElement(By.cssSelector(".css-1dbjc4n.r-1awozwy.r-19m6qjp.r-z2wwpe.r-1loqt21.r-18u37iz.r-1777fci.r-d9fdf6.r-1w50u8q.r-ah5dr5.r-1otgn73")).click();
        Thread.sleep(2000);
        webDriver.close();



    }
}
