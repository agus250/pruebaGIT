package google_page_object_model;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Utilities {

	public WebDriver driver;
		
		public Utilities(WebDriver driver) {
			this.driver = driver;
		}

	public WebDriver Chromedriver() {	
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/driverV1/chromedriver.exe");
		driver = new ChromeDriver();
		return driver;
	}

	public WebElement findElement(By locator) {
		return driver.findElement(locator);
	}
	
	public List<WebElement> FindElements(By locator){
		return driver.findElements(locator);
	}
	
	public void type(String inputText, By locator) {
		driver.findElement(locator).sendKeys(inputText);
	}
	public void type_Escape(By locator) {
		driver.findElement(locator).sendKeys(Keys.ESCAPE);
	}
	
	public void type_Enter(By locator) {
		driver.findElement(locator).sendKeys(Keys.ENTER);
	}
	
	public void click(By locator) {
		driver.findElement(locator).click();
	}
	public void type_ArrowDown(By locator) {
		driver.findElement(locator).sendKeys(Keys.ARROW_DOWN);
	}
}