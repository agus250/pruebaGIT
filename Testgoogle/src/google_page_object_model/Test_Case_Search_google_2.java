package google_page_object_model;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.ClickAction;

public class Test_Case_Search_google_2 {
	
	private WebDriver driver;
	Object_layer object_layer;
	Utilities Utilities;
	
	
	
	@Before
	public void setUp () {
		Utilities = new Utilities(driver);
		driver = Utilities.Chromedriver();
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
		object_layer = new Object_layer(driver);
	}
	
	
	@Test
	public void test() throws InterruptedException  {
	
	object_layer.First_suggestion();
	Thread.sleep(2000);
	object_layer.click_search_button();
	Thread.sleep(2000);
	object_layer.click_first_result();
	Thread.sleep(2000);

	}
	
	@After
	public void teardown() {
		driver.quit();
	}
	

}