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

public class Headermenu {

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
		        // <div class="header-menu" id="home">Home</div>
		        // <div class="header-menu" id="about">About</div>
		        // <div class="header-menu" id="contact">Contact</div>

 // Test Case 1: Check whether a color change occurs while selecting each header menu
		        WebElement homeMenu = driver.findElement(By.id("home"));
		        WebElement aboutMenu = driver.findElement(By.id("about"));
		        WebElement contactMenu = driver.findElement(By.id("contact"));

		        // Get the default color of the menus
		        String defaultColor = homeMenu.getCssValue("color");

		        // Click on each menu and check if the color changes
		        homeMenu.click();
		        String homeMenuColor = homeMenu.getCssValue("color");

		        aboutMenu.click();
		        String aboutMenuColor = aboutMenu.getCssValue("color");

		        contactMenu.click();
		        String contactMenuColor = contactMenu.getCssValue("color");

		        if (!homeMenuColor.equals(defaultColor) && !aboutMenuColor.equals(defaultColor)
		                && !contactMenuColor.equals(defaultColor)) {
		            System.out.println("Test Case 1: Passed - Color changes while selecting each header menu.");
		        } else {
		            System.out.println("Test Case 1: Failed - Color does not change for header menus.");
		        }

 // Test Case 2: Check whether the page URL does not contain the correct page title
		        String expectedTitle = "Incorrect Title";
		        if (!driver.getTitle().contains(expectedTitle)) {
		            System.out.println("Test Case 2: Passed - Page URL does not contain the correct page title.");
		        } else {
		            System.out.println("Test Case 2: Failed - Page URL contains the correct page title.");
		        }

 // Test Case 3: Check whether clicking on the header menus redirects to the correct pages
		        homeMenu.click();
		        if (driver.getCurrentUrl().equals("https://example.com/home")) {
		            System.out.println("Test Case 3: Passed - Redirects to the correct Home page.");
		        } else {
		            System.out.println("Test Case 3: Failed - Incorrect redirection for Home page.");
		        }

		        aboutMenu.click();
		        if (driver.getCurrentUrl().equals("https://example.com/about")) {
		            System.out.println("Test Case 3: Passed - Redirects to the correct About page.");
		        } else {
		            System.out.println("Test Case 3: Failed - Incorrect redirection for About page.");
		        }

		        contactMenu.click();
		        if (driver.getCurrentUrl().equals("https://example.com/contact")) {
		            System.out.println("Test Case 3: Passed - Redirects to the correct Contact page.");
		        } else {
		            System.out.println("Test Case 3: Failed - Incorrect redirection for Contact page.");
		        }

 // Test Case 4: Check whether clicking on the header menus shows the correct meta title
		        String homeMetaTitle = driver.findElement(By.id("metaTitleHome")).getText();
		        String aboutMetaTitle = driver.findElement(By.id("metaTitleAbout")).getText();
		        String contactMetaTitle = driver.findElement(By.id("metaTitleContact")).getText();

		        if (homeMetaTitle.equals("Home Meta Title") && aboutMetaTitle.equals("About Meta Title")
		                && contactMetaTitle.equals("Contact Meta Title")) {
		            System.out.println("Test Case 4: Passed - Correct meta titles displayed for header menus.");
		        } else {
		            System.out.println("Test Case 4: Failed - Incorrect or missing meta titles for header menus.");
		        }

// Test Case 5: Check whether there exists an option for changing the language
		        WebElement languageDropdown = driver.findElement(By.id("languageDropdown"));

		        if (languageDropdown.isDisplayed()) {
		            System.out.println("Test Case 5: Passed - Option for changing the language exists.");
		        } else {
		            System.out.println("Test Case 5: Failed - Option for changing the language is missing.");
		        }

		        }

}
