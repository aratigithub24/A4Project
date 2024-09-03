package StepDefinationFile;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class HomeStepDefination 
{
	static WebDriver driver = null;
	@Given("username and password and perform login operation")
	public void username_and_password_and_perform_login_operation() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.manage().window().maximize();
	    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	    driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin",Keys.TAB, "admin123", Keys.ENTER);
	    
	}
	
	@Given("Dashboard name should be displayed")
	public void dashboard_name_should_be_displayed() {
		String EXPECTED ="Dashboard";
		String ACTUAL =driver.findElement(By.xpath("//h6[text()='Dashboard']")).getText();
		Assert.assertEquals(ACTUAL,EXPECTED);
		System.out.println("Assertion successfull !!");	
	}
	    
	@When("click on Admin")
	public void click_on_admin() {
		driver.findElement(By.xpath("//span[text()='Admin']")).click();
	   
	}
	
	@When("click on Pim")
	public void click_on_pim() {
		driver.findElement(By.xpath("//span[text()='PIM']")).click();
	   
	}

}










