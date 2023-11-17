package seleniumtestscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Filters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\ahbiram\\Downloads\\geckodriver-v0.33.0-win64\\geckodriver.exe");

        // Create a new instance of the FirefoxDriver
        FirefoxDriver driver = new FirefoxDriver();
        driver.get("https://dev16.intersmarthosting.in/vidhya-shekhar/");

        try {
            // Test Filtering Results
            WebElement filterElement = driver.findElement(By.id("filterElementId"));
            // Perform actions to interact with filter elements
            // ...

            // Test Error Handling
            WebElement submitButton = driver.findElement(By.id("submitButtonId"));
            submitButton.click();

            WebDriverWait wait = new WebDriverWait(driver, 10);
            WebElement errorMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("errorMessageId")));
            // Assert or perform actions based on the error message
            // ...

            // Test Validation Messages
            WebElement invalidFilterElement = driver.findElement(By.id("invalidFilterElementId"));
            invalidFilterElement.sendKeys("invalidValue");

            submitButton.click();

            WebElement validationMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("validationMessageId")));
            // Assert or perform actions based on the validation message
            // ...

            // Test Sliding Bars
            WebElement slider1 = driver.findElement(By.id("slider1"));
            WebElement slider2 = driver.findElement(By.id("slider2"));
            // Perform actions to interact with the sliding bars and assert conditions
            // ...

        } finally {
            // Close the browser window
            driver.quit();
        }
	}
	
	

}
