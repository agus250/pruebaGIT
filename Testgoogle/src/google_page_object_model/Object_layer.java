package google_page_object_model;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Object_layer extends Utilities {
	Utilities Utilities;
	//WEB ELEMENTS OR OBJECTS
	By textbox = By.name("q");
	By searchbutton = By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[3]/center/input[1]");
	By first_resutl = By.xpath("//*[@id=\"rso\"]/div[1]/div[1]/div/div[1]/a/h3");
	//By searchbutton= By.xpath("//input[@name =\"btnK\"]"); 
	List<WebElement> ResultEntries = driver.findElements(By.cssSelector("h3,rc"));
	
	//VARIABLES AND DATA
	String Text = ("The name of the wind");
	String Text2 = ("The name of the w");
	
	public Object_layer(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	//ACTION AND BEHAVIORS
	public void type_data() throws InterruptedException {
		
		type(Text, textbox);
		Thread.sleep(2000);
		type_Escape(textbox);		
	}
	
	public void click_search_button() {
		type_Enter(searchbutton);
	}
	
	public void click_first_result() {
		click(first_resutl);
	}
	public void First_suggestion() throws InterruptedException {
		type(Text2, textbox);
		Thread.sleep(2000);
		type_ArrowDown(textbox);
		
	}
}