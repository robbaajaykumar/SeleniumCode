package projectS;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class E2E_Assignment2 {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        try {

            // Open Browser
            driver.manage().window().maximize();
            driver.get("https://www.demoblaze.com/index.html");

            // Login
            driver.findElement(By.id("login2")).click();

            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("loginusername")));

            driver.findElement(By.id("loginusername")).sendKeys("ajaybabu");
            driver.findElement(By.id("loginpassword")).sendKeys("251201");

            driver.findElement(By.xpath("//button[text()='Log in']")).click();

            Thread.sleep(5000);

            // Products to Add
            String[] products = {
                    "Samsung galaxy s6",
                    "Nexus 6",
                    "Sony xperia z5"
            };

            // Loop Through Products
            for (String product : products) {

                wait.until(ExpectedConditions.elementToBeClickable(
                        By.linkText(product))).click();

                wait.until(ExpectedConditions.elementToBeClickable(
                        By.linkText("Add to cart"))).click();

                wait.until(ExpectedConditions.alertIsPresent());
                driver.switchTo().alert().accept();

                Thread.sleep(2000);

                // Return to Home Page
                driver.findElement(By.id("nava")).click();

                wait.until(ExpectedConditions.visibilityOfElementLocated(
                        By.linkText("Samsung galaxy s6")));

                Thread.sleep(2000);
            }

            // Open Cart
            driver.findElement(By.id("cartur")).click();

            wait.until(ExpectedConditions.elementToBeClickable(
                    By.xpath("//button[text()='Place Order']"))).click();

            // Fill Order Form
            driver.findElement(By.id("name")).sendKeys("Ajay");
            driver.findElement(By.id("country")).sendKeys("India");
            driver.findElement(By.id("city")).sendKeys("Hyderabad");
            driver.findElement(By.id("card")).sendKeys("1234567890123456");
            driver.findElement(By.id("month")).sendKeys("June");
            driver.findElement(By.id("year")).sendKeys("2026");

            // Purchase
            driver.findElement(By.xpath("//button[text()='Purchase']")).click();

            // Verify Success Message
            wait.until(ExpectedConditions.visibilityOfElementLocated(
                    By.cssSelector(".sweet-alert")));

            String message = driver.findElement(
                    By.cssSelector(".sweet-alert h2")).getText();

            System.out.println("Purchase Status: " + message);

            Thread.sleep(5000);

        } finally {

            driver.quit();
        }
    }
}