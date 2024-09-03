package StepDefinationFile;

import java.time.Duration;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;

  
public class LoginStepDefination  
{	
	static WebDriver driver = null;
	@Given("Launch the browser with the given url and maximize the window")
	public void launch_the_browser_with_the_given_url_and_maximize_the_window() 
	{
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.manage().window().maximize();
	    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	
//	@Given("Provide valid username and password")
//	public void provide_valid_username_and_password() 
//	{
//		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin",Keys.TAB, "admin123");   
//	}
	
//	@Given("click on login button")
//	public void click_on_login_button()
//	{
//		driver.findElement(By.xpath("//button[text()=' Login ']")).click();
//	}
	
   /*@Given("provide valid {string} and {string}")
	 public void provide_valid_and(String username, String password) 
	 {
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(username,Keys.TAB, password);	   
	 }
   */
	
	/*@Given("Provide valid {string} and {string}")
	  public void provide_valid_and(String username, String password) 
	  {
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(username,Keys.TAB, password);	  
	  }
	*/
	
	/*@Given("Provide valid {string} and {string}")
	  public void provide_valid_and(String string, String string2, io.cucumber.datatable.DataTable dataTable) 
	  {
	    List<List<String>> data = dataTable.asLists(String.class);
	    driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(data.get(0).get(0), Keys.TAB, data.get(0).get(1));   
	  }
	*/
	
	/*OR*/
	
//	@Given("Provide valid {string} and {string}")
//	public void provide_valid_and_password(DataTable dataTable) 
//	{
//	  List<List<String>> data = dataTable.asLists(String.class);
//	  driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(data.get(0).get(0), Keys.TAB, data.get(0).get(1));
//	}
	
	@Given("Provide valid username and password")
	public void provide_valid_username_and_password(io.cucumber.datatable.DataTable dataTable) 
	{
		List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
		  driver.findElement(By.xpath("//input[@placeholder='Username']"))
		  .sendKeys(data.get(1).get("username"), Keys.TAB, data.get(1).get("password"));
	}
	    
	
	
	
	
	@Given("click on the login button")
	public void click_on_the_login_button() 
	{
		driver.findElement(By.xpath("//button[text()=' Login ']")).click();    
	}
}






















