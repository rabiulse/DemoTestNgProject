package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class checkbox {
	
	 WebDriver driver;

	    // Constructor
	    public checkbox(WebDriver driver) {
	        this.driver = driver;
	    }
	    
	 // Locators
	    By checkboxLink = By.linkText("Checkboxes");
	    By click1stCheckbox= By.xpath("//*[@id=\"checkboxes\"]/input[1]");
	    
	    
	 // Actions
	    

	    public void clickCheckBox() {
	        driver.findElement(checkboxLink).click();
	    }
	    
	    public void clickfirstcheckbox() {
	    	
	    	driver.findElement(click1stCheckbox).click();
	    }
	    

}
