package StepDefinationFile;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class HookClass 
{
	@Before("@Smoke")
	public void precondition()
	{
		System.out.println("pre condition pass");
	}
	
	@After("@Smoke")
	public void postcondition()
	{
		System.out.println("post condition pass");
	}
	
}
