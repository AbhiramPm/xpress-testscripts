package tes;


import java.util.concurrent.TimeoutException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Mems {

	public static <WebDriver> void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "C:\\Users\\ahbiram\\Downloads\\geckodriver-v0.33.0-win64\\geckodriver.exe");

        // Create a new instance of the FirefoxDriver
        FirefoxDriver driver = new FirefoxDriver();
        try {
            // Open the BlazeMeter registration link
            driver.get("https://auth.blazemeter.com/auth/realms/blazect/protocol/openid-connect/registrations?client_id=account&response_type=code&redirect_uri=https%3A%2F%2Fauth.blazemeter.com%2Fauth%2Frealms%2Fblazect%2Fprotocol%2Fsaml%2Fclients%2Fblazemeter#/");

            for (int i = 1; i <= 20; i++) {
                // Generate unique user details for each iteration
                String firstName = "User" + i;
                String lastName = "Last" + i;
                String email = generateRandomEmail(); // Valid random email address
                String company = "Company" + i;

                // Fill in the registration form
                WebElement firstNameField = driver.findElement(By.id("firstName"));
                WebElement lastNameField = driver.findElement(By.id("lastName"));
                WebElement emailField = driver.findElement(By.id("email"));
                WebElement companyField = driver.findElement(By.id("user.attributes.company"));
                WebElement submitButton = driver.findElement(By.id("kc-register"));

                firstNameField.sendKeys(firstName);
                lastNameField.sendKeys(lastName);
                emailField.sendKeys(email);
                companyField.sendKeys(company);

                // Click the submit button
                submitButton.click();

                // Check the next page for successful registration
                WebDriverWait wait = new WebDriverWait(driver, 20); // Increase the wait time if needed
                WebElement nextPageHeader = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[3]/div/div/div[1]/h1")));
				if (nextPageHeader.getText().equals("Registration Successful")) {
				    // Close the alert box
				    WebElement closeButton = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/button/span"));
				    closeButton.click();

				    // Logout
				    WebElement dropdown = driver.findElement(By.xpath("/html/body/div[1]/div/header/bzm-header//div/div[2]/dropdown-menu/div/div"));
				    dropdown.click();

				    WebElement logoutOption = driver.findElement(By.xpath("/html/body/div[1]/div/header/bzm-header//div/div[2]/dropdown-menu/div/ul/li[2]/a"));
				    logoutOption.click();

				    // Go back to the registration page for the next user
				    driver.get("https://auth.blazemeter.com/auth/realms/blazect/protocol/openid-connect/registrations?client_id=account&response_type=code&redirect_uri=https%3A%2F%2Fauth.blazemeter.com%2Fauth%2Frealms%2Fblazect%2Fprotocol%2Fsaml%2Fclients%2Fblazemeter#/");
				} else {
				    System.out.println("User " + i + " registration failed");
				}
            }

        } finally {
            // Close the browser window
            driver.quit();
        }
    }

    private static String generateRandomEmail() {
        return "user" + System.currentTimeMillis() + "@example.com";
    }
	}

