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

public class MyAccountPage {

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
		        // <div id="menuList">
		        //     <ul>
		        //         <li>Personal Details</li>
		        //         <li>Order History</li>
		        //         <li>Settings</li>
		        //     </ul>
		        // </div>
		        WebElement menuList = driver.findElement(By.id("menuList"));
		        WebElement personalDetailsLink = menuList.findElement(By.xpath("//li[text()='Personal Details']"));
		        WebElement orderHistoryLink = menuList.findElement(By.xpath("//li[text()='Order History']"));
		        WebElement settingsLink = menuList.findElement(By.xpath("//li[text()='Settings']"));

		        // Test Scenario 17: Verify "My Account" dashboard contains all relevant menu lists
		        if (personalDetailsLink.isDisplayed() && orderHistoryLink.isDisplayed() && settingsLink.isDisplayed()) {
		            System.out.println("Test Scenario 17: Passed - My Account dashboard contains relevant menu lists.");
		        } else {
		            System.out.println("Test Scenario 17: Failed - Missing relevant menu lists on My Account dashboard.");
		        }

		        // Test Scenario 18: Ensure the design of personal details is the same as per the Marvel app
		        // Design verification cannot be done directly through WebDriver; manual inspection is needed.

		        // Navigate to the Personal Details page
		        personalDetailsLink.click();

		        // Assuming the following HTML structure:
		        // <input type="text" id="firstName">
		        // <input type="text" id="lastName">
		        // <input type="email" id="email">
		        // <input type="tel" id="phoneNumber">
		        // <button id="saveButton">Save Changes</button>
		        WebElement firstNameField = driver.findElement(By.id("firstName"));
		        WebElement lastNameField = driver.findElement(By.id("lastName"));
		        WebElement emailField = driver.findElement(By.id("email"));
		        WebElement phoneNumberField = driver.findElement(By.id("phoneNumber"));
		        WebElement saveButton = driver.findElement(By.id("saveButton"));

		        // Test Scenario 19: Check if editing personal details is done successfully on the personal details page
		        firstNameField.clear();
		        lastNameField.clear();
		        emailField.clear();
		        phoneNumberField.clear();

		        firstNameField.sendKeys("John");
		        lastNameField.sendKeys("Doe");
		        emailField.sendKeys("john.doe@example.com");
		        phoneNumberField.sendKeys("1234567890");

		        saveButton.click();
		        // Add verification for successful editing, e.g., check for success message or updated details on the page

		        // Test Scenario 20: Verify proper validation for the email ID on the personal details page
		        emailField.clear();
		        emailField.sendKeys("invalidEmail");

		        saveButton.click();
		        // Add verification for expected validation error message

		        // Test Scenario 21: Verify proper validation for the phone number on the personal details page
		        phoneNumberField.clear();
		        phoneNumberField.sendKeys("invalidPhoneNumber");

		        saveButton.click();
		        // Add verification for expected validation error message

		        // Test Scenario 22: Check the font style of the My Account page
		        String fontStyle = driver.findElement(By.tagName("body")).getCssValue("font-family");
		        System.out.println("Test Scenario 22: Font Style of My Account Page - " + fontStyle);
		        WebElement currentPasswordField = driver.findElement(By.id("currentPassword"));
		        WebElement newPasswordField = driver.findElement(By.id("newPassword"));
		        WebElement confirmNewPasswordField = driver.findElement(By.id("confirmNewPassword"));
		        WebElement changePasswordButton = driver.findElement(By.id("changePasswordButton"));

		        // Test Scenario 23: Ensure the Change Password page design is the same as per the Marvel app
		        // Design verification cannot be done directly through WebDriver; manual inspection is needed.

		        // Test Scenario 24: Verify that the Change Password page contains all relevant fields
		        if (currentPasswordField.isDisplayed() && newPasswordField.isDisplayed() && confirmNewPasswordField.isDisplayed()) {
		            System.out.println("Test Scenario 24: Passed - Change Password page contains relevant fields.");
		        } else {
		            System.out.println("Test Scenario 24: Failed - Missing relevant fields on the Change Password page.");
		        }

		        // Test Scenario 25: Ensure the Address Book design is the same as per the Marvel app (if addresses are present)
		        // Design verification cannot be done directly through WebDriver; manual inspection is needed.

		        // Navigate to the Address Book page
		        driver.get("https://example.com/address-book");

		        // Assuming the following HTML structure for the Address Book page:
		        // <div id="addressList">
		        //     <div class="address">Address 1</div>
		        //     <div class="address">Address 2</div>
		        //     ...
		        // </div>
		        WebElement addressList = driver.findElement(By.id("addressList"));

		        // Test Scenario 26: Ensure the user cannot delete the default address
		        WebElement defaultAddress = addressList.findElement(By.xpath("//div[text()='Default Address']"));
		        WebElement deleteButton = defaultAddress.findElement(By.xpath(".//button[@class='delete-button']"));
		        deleteButton.click();
		        // Add verification to check if the delete action is prevented (e.g., error message or confirmation dialog)

		        // Test Scenario 27: Ensure the design of adding a new address form is the same as per the design
		        // Design verification cannot be done directly through WebDriver; manual inspection is needed.

		        // Test Scenario 28: Verify that the "Add a New Address" form contains relevant fields
		        // Assuming the following HTML structure for the "Add a New Address" form:
		        // <input type="text" id="fullName">
		        // <input type="text" id="streetAddress">
		        // <input type="text" id="city">
		        // <input type="text" id="zipCode">
		        // <button id="addAddressButton">Add Address</button>
		        WebElement fullNameField = driver.findElement(By.id("fullName"));
		        WebElement streetAddressField = driver.findElement(By.id("streetAddress"));
		        WebElement cityField = driver.findElement(By.id("city"));
		        WebElement zipCodeField = driver.findElement(By.id("zipCode"));
		        WebElement addAddressButton = driver.findElement(By.id("addAddressButton"));

		        if (fullNameField.isDisplayed() && streetAddressField.isDisplayed() && cityField.isDisplayed()
		                && zipCodeField.isDisplayed() && addAddressButton.isDisplayed()) {
		            System.out.println("Test Scenario 28: Passed - 'Add a New Address' form contains relevant fields.");
		        } else {
		            System.out.println("Test Scenario 28: Failed - Missing relevant fields on 'Add a New Address' form.");
		        }

		        // Test Scenario 29: Verify that the "Add a New Address" form contains Google Maps
		        // Assuming the presence of an iframe with the Google Maps integration
		        WebElement googleMapsFrame = driver.findElement(By.tagName("iframe"));
		        // Add verification for the presence and visibility of the Google Maps iframe
		        WebElement addressList = driver.findElement(By.id("addressList"));

		        // Test Scenario 30: Ensure the user can delete an address except the default address
		        WebElement addressToDelete = addressList.findElement(By.xpath("//div[text()='Address 1']"));
		        WebElement deleteButton = addressToDelete.findElement(By.xpath(".//button[@class='delete-button']"));
		        deleteButton.click();
		        // Add verification to check if the address is deleted successfully

		        // Test Scenario 31: Ensure address book editing is working successfully
		        WebElement editButton = addressList.findElement(By.xpath(".//button[@class='edit-button']"));
		        editButton.click();
		        // Assuming the following HTML structure for the edit form:
		        // <input type="text" id="editedFullName">
		        // <input type="text" id="editedStreetAddress">
		        // <input type="text" id="editedCity">
		        // <input type="text" id="editedZipCode">
		        // <button id="saveEditButton">Save Changes</button>
		        WebElement editedFullNameField = driver.findElement(By.id("editedFullName"));
		        WebElement editedStreetAddressField = driver.findElement(By.id("editedStreetAddress"));
		        WebElement editedCityField = driver.findElement(By.id("editedCity"));
		        WebElement editedZipCodeField = driver.findElement(By.id("editedZipCode"));
		        WebElement saveEditButton = driver.findElement(By.id("saveEditButton"));

		        editedFullNameField.clear();
		        editedStreetAddressField.clear();
		        editedCityField.clear();
		        editedZipCodeField.clear();

		        editedFullNameField.sendKeys("Edited Name");
		        editedStreetAddressField.sendKeys("Edited Street");
		        editedCityField.sendKeys("Edited City");
		        editedZipCodeField.sendKeys("12345");

		        saveEditButton.click();
		        // Add verification for successful editing, e.g., check for success message or updated details on the page

		        // Navigate to the Add a New Address page
		        driver.get("https://example.com/add-new-address");

		        // Assuming the following HTML structure for adding a new address:
		        // <input type="text" id="newAddressFullName">
		        // <input type="text" id="newAddressStreetAddress">
		        // <input type="text" id="newAddressCity">
		        // <input type="text" id="newAddressZipCode">
		        // <input type="tel" id="newAddressPhoneNumber">
		        // <button id="addNewAddressButton">Add New Address</button>
		        WebElement newAddressFullNameField = driver.findElement(By.id("newAddressFullName"));
		        WebElement newAddressStreetAddressField = driver.findElement(By.id("newAddressStreetAddress"));
		        WebElement newAddressCityField = driver.findElement(By.id("newAddressCity"));
		        WebElement newAddressZipCodeField = driver.findElement(By.id("newAddressZipCode"));
		        WebElement newAddressPhoneNumberField = driver.findElement(By.id("newAddressPhoneNumber"));
		        WebElement addNewAddressButton = driver.findElement(By.id("addNewAddressButton"));

		        // Test Scenario 32: Verify that the phone number contains proper validation while adding a new address
		        newAddressPhoneNumberField.sendKeys("invalidPhoneNumber");
		        addNewAddressButton.click();
		        // Add verification for expected validation error message

		        // Test Scenario 33: Ensure the design of the Address Book is the same as per the Marvel app if no address is present
		        // Design verification cannot be done directly through WebDriver; manual inspection is needed.

		        // Navigate to the Order History page
		        driver.get("https://example.com/order-history");

		        // Test Scenario 34: Ensure the design of the Order History page is the same as per the design
		        // Design verification cannot be done directly through WebDriver; manual inspection is needed.

		        // Navigate to the Return History page
		        driver.get("https://example.com/return-history");

		        // Test Scenario 35: Ensure the design of the Return History page is the same as per the design
		        // Design verification cannot be done directly through WebDriver; manual inspection is needed.

		        WebElement wishListItem = driver.findElement(By.className("wish-list-item"));
		        WebElement deleteButton = wishListItem.findElement(By.className("delete-button"));
		        WebElement addToCartButton = wishListItem.findElement(By.className("add-to-cart-button"));

		        // Test Scenario 36: Ensure the design of the Wish List page is the same as per the Marvel app
		        // For design verification, consider using visual testing tools like Applitools Eyes or Percy.

		        // Test Scenario 37: Verify that the delete button is working correctly in the Wish List page
		        deleteButton.click();
		        // Add verification for the expected behavior after deletion (e.g., item disappears or confirmation message)

		        // Test Scenario 38: Verify that the add to cart button is working correctly in the Wish List page
		        addToCartButton.click();
		        // Add verification for the expected behavior after adding to the cart (e.g., item added to cart, cart updated)

		        // Navigate to the My Account page
		        driver.get("https://example.com/my-account");

		        // Assuming the following HTML structure for the side menu:
		        // <div id="sideMenu">
		        //     <ul>
		        //         <li class="menu-item">Menu 1</li>
		        //         <li class="menu-item">Menu 2</li>
		        //         <li class="menu-item">Menu 3</li>
		        //     </ul>
		        // </div>
		        WebElement sideMenu = driver.findElement(By.id("sideMenu"));
		        WebElement menu1 = sideMenu.findElement(By.xpath("//li[text()='Menu 1']"));
		        WebElement menu2 = sideMenu.findElement(By.xpath("//li[text()='Menu 2']"));
		        WebElement menu3 = sideMenu.findElement(By.xpath("//li[text()='Menu 3']"));

		        // Test Scenario 39: Ensure the side menu occurs a selection while selecting each one in the My Account page
		        menu1.click();
		        // Add verification for the expected behavior after selecting Menu 1 (e.g., highlighted or expanded)
		        menu2.click();
		        // Add verification for the expected behavior after selecting Menu 2
		        menu3.click();
		        // Add verification for the expected behavior after selecting Menu 3

		        // Test Scenario 40: Verify that the names of side menus are the same as per the design in the My Account page
		        if (menu1.isDisplayed() && menu2.isDisplayed() && menu3.isDisplayed()) {
		            System.out.println("Test Scenario 40: Passed - Side menu names are displayed as per the design.");
		        } else {
		            System.out.println("Test Scenario 40: Failed - Side menu names are not displayed as per the design.");
		        }

		        // Test Scenario 41: Change the font style of all texts as per the Marvel app
		        // Font style changes cannot be done directly through WebDriver; manual inspection or external tools are needed.
  // Close the browser
		        }

}
