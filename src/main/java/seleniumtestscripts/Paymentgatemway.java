package seleniumtestscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Paymentgatemway {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\ahbiram\\Downloads\\geckodriver-v0.33.0-win64\\geckodriver.exe");

        // Create a new instance of the FirefoxDriver
        FirefoxDriver driver = new FirefoxDriver();
        driver.get("https://dev16.intersmarthosting.in/vidhya-shekhar/");
     // Assuming the following HTML structure:
        // <button id="placeOrderBtn">Place Order</button>
        // <input type="text" id="cardNumber">
        // <input type="text" id="expiryDate">
        // <input type="text" id="cvv">
        // <select id="paymentMethod">
        //     <option value="creditCard">Credit Card</option>
        //     <option value="paypal">PayPal</option>
        //     <option value="debitCard">Debit Card</option>
        // </select>
        // <input type="checkbox" id="saveCardDetails">
        // <button id="submitPayment">Submit Payment</button>
        WebElement placeOrderBtn = driver.findElement(By.id("placeOrderBtn"));
        WebElement cardNumberField = driver.findElement(By.id("cardNumber"));
        WebElement expiryDateField = driver.findElement(By.id("expiryDate"));
        WebElement cvvField = driver.findElement(By.id("cvv"));
        WebElement paymentMethodDropdown = driver.findElement(By.id("paymentMethod"));
        WebElement saveCardDetailsCheckbox = driver.findElement(By.id("saveCardDetails"));
        WebElement submitPaymentBtn = driver.findElement(By.id("submitPayment"));

        // Test Scenario 32: Check whether clicking on the Place Order button redirects to the payment gateway
        placeOrderBtn.click();
        // Add verification for the expected behavior, e.g., checking the URL or elements on the payment gateway page

        // Test Scenario 33: Verify that the page does not proceed to the payment page before all mandatory information is filled
        submitPaymentBtn.click();
        // Add verification for the expected behavior, e.g., validation message for missing mandatory information

        // Test Scenario 34: Check if payment is correctly working with valid card details
        cardNumberField.sendKeys("validCardNumber");
        expiryDateField.sendKeys("12/25");
        cvvField.sendKeys("123");
        submitPaymentBtn.click();
        // Add verification for the expected behavior, e.g., checking for successful payment confirmation

        // Test Scenario 35: Check if the system works correctly with each of the possible payment options
        paymentMethodDropdown.sendKeys("paypal"); // Change the value based on the options in your application
        // Add verification for the expected behavior, e.g., elements related to PayPal becoming visible

        // Test Scenario 36: Check if each of the payment options is selectable
        // This is covered by the previous scenario where the payment method is changed

        // Test Scenario 37: Check whether there is an option to save the card details
        saveCardDetailsCheckbox.click();
        // Add verification for the expected behavior, e.g., checking the state of the checkbox

        // Test Scenario 38: Verify if the payment gateway returns to your application to show a successful transaction/confirmation message
        // Add verification for the expected behavior, e.g., checking for a success message on your application page

        // Test Scenario 39: Check whether a proper message is shown after the payment is failed
        // Simulate a failed payment and add verification for the expected error message

        // Test Scenario 40: Test the transaction flow using blocked card data
        // Use known blocked card details and add verification for the expected behavior, e.g., error message

        // Test Scenario 41: Check if multiple cards can be saved as default or not
        // Simulate saving multiple cards and check if the system handles it correctly

        // Test Scenario 42: Verify that the correct currency is reflected on the page
        // Check if the displayed currency matches the expected currency

        // Test Scenario 43: Check if the user gets a confirmation message or email if the payment is successful
        // Verify that the user receives a confirmation message or email

        // Test Scenario 44: Verify that the user gets information about unsuccessful payment
        // Verify that the user receives information about the unsuccessful payment, e.g., error message

        // Test Scenario 45: Check what happens if the payment gets stopped midway
        // Simulate stopping the payment process midway and add verification for the expected behavior

        // Test Scenario 46: Check what happens if the network is disconnected while doing the payment
        // Simulate a network disconnection during payment and add verification for the expected behavior

        // Test Scenario 47: Check whether no amount is debited from the user account if the payment is failed
        // Add verification that the user's account is not debited in case of a failed payment

        // Test Scenario 48: Check whether the correct amount is debited from the user after successful payment
        // Add verification that the correct amount is debited after a successful payment

        // Test Scenario 49: Check what happens if the user closes the tab while doing a payment
        // Simulate closing the tab during payment and add verification for the expected behavior, e.g., order status

	
	}
	
	

}
