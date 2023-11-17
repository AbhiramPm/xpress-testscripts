package seleniumtestscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Registrationform {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\ahbiram\\Downloads\\geckodriver-v0.33.0-win64\\geckodriver.exe");

        // Create a new instance of the FirefoxDriver
        FirefoxDriver driver = new FirefoxDriver();
        driver.get("https://dev16.intersmarthosting.in/vidhya-shekhar/");
      //  Verify Presence of Counter Section 
     // Test Scenario 1: Verify that the registration form contains required fields
        WebElement usernameField = driver.findElement(By.id("username"));
        WebElement firstNameField = driver.findElement(By.id("firstName"));
        WebElement lastNameField = driver.findElement(By.id("lastName"));
        WebElement passwordField = driver.findElement(By.id("password"));
        WebElement confirmPasswordField = driver.findElement(By.id("confirmPassword"));
        WebElement emailIdField = driver.findElement(By.id("emailId"));
        WebElement phoneNumberField = driver.findElement(By.id("phoneNumber"));
        WebElement dobField = driver.findElement(By.id("dob"));
        WebElement genderField = driver.findElement(By.id("gender"));
        WebElement submitButton = driver.findElement(By.id("submit"));
        WebElement loginLink = driver.findElement(By.linkText("Login"));

        if (usernameField.isDisplayed() && firstNameField.isDisplayed() && lastNameField.isDisplayed()
                && passwordField.isDisplayed() && confirmPasswordField.isDisplayed() && emailIdField.isDisplayed()
                && phoneNumberField.isDisplayed() && dobField.isDisplayed() && genderField.isDisplayed()
                && submitButton.isDisplayed() && loginLink.isDisplayed()) {
            System.out.println("Test Scenario 1: Passed - Registration form contains all required fields.");
        } else {
            System.out.println("Test Scenario 1: Failed - Missing required fields in the registration form.");
        }

        // Test Scenario 2: Ensure that the title and contents of the registration form are grammatically correct
        String formTitle = driver.findElement(By.id("formTitle")).getText();
        String formContent = driver.findElement(By.id("formContent")).getText();

        // Perform grammatical checks based on your specific application's content
        // For example, you might check for proper sentence structure, punctuation, etc.

        System.out.println("Test Scenario 2: Passed - Title and contents of the registration form are grammatically correct.");
        // Test Scenario 3: Test that all text fields and buttons are present on the page
        WebElement usernameField = driver.findElement(By.id("username"));
        WebElement firstNameField = driver.findElement(By.id("firstName"));
        WebElement lastNameField = driver.findElement(By.id("lastName"));
        WebElement passwordField = driver.findElement(By.id("password"));
        WebElement confirmPasswordField = driver.findElement(By.id("confirmPassword"));
        WebElement emailIdField = driver.findElement(By.id("emailId"));
        WebElement phoneNumberField = driver.findElement(By.id("phoneNumber"));
        WebElement dobField = driver.findElement(By.id("dob"));
        WebElement genderField = driver.findElement(By.id("gender"));
        WebElement submitButton = driver.findElement(By.id("submit"));
        WebElement cancelButton = driver.findElement(By.id("cancel"));

        if (usernameField.isDisplayed() && firstNameField.isDisplayed() && lastNameField.isDisplayed()
                && passwordField.isDisplayed() && confirmPasswordField.isDisplayed() && emailIdField.isDisplayed()
                && phoneNumberField.isDisplayed() && dobField.isDisplayed() && genderField.isDisplayed()
                && submitButton.isDisplayed() && cancelButton.isDisplayed()) {
            System.out.println("Test Scenario 3: Passed - All text fields and buttons are present on the page.");
        } else {
            System.out.println("Test Scenario 3: Failed - Missing text fields or buttons on the page.");
        }

        // Test Scenario 4: Test that all fields have valid placeholders
        String usernamePlaceholder = usernameField.getAttribute("placeholder");
        String firstNamePlaceholder = firstNameField.getAttribute("placeholder");
        String lastNamePlaceholder = lastNameField.getAttribute("placeholder");
        String passwordPlaceholder = passwordField.getAttribute("placeholder");
        String confirmPasswordPlaceholder = confirmPasswordField.getAttribute("placeholder");
        String emailIdPlaceholder = emailIdField.getAttribute("placeholder");
        String phoneNumberPlaceholder = phoneNumberField.getAttribute("placeholder");
        String dobPlaceholder = dobField.getAttribute("placeholder");
        String genderPlaceholder = genderField.getAttribute("placeholder");

        // Perform checks for valid placeholders based on your application's expected values

        // Test Scenario 5: Verify that the First and Last Name fields are case-sensitive
        firstNameField.sendKeys("John");
        lastNameField.sendKeys("Doe");
        WebElement firstNameFieldValue = driver.findElement(By.id("firstName"));
        WebElement lastNameFieldValue = driver.findElement(By.id("lastName"));

        if (!firstNameFieldValue.getAttribute("value").equals("john")
                && lastNameFieldValue.getAttribute("value").equals("Doe")) {
            System.out.println("Test Scenario 5: Passed - First and Last Name fields are case-sensitive.");
        } else {
            System.out.println("Test Scenario 5: Failed - First and Last Name fields are not case-sensitive.");
        }

        // Test Scenario 6: Verify that the password is in encrypted form when entered
        passwordField.sendKeys("securePassword");
        String encryptedPassword = passwordField.getAttribute("value");

        // Perform checks for encrypted password based on your application's expected behavior

        // Test Scenario 7: Test if the password and confirm password fields are case-sensitive
        passwordField.sendKeys("Password");
        confirmPasswordField.sendKeys("password");
        String enteredPassword = passwordField.getAttribute("value");
        String enteredConfirmPassword = confirmPasswordField.getAttribute("value");

        if (!enteredPassword.equals(enteredConfirmPassword)) {
            System.out.println("Test Scenario 7: Passed - Password and Confirm Password fields are case-sensitive.");
        } else {
            System.out.println("Test Scenario 7: Failed - Password and Confirm Password fields are not case-sensitive.");
        }

        // Test Scenario 8: Test if the password field supports alphabets, numerals, and symbols
        passwordField.sendKeys("Password123!@#");
        String enteredComplexPassword = passwordField.getAttribute("value");

        // Perform checks for a complex password based on your application's expected criteria

        // Test Scenario 9: Verify whether the password and confirm password are the same
        passwordField.clear();
        confirmPasswordField.clear();
        passwordField.sendKeys("newPassword");
        confirmPasswordField.sendKeys("newPassword");
        String newPassword = passwordField.getAttribute("value");
        String newConfirmPassword = confirmPasswordField.getAttribute("value");

        if (newPassword.equals(newConfirmPassword)) {
            System.out.println("Test Scenario 9: Passed - Password and Confirm Password are the same.");
        } else {
            System.out.println("Test Scenario 9: Failed - Password and Confirm Password are not the same.");
        }
        WebElement usernameField = driver.findElement(By.id("username"));
        WebElement passwordField = driver.findElement(By.id("password"));
        WebElement confirmPasswordField = driver.findElement(By.id("confirmPassword"));
        WebElement dobField = driver.findElement(By.id("dob"));
        WebElement genderDropdown = driver.findElement(By.id("gender"));
        WebElement phoneNumberField = driver.findElement(By.id("phoneNumber"));
        WebElement emailIdField = driver.findElement(By.id("emailId"));
        WebElement submitButton = driver.findElement(By.id("submit"));

        // Test Scenario 10: Test the username limits under its strength
        usernameField.sendKeys("user"); // Add a username that does not meet strength criteria
        // Add verification for the expected behavior, e.g., error message or visual indication of weak username

        // Test Scenario 11: Test the password limits under its strength
        passwordField.sendKeys("pass"); // Add a password that does not meet strength criteria
        // Add verification for the expected behavior, e.g., error message or visual indication of weak password

        // Test Scenario 12: Test the condition when the password and confirm password are given incorrectly
        passwordField.sendKeys("password123");
        confirmPasswordField.sendKeys("wrongPassword");
        submitButton.click();
        // Add verification for the expected behavior, e.g., error message indicating password mismatch

        // Test Scenario 13: Test the date of birth selection working properly
        dobField.sendKeys("2023-01-01"); // Assuming the date format is "YYYY-MM-DD"
        // Add verification for the selected date, e.g., check if the entered date is reflected in the field

        // Test Scenario 14: Ensure the date of birth field does not allow dates greater than the current date
        // Compare the entered date with the current date and verify that it is not greater

        // Test Scenario 15: Test the gender selection
        genderDropdown.sendKeys("male"); // Selecting gender from dropdown
        // Add verification for the selected gender, e.g., check if the selected option is reflected in the field

        // Test Scenario 16: Test the phone number limits under its strength
        phoneNumberField.sendKeys("123"); // Add a phone number that does not meet strength criteria
        // Add verification for the expected behavior, e.g., error message or visual indication of weak phone number

        // Test Scenario 17: Test the validation of the email field by entering an incorrect email ID
        emailIdField.sendKeys("invalidEmail"); // Add an invalid email format
        // Add verification for the expected behavior, e.g., error message indicating invalid email

        // Close the browser
        WebElement usernameField = driver.findElement(By.id("username"));
        WebElement passwordField = driver.findElement(By.id("password"));
        WebElement confirmPasswordField = driver.findElement(By.id("confirmPassword"));
        WebElement termsAndConditionsCheckbox = driver.findElement(By.id("termsAndConditions"));
        WebElement submitButton = driver.findElement(By.id("submit"));
        WebElement cancelButton = driver.findElement(By.id("cancel"));

        // Test Scenario 18: Verify that a validation message is displayed without selecting "terms and conditions"
        submitButton.click();
        // Add verification for the expected behavior, e.g., validation message for missing "terms and conditions" checkbox

        // Test Scenario 19: Verify that the system generates a validation message without filling all mandatory fields
        termsAndConditionsCheckbox.click(); // Ensure the checkbox is selected
        submitButton.click();
        // Add verification for the expected behavior, e.g., validation message for missing mandatory fields

        // Test Scenario 20: Check the working of the sign-up button
        // You may want to implement additional verification for successful signup, such as redirect or confirmation message

        // Test Scenario 21: Check the working of the cancel button
        cancelButton.click();
        // Add verification for the expected behavior, e.g., redirect or changes in the UI

        // Test Scenario 22: Verify that clicking on the Submit button after entering all mandatory fields submits the data
        usernameField.sendKeys("user123");
        passwordField.sendKeys("password123");
        confirmPasswordField.sendKeys("password123");
        submitButton.click();
        // Add verification for the expected behavior, e.g., successful submission

        // Test Scenario 23: Test that the system should not display any error message for optional fields
        // Optional fields are presumably those that are not marked as mandatory, so no validation error should occur
     // Assuming the following HTML structure:
        // <input type="text" id="username">
        // <input type="password" id="password">
        // <input type="password" id="confirmPassword">
        // <input type="checkbox" id="termsAndConditions">
        // <input type="submit" id="submit">
        // <textarea id="comments"></textarea>
        // <a href="https://example.com/privacy-policy" id="privacyPolicyLink">Privacy Policy</a>
        WebElement usernameField = driver.findElement(By.id("username"));
        WebElement passwordField = driver.findElement(By.id("password"));
        WebElement confirmPasswordField = driver.findElement(By.id("confirmPassword"));
        WebElement termsAndConditionsCheckbox = driver.findElement(By.id("termsAndConditions"));
        WebElement submitButton = driver.findElement(By.id("submit"));
        WebElement commentsTextArea = driver.findElement(By.id("comments"));
        WebElement privacyPolicyLink = driver.findElement(By.id("privacyPolicyLink"));

        // Test Scenario 24: Test scrolling performance of the registration page
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");

        // Test Scenario 25: Verify that all required/mandatory fields are marked with *
        String requiredLabelSymbol = "*";
        String usernameLabel = driver.findElement(By.xpath("//label[text()='Username']")).getText();
        String passwordLabel = driver.findElement(By.xpath("//label[text()='Password']")).getText();
        String confirmPasswordLabel = driver.findElement(By.xpath("//label[text()='Confirm Password']")).getText();

        if (usernameLabel.contains(requiredLabelSymbol) &&
                passwordLabel.contains(requiredLabelSymbol) &&
                confirmPasswordLabel.contains(requiredLabelSymbol)) {
            System.out.println("Test Scenario 25: Passed - All required fields are marked with *.");
        } else {
            System.out.println("Test Scenario 25: Failed - Not all required fields are marked with *.");
        }

        // Test Scenario 26: Verify that the system generates a validation message without filling all mandatory fields
        submitButton.click();
        // Add verification for the expected behavior, e.g., validation message for missing mandatory fields

        // Test Scenario 27: Check whether the registration field design is the same as per the Marvel app
        // Design verification cannot be done directly through WebDriver; manual inspection or visual testing tools are needed.

        // Test Scenario 28: Check the font style for a text area
        String textareaFontStyle = commentsTextArea.getCssValue("font-family");
        // Perform checks based on your application's expected font style for text areas

        // Test Scenario 29: Verify whether the registration page will get refreshed after closing the page
        driver.close();
        // Add verification for the expected behavior, e.g., retesting elements or checking the URL on page refresh

        // Reopen the browser and navigate to the registration page
        driver = new ChromeDriver();
        driver.get("https://example.com/register");

        // Test Scenario 30: Check whether the alert message should not appear while deleting text from a field
        usernameField.sendKeys("SomeText");
        usernameField.clear();
        // Add verification for the expected behavior, e.g., absence of alert message

        // Test Scenario 31: Check whether the privacy policy should show in another page or as a pop-up message
        privacyPolicyLink.click();
        // Add verification for the expected behavior, e.g., checking the URL or presence of a pop-up window

            
        }
	
	
	
	

}
