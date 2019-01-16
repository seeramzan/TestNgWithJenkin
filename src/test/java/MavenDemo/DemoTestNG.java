package MavenDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DemoTestNG {
	public WebDriver driver ;
	String BaseURL = "https://google.com";

    @BeforeTest
    public void beforeTest() {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\Muahmad\\Downloads\\Jira Data\\TestAssets\\ChromeDriver\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(BaseURL);

    }

    @Test
	public void googleSearch() {
		// launch the firefox browser and open the application url


		WebElement searchbox = driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));




		searchbox.sendKeys("hello google");

        WebElement btnSearch = driver.findElement(By.xpath("//div[@class='FPdoLc VlcLAe']//input[@name='btnK']"));

        btnSearch.click();


// close the web browser
		driver.close();
	}
}
