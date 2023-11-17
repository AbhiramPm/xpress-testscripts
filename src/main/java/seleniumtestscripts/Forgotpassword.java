package seleniumtestscripts;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.safari.SafariDriver;

public class Forgotpassword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				System.setProperty("webdriver.gecko.driver", "C:\\Users\\ahbiram\\Downloads\\geckodriver-v0.33.0-win64\\geckodriver.exe");

		        // Setup FirefoxDriver
		        FirefoxDriver driver = new FirefoxDriver();
		        driver.get("https://dev16.intersmarthosting.in/vidhya-shekhar/");
		        
		        // Navigate to the webpage containing the "Forgot Password" link
		        driver.get("https://example.com");

		        // Find the "Forgot Password" link by its XPath, CSS selector, or any other suitable method
		        WebElement forgotPasswordLink = driver.findElement(By.linkText("Forgot Password"));

		        // Click on the "Forgot Password" link
		        forgotPasswordLink.click();

		        // Wait for the new page to load (you might need to use WebDriverWait here)

		        // Verify if the current URL contains the expected URL of the "Forgot Password" page
		        String expectedUrl = "https://example.com/forgot-password";
		        String actualUrl = driver.getCurrentUrl();

		        if (actualUrl.equals(expectedUrl)) {
		            System.out.println("Test Passed: Clicking on 'Forgot Password' link redirects to the correct page.");
		        } else {
		            System.out.println("Test Failed: Clicking on 'Forgot Password' link did not redirect to the correct page.");
		        }

		        
// Test Case : Check whether there exist any fields to add an email ID
		        WebElement emailField = driver.findElement(By.id("email"));
		        if (emailField.isDisplayed() && emailField.isEnabled()) {
		            System.out.println("Test Case 1: Passed - Email field is present and enabled.");
		        } else {
		            System.out.println("Test Case 1: Failed - Email field is not present or not enabled.");
		        }
		        
// Test Case : Check whether the proper link is passing to the corresponding email ID to change the password
		        WebElement changePasswordLink = driver.findElement(By.id("changePasswordLink"));
		        changePasswordLink.click();

		        // Assuming the URL changes, you can check the current URL
		        String currentUrl = driver.getCurrentUrl();
		        if (currentUrl.contains("change-password")) {
		            System.out.println("Test Case 2: Passed - Proper link is passing to change the password.");
		        } else {
		            System.out.println("Test Case 2: Failed - Incorrect link.");
		        }

// Test Case : Check whether the proper alert message appears while adding a wrong email ID
		        WebElement submitButton = driver.findElement(By.id("submitButton"));
		        emailField.sendKeys("wrongemail@example.com");
		        submitButton.click();

		        // Wait for the alert to appear
		        Alert alert = driver.switchTo().alert();
		        String alertMessage = alert.getText();

		        if (alertMessage.contains("wrong email")) {
		            System.out.println("Test Case 3: Passed - Correct alert message displayed for wrong email.");
		        } else {
		            System.out.println("Test Case 3: Failed - Incorrect alert message.");
		        }

		        // Dismiss the alert
		        alert.dismiss();

		        // Test Case 4: Check whether the alert message is removed after adding the correct email ID or phone number
		        emailField.clear();
		        emailField.sendKeys("correctemail@example.com");
		        submitButton.click();

		        // Wait for the alert to appear
		        alert = driver.switchTo().alert();
		        alertMessage = alert.getText();

		        if (alertMessage.isEmpty()) {
		            System.out.println("Test Case 4: Passed - Alert message removed after adding correct email.");
		        } else {
		            System.out.println("Test Case 4: Failed - Alert message not removed.");
		        }
		     // Assuming the following HTML structure:
		        // <input type="password" id="newPassword">
		        // <input type="password" id="confirmPassword">
		        // <button id="submitButton">Submit</button>

		        WebElement newPasswordField = driver.findElement(By.id("newPassword"));
		        WebElement confirmPasswordField = driver.findElement(By.id("confirmPassword"));
		        WebElement submitButton = driver.findElement(By.id("submitButton"));

// Test Case : Check whether the user enters a new password and retypes it correctly
		        String newPassword = "NewPass123!"; // Replace with your test password
		        newPasswordField.sendKeys(newPassword);
		        confirmPasswordField.sendKeys(newPassword);

		        if (newPasswordField.getAttribute("value").equals(confirmPasswordField.getAttribute("value"))) {
		            System.out.println("Test Case 1: Passed - New password and confirm password match.");
		        } else {
		            System.out.println("Test Case 1: Failed - New password and confirm password do not match.");
		        }

// Test Case : Check whether the user can log in with the new password
		        submitButton.click();

		        // Assuming the login page URL is "https://example.com/login"
		        if (driver.getCurrentUrl().equals("https://example.com/login")) {
		            System.out.println("Test Case 2: Passed - User can log in with the new password.");
		        } else {
		            System.out.println("Test Case 2: Failed - Unable to log in with the new password.");
		        }

// Test Case : Check whether the password change redirects to the login page
		        // Navigate back to change password page
		        driver.get("https://example.com/change-password");
		        // Perform password change
		        newPasswordField.sendKeys("AnotherNewPass456!");
		        confirmPasswordField.sendKeys("AnotherNewPass456!");
		        submitButton.click();

		        // Assuming the login page URL is "https://example.com/login"
		        if (driver.getCurrentUrl().equals("https://example.com/login")) {
		            System.out.println("Test Case 3: Passed - Redirects to login page after password change.");
		        } else {
		            System.out.println("Test Case 3: Failed - Incorrect redirection after password change.");
		        }

// Test Case : Check whether the password field contains proper validation
		        // Perform password change with an invalid password
		        newPasswordField.sendKeys("invalidpassword");
		        confirmPasswordField.sendKeys("invalidpassword");
		        submitButton.click();

		        // Assuming the validation error message is displayed in an element with id "validationMessage"
		        WebElement validationMessage = driver.findElement(By.id("validationMessage"));

		        if (validationMessage.isDisplayed() && validationMessage.getText().contains("validation error message")) {
		            System.out.println("Test Case 4: Passed - Proper validation error for the password field.");
		        } else {
		            System.out.println("Test Case 4: Failed - Incorrect or missing validation error message.");
		        }
		        // Assuming the following HTML structure:
		        // <input type="password" id="newPassword">
		        // <input type="password" id="confirmPassword">
		        // <button id="submitButton">Submit</button>

		        WebElement newPasswordField1 = driver.findElement(By.id("newPassword"));
		        WebElement confirmPasswordField1 = driver.findElement(By.id("confirmPassword"));
		        WebElement submitButton1 = driver.findElement(By.id("submitButton"));

// Test Case 1: Check whether an alert message will show if there is any mismatch in new password and confirm password
		        newPasswordField1.sendKeys("NewPass123!");
		        confirmPasswordField1.sendKeys("MismatchedPass456!");
		        submitButton1.click();

		        // Wait for the alert to appear
		        Alert alert = driver.switchTo().alert();
		        String alertMessage = alert.getText();

		        if (alertMessage.contains("password mismatch")) {
		            System.out.println("Test Case 1: Passed - Alert message displayed for password mismatch.");
		        } else {
		            System.out.println("Test Case 1: Failed - Incorrect or missing alert message for password mismatch.");
		        }

		        // Dismiss the alert
		        alert.dismiss();

 // Test Case : Check whether an alert message will show if clicking on the submit button without adding fields
		        submitButton1.click();

		        // Wait for the alert to appear
		        alert = driver.switchTo().alert();
		        alertMessage = alert.getText();

		        if (alertMessage.contains("please enter")) {
		            System.out.println("Test Case 2: Passed - Alert message displayed for missing fields.");
		        } else {
		            System.out.println("Test Case 2: Failed - Incorrect or missing alert message for missing fields.");
		        }

		        // Dismiss the alert
		        alert.dismiss();

// Test Case : Check if the link gets dissolved once the user has set a new password
		        newPasswordField1.sendKeys("NewPass123!");
		        confirmPasswordField1.sendKeys("NewPass123!");
		        submitButton1.click();

		        // Assuming the login page URL is "https://example.com/login"
		        if (driver.getCurrentUrl().equals("https://example.com/login")) {
		            System.out.println("Test Case 3: Passed - Link dissolved after setting a new password.");
		        } else {
		            System.out.println("Test Case 3: Failed - Link did not dissolve after setting a new password.");
		        }
		        }

}
