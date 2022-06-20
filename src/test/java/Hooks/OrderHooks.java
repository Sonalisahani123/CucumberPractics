package Hooks;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;

public class OrderHooks {
	
	@Before("@smoke")
	public void setup_browser()
	{
		System.out.println("setup chrome browser");
		int i=10/0;
	}

	/*
	 * @Before(order=2) public void setup_URL() {
	 * System.out.println("set up the application "); }
	 */
	@After("@smoke")
	public void tearDown_browser()
	{
		System.out.println("close the browser");
	}
	
	/*
	 * @After(order=1) public void tearDown_URL() {
	 * System.out.println("close the application"); }
	 * 
	 * @BeforeStep public void takeScreenshot() {
	 * System.out.println("take the screen shot"); }
	 * 
	 * @AfterStep public void refreshPage() {
	 * System.out.println("refresh the page"); }
	 */
}
