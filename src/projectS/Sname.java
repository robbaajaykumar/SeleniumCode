package projectS;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Sname {
	
	
	public static void main(String[] args) throws InterruptedException {
	
	WebDriver driver = new ChromeDriver();
	
	System.out.println("Step 1 :navigate to gmail");
	
	driver.get("https://www.gmail.com");
	
	driver.manage().window().maximize();
	
	System.out.println("Gmail info");
	
	// getting page title
	
	String gmailTitle = driver.getTitle();
	
	System.out.println("Page tile" + gmailTitle);
	
	
	//capture the current URL
	
	
	String gmailUrl = driver.getCurrentUrl();
	System.out.println("Current URL" + gmailUrl);
	
	
	// using navigate method
	
	driver.navigate().to("https://www.google.com");
	
	System.out.println("New Tile " + driver.getTitle());
	
	
	//back and farward button
	
	
	driver.navigate().back();
	System.out.println("Back is clicked" + driver.getTitle());
	
	
	Thread.sleep(3000);
	
	driver.navigate().forward();
	
	System.out.println("farward is clicked" + driver.getTitle());
	
	
	driver.navigate().refresh();
	
	
	System.out.println("Page Sorce Length:" + driver.getPageSource().length());
	System.out.println("Page Source is "+ driver.getPageSource());
	
	driver.quit();
	
	
	
	
	
	
	
	
	
	
	
	
	
    }


}
