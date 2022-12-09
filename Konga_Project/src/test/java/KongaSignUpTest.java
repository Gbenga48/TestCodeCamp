
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

import java.time.Duration;

public class KongaSignUpTest {
    private WebDriver driver;
    @test
    public void setup(){
        System.setProperty("webdriver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        // 1. open selected app URL
        driver.get("https://www.konga.com/");
        Thread.sleep( Duration.ofMillis(): 1000)
        //2. maximize the window
        driver.manage().window().maximize();
        //3. Get the page title
        driver.findElement(By.xpath("//*[@id=\"app-content-wrapper\"]/nav/div[1]/div[1]/a[2]/picture/img"));
        // 4. Click on the sign-in/log in button
        driver.findElement(By.xpath("//*[@id=\"app-content-wrapper\"]/nav/div[2]/div/div[1]/div[1]/a")).click();
        // 5. Input your email address
        driver.findElement(By.id("username")).sendkeys("gneskyyleeh48");
        //6. Input your password
        driver.findElement(By.id("password")).sendkeys("Gnesky99");
        // 7. Click on the Sign in/login/Continue button
        driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div/div/div/div[1]/form/div[3]/button")).click;
        Thread.sleep( Millis(): 10000)
        // 8. Logout from the account
        driver.findElement(By.xpath("//*[@id=\"app-content-wrapper\"]/nav/div[2]/div/div[4]/a[2]")).click;
        // 9.Quit the browser
        driver.quit();
        }
        @AfterTest
        public void closeBrowser(){
            //Quit the browser
            driver.quit();

        }
}
