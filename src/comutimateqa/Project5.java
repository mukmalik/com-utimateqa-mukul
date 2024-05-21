package comutimateqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Project5 {

    public static void main(String[] args) {

        String str = "https://courses.ultimateqa.com/";
        // 1. setup the browser
        WebDriver webDr = new ChromeDriver();

        // 2. open url
        webDr.get(str);

        // 3. print the title of the page
        System.out.println("Print title of the page :\t"+webDr.getTitle());

        // 4. print the current url
        System.out.println("Print current url :\t"+webDr.getCurrentUrl());

        // 5. print the page source
        System.out.println("Print the page source :\t"+webDr.getPageSource());

        // 6. click on 'sign in' link
        webDr.findElement(By.linkText("Sign In")).click();

        // 7. Print the current url
        System.out.println("Print current url :\t"+webDr.getCurrentUrl());

        // 8. Enter the email to email field
        WebElement emEl = webDr.findElement(By.id("user[email]"));
        emEl.sendKeys("myemail@email.com");

        // 9. Enter password to password field
        WebElement passEl = webDr.findElement(By.id("user[password]"));
        passEl.sendKeys("password123");

        // 10. Click on login button
        WebElement but =  webDr.findElement(By.cssSelector("button[class='button button-primary g-recaptcha']"));
        but.click();

        webDr.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        // 11. navigate to base url
       webDr.get(str);

       // 12. navigate forward to homepage
        webDr.navigate().forward();

        webDr.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));


        // 13. navigate back to base url
        webDr.navigate().back();

        webDr.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));


        // 14. refresh the page
        webDr.navigate().refresh();


        // 15. close the browser
        webDr.close();






    }
}
