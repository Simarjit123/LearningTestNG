import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class LearnTestNg {

	@BeforeMethod
	public void beforeExecutingclass(){
		System.out.println("Before Class");
	}
	
	@BeforeTest
	public void openBrowser() {
		System.out.println("Opening browser");
	}

	@Test(priority = 1)
	public void printHelloWorld() {
		System.out.println("Hello World");
		Assert.fail();
	}
	
	@Test(priority = 2,dependsOnMethods = "printHelloWorld")
	public void printHelloSimar() {
		System.out.println("Hello Simar");
	}
	
	@Test(priority = 3)
	public void printHelloNeeru() {
		System.out.println("Hello Neeru");
	}
	
	@AfterMethod
	public void closeBrowser() {
		System.out.println("Closing browser");
	}
	
	@AfterMethod
	public void closeBrowser1() {
		System.out.println("Closing browser1");
	}
}
