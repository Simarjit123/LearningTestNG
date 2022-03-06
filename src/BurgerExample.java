import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BurgerExample {

	@BeforeTest
	public void orderBurger() {
		System.out.println("Burger ordered");
	}

	@Test(priority = 1)
	public void setBurgerTypeVeg() {
		System.out.println("Beyond burger");
	}

	@Test(priority = 3, dependsOnMethods = "setBurgerTypeVeg")
	public void addCheese() {
		System.out.println("Add cheese to burger");
	}

	@Test(priority = 2)
	public void makeBurger() {
		System.out.println("Burger is being made");
	}

	@AfterMethod
	public void payAndTakeFood() {
		System.out.println("Food is picked");
	}
}
