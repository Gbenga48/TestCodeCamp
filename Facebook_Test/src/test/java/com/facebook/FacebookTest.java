package com.facebook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogInTest {
    private WebDriver driver;
    public void setup(){
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver_win32.zip");
        driver = new ChromeDriver();
        driver.get("");
        long millis;
        Thread.sleep( millis: 10000);
        driver.manage().window().maximize();
        //
        driver.findElement(By.xpath("//*[@id=\"u_0_0_cr\"]")).click();
        //
        driver.findElement(By.id("email")).sendkeys("gneskyyleeh48");
        //
        driver.findElement(By.id("pass")).sendkeys("micheal45");
        //
        driver.findElement(By.id("u_0_5_vG")).click;
        Thread.sleep( millis: 10000);
        driver.findElement(By.xpath("//*[@id=\"mount_0_0_8O\"]/div/div[1]/div/div[2]/div[3]/div[2]/div/div[2]/div[1]/div[1]/div/div/div/div/div/div/div/div/div[1]/div/div/div[1]/div[2]/div/div[5]/div/div[1]/div[2]/div/div/div/div/span")).click;
}