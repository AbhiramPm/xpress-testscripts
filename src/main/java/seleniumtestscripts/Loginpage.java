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

public class Loginpage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				System.setProperty("webdriver.gecko.driver", "C:\\Users\\ahbiram\\Downloads\\geckodriver-v0.33.0-win64\\geckodriver.exe");

		        // Setup FirefoxDriver
		        FirefoxDriver driver = new FirefoxDriver();
		        driver.get("https://dev16.intersmarthosting.in/vidhya-shekhar/");
		        
		        // Navigate to the webpage containing the "Forgot Password" link
		        driver.get("https://example.com");

		     // Assuming the following HTML structure:
		        // <input type="text" id="username">
		        // <input type="password" id="password">
		        // <button id="loginButton">Login</button>

		        WebElement usernameField = driver.findElement(By.id("username"));
		        WebElement passwordField = driver.findElement(By.id("password"));
		        WebElement loginButton = driver.findElement(By.id("loginButton"));

// Test Scenario 1: Successful Login
		        usernameField.sendKeys("validUsername");
		        passwordField.sendKeys("validPassword");
		        loginButton.click();
		        // Add verification for successful login, for example, check if the user is redirected to the home page

 // Test Scenario 2: Unsuccessful Login for an unregistered user
		        usernameField.clear();
		        passwordField.clear();
		        usernameField.sendKeys("unregisteredUser");
		        passwordField.sendKeys("somePassword");
		        loginButton.click();
		        // Add verification for unsuccessful login, for example, check for an error message

// Test Scenario 3: Check response with a valid username and an empty password
		        usernameField.clear();
		        passwordField.clear();
		        usernameField.sendKeys("validUsername");
		        loginButton.click();
		        // Add verification for unsuccessful login, for example, check for an error message

 // Test Scenario 4: Check response with an empty username and a valid password
		        usernameField.clear();
		        passwordField.clear();
		        passwordField.sendKeys("validPassword");
		        loginButton.click();
		        // Add verification for unsuccessful login, for example, check for an error message

// Test Scenario 5: Check response with an empty username and an empty password
		        usernameField.clear();
		        passwordField.clear();
		        loginButton.click();
		        // Add verification for unsuccessful login, for example, check for an error message

// Test Scenario 6: Ensure the password is displayed in an encrypted format
		        // This might not be directly verifiable in the UI due to security reasons.

// Test Scenario 7: Check if the login function handles case sensitivity
		        usernameField.clear();
		        passwordField.clear();
		        usernameField.sendKeys("CaseSensitiveUser");
		        passwordField.sendKeys("caseSensitivePassword");
		        loginButton.click();
		        // Add verification for successful or unsuccessful login based on case sensitivity
		        WebElement usernameField = driver.findElement(By.id("username"));
		        WebElement passwordField = driver.findElement(By.id("password"));
		        WebElement loginButton = driver.findElement(By.id("loginButton"));

// Test Scenario 8: Copy/Cut and Paste Password
		        usernameField.sendKeys("validUsername");
		        passwordField.sendKeys("validPassword");
		        String copiedPassword = passwordField.getAttribute("value");
		        passwordField.sendKeys(Keys.CONTROL + "a");
		        passwordField.sendKeys(Keys.CONTROL + "c");
		        // Paste the password on another screen
		        // Paste operation will depend on the context and cannot be automated.

 // Test Scenario 9: Verify Account Lock
		        // Account lock verification logic needs to be implemented by interacting with the backend.

// Test Scenario 10: Check if selecting the back button (after logging out) prevents the user from being signed in
		        WebElement logoutLink = driver.findElement(By.id("logoutLink"));
		        logoutLink.click();
		        driver.navigate().back();
		        // Add verification to check if the user is not signed in again

// Test Scenario 11: Verify URL without logging into the site
		        String currentUrlWithoutLogin = driver.getCurrentUrl();
		        // Add verification based on the expected URL without login

// Test Scenario 12: Automatically logout when pressing the backspace button
		        driver.navigate().back();
		        // Add verification to check if the user is logged out after pressing the backspace button

// Test Scenario 13: Check for Session Timeout
		        // Session timeout verification logic needs to be implemented by interacting with the backend.

// Test Scenario 14: Login page getting refreshed after closing the tab
		        // This behavior is browser-specific and may not be controllable through WebDriver.

// Test Scenario 15: Ensure the login page has the same design as per the Marvel app
		        // Design verification cannot be done directly through WebDriver; manual inspection is needed.

// Test Scenario 16: Check response with an invalid email ID and password
		        usernameField.clear();
		        passwordField.clear();
		        usernameField.sendKeys("invalidEmail@example.com");
		        passwordField.sendKeys("invalidPassword");
		        loginButton.click();
		        // Add verification for an expected response, such as an error message

		        }

}
