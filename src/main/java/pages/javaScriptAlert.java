package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class javaScriptAlert {
	WebDriver driver;

    // Constructor
    public javaScriptAlert(WebDriver driver) {
        this.driver = driver;
    }
    
    // Locators
    By javaScriptAlert = By.linkText("JavaScript Alerts");
    
//Action 
    public void clickOnJavaScriptAlert() {
        driver.findElement(javaScriptAlert).click();
    }

}
