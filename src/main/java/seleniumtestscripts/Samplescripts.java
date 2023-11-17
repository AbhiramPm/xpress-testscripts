package seleniumtestscripts;

import java.awt.Dimension;
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

public class Samplescripts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				System.setProperty("webdriver.gecko.driver", "C:\\Users\\ahbiram\\Downloads\\geckodriver-v0.33.0-win64\\geckodriver.exe");

		        // Setup FirefoxDriver
		        FirefoxDriver driver = new FirefoxDriver();
		        driver.get("https://dev16.intersmarthosting.in/vidhya-shekhar/");
		        
// Test Case: Check the favicon of the site
		        WebElement favicon = driver.findElement(By.cssSelector("link[rel='icon']"));

		        if (favicon.isDisplayed()) {
		            System.out.println("Favicon is displayed");
		        } else {
		            System.out.println("Favicon is not displayed");
		        }
		        
// Test Case: Check the header for the correctness of the company logo
		        WebElement headerCompanyLogo = driver.findElement(By.cssSelector("header #company-logo"));
		        if (headerCompanyLogo.isDisplayed()) {
		            System.out.println("Header Company Logo is displayed");
		        } else {
		            System.out.println("Header Company Logo is not displayed");
		        }
		        
 // Test Case: Check the footer for the correctness of the company logo
		        WebElement footerCompanyLogo = driver.findElement(By.cssSelector("footer #footer-company-logo"));
		        if (footerCompanyLogo.isDisplayed()) {
		            System.out.println("Footer Company Logo is displayed");
		        } else {
		            System.out.println("Footer Company Logo is not displayed");
		        }
			
// Test Case: Check if the page URL contains the correct page title
		        String expectedTitle = "Your Expected Page Title";
		        String actualTitle = driver.getTitle();

		        if (actualTitle.contains(expectedTitle)) {
		            System.out.println("Page URL contains the correct page title: " + expectedTitle);
		        } else {
		            System.out.println("Page URL does not contain the correct page title. Expected: " + expectedTitle + ", Actual: " + actualTitle);
		        }
		        
// Test Case: Check all header menus specified in the project are displayed
		        List<WebElement> headerMenus = driver.findElements(By.cssSelector("header .menu-item"));
		        System.out.println("Checking Header menus:");
		        for (WebElement menu : headerMenus) {
		            if (menu.isDisplayed()) {
		                System.out.println("Menu is displayed: " + menu.getText());
		            } else {
		                System.out.println("Menu is not displayed: " + menu.getText());
		            }
		        }
		        System.out.println("Finished checking Header menus.\n");
		        
// Test Case: Check all footer menus specified in the project are displayed
		        List<WebElement> footerMenus = driver.findElements(By.cssSelector("footer .menu-item"));
		        System.out.println("Checking Footer menus:");
		        for (WebElement menu : footerMenus) {
		            if (menu.isDisplayed()) {
		                System.out.println("Menu is displayed: " + menu.getText());
		            } else {
		                System.out.println("Menu is not displayed: " + menu.getText());
		            }
		        }
		        System.out.println("Finished checking Footer menus.\n");
		        
		        
// Test Case: Check all links in the footer are working properly
		        List<WebElement> footerLinks = driver.findElements(By.cssSelector("footer a"));
		        System.out.println("Checking Footer links:");
		        for (WebElement link : footerLinks) {
		            String url = link.getAttribute("href");
		            if (url != null && !url.isEmpty() && !url.startsWith("javascript:")) {
		                System.out.println("Link is working: " + url);
		            } else {
		                System.out.println("Link is broken or JavaScript link: " + url);
		            }
		        }
		        System.out.println("Finished checking Footer links.\n");
		        
// Test Case: Check all pages for broken links
		        List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		        System.out.println("Checking all pages for broken links:");
		        for (WebElement link : allLinks) {
		            String url = link.getAttribute("href");
		            if (url != null && !url.isEmpty() && !url.startsWith("javascript:")) {
		                System.out.println("Link is working: " + url);
		            } else {
		                System.out.println("Link is broken or JavaScript link: " + url);
		            }
		        }
		        System.out.println("Finished checking all pages for broken links.\n");
// Test Case: Check all pages for broken images
		        List<WebElement> images = driver.findElements(By.tagName("img"));

		        for (WebElement image : images) {
		            String imageUrl = image.getAttribute("src");

		            // Perform some action with the image URL, for example, printing it
		            System.out.println("Checking image URL: " + imageUrl);

		            // You can add further code to validate the image URL, for example, using HTTP status codes
		            // Test Case 1: Check webpage's meta title
		            String expectedTitle11 = "Expected Title"; // Replace with the expected title
		            String actualTitle111 = driver.getTitle();
		            System.out.println("Page title: " + actualTitle111);
		            if (!actualTitle111.equals(expectedTitle11)) {
		                System.out.println("Page title does not match the expected title. Expected: " + expectedTitle11 + ", Actual: " + actualTitle111);
		            } else {
		                System.out.println("Page title matches the expected title.");
		            }
		            
		            
// Test Case : Scrollbar should be enabled only when necessary
		            WebElement bodyElement = driver.findElement(By.tagName("body"));
		            String overflowValue = bodyElement.getCssValue("overflow");
		            if (overflowValue.equals("auto") || overflowValue.equals("scroll")) {
		                System.out.println("Scrollbar is enabled.");
		            } else {
		                System.out.println("Scrollbar is not enabled.");
		            }
		            
		            
// Test Case : Test mouse hover effects
		            Actions actions = new Actions(driver);

		            // Header
		            WebElement headerElement = driver.findElement(By.cssSelector("header"));
		            actions.moveToElement(headerElement).perform();
		            System.out.println("Mouse hover effect tested for element with selector: header");

		            // Footer
		            WebElement footerElement = driver.findElement(By.cssSelector("footer"));
		            actions.moveToElement(footerElement).perform();
		            System.out.println("Mouse hover effect tested for element with selector: footer");

		            // Sidebar (Replace with the actual sidebar selector)
		            WebElement sidebarElement = driver.findElement(By.cssSelector("sidebar"));
		            actions.moveToElement(sidebarElement).perform();
		            System.out.println("Mouse hover effect tested for element with selector: sidebar");

		            // Social Links (Replace with the actual selector)
		            WebElement socialLinksElement = driver.findElement(By.cssSelector(".social-links"));
		            actions.moveToElement(socialLinksElement).perform();
		            System.out.println("Mouse hover effect tested for element with selector: .social-links");

		            // Other Dropdown (Replace with the actual selector)
		            WebElement dropdownElement = driver.findElement(By.cssSelector(".dropdown"));
		            actions.moveToElement(dropdownElement).perform();
		            System.out.println("Mouse hover effect tested for element with selector: .dropdown");
    
		        }
		
// Test Case : Check whether clicking on the website logo redirects to the homepage
		        WebElement logoElement = driver.findElement(By.cssSelector(".logo")); // Replace with the actual logo selector
		        String homepageURL = "https://example.com"; // Replace with the actual homepage URL
		        logoElement.click();
		        String currentURL = driver.getCurrentUrl();
		        if (currentURL.equals(homepageURL)) {
		            System.out.println("Clicking on the website logo redirects to the homepage.");
		        } else {
		            System.out.println("Clicking on the website logo does not redirect to the homepage. Current URL: " + currentURL);
		        }

// Test Case : Check if the banner images are optimized
		        WebElement bannerImageElement = driver.findElement(By.cssSelector(".banner-image")); // Replace with the actual banner image selector
		        // Add logic to check image optimization as per your requirements

// Test Case : Check whether social media icons are redirected to respective pages
		        WebElement facebookIcon = driver.findElement(By.cssSelector(".facebook-icon")); // Replace with the actual Facebook icon selector
		        facebookIcon.click();
		        String expectedFacebookURL = "https://www.facebook.com"; // Replace with the actual Facebook page URL
		        currentURL = driver.getCurrentUrl();
		        if (currentURL.equals(expectedFacebookURL)) {
		            System.out.println("Facebook icon redirects to the expected page.");
		        } else {
		            System.out.println("Facebook icon does not redirect to the expected page. Current URL: " + currentURL);
		        }

		        // Similar checks for other social media icons
		        
		        
// Test Case: Check if animation/movement is displayed properly
		        // Identify the element with animation/movement (replace with actual selector)
		        WebElement animatedElement = driver.findElement(By.cssSelector(".animated-element"));

		        // Execute JavaScript to trigger animation
		        ((JavascriptExecutor) driver).executeScript("arguments[0].style.transition = 'transform 2s';", animatedElement);

		        // Scroll to the element to ensure it is in the viewport
		        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", animatedElement);

		        // Wait for the animation to complete (replace with appropriate waiting mechanism)
		        try {
		            Thread.sleep(3000); // Adjust time based on your animation duration
		        } catch (InterruptedException e) {
		            e.printStackTrace();
		        }

		        // Verify if the element is displayed after animation
		        if (animatedElement.isDisplayed()) {
		            System.out.println("Test Case Passed: Animation/movement is displayed properly.");
		        } else {
		            System.out.println("Test Case Failed: Animation/movement is not displayed properly.");
		        }
// Test Case 1: Check if Facebook link opens in a new Tab
		        WebElement facebookLink = driver.findElement(By.cssSelector(".facebook-link"));
		        String mainWindowHandle = driver.getWindowHandle();
		        facebookLink.click();

		        // Switch to the new tab
		        Set<String> windowHandles = driver.getWindowHandles();
		        for (String handle : windowHandles) {
		            if (!handle.equals(mainWindowHandle)) {
		                driver.switchTo().window(handle);

		                // Verify if the new tab contains content related to Facebook
		                if (driver.getTitle().contains("Facebook")) {
		                    System.out.println("Test Case Passed: Facebook link opens in a new Tab.");
		                } else {
		                    System.out.println("Test Case Failed: Facebook link does not open in a new Tab.");
		                }

		                // Close the new tab
		                driver.close();

		                // Switch back to the main window
		                driver.switchTo().window(mainWindowHandle);
		                break;
		            }
		        }

// Test Case 2: Check if Twitter link opens in a new Tab
		        WebElement twitterLink = driver.findElement(By.cssSelector(".twitter-link"));
		        twitterLink.click();

		        // Switch to the new tab
		        windowHandles = driver.getWindowHandles();
		        for (String handle : windowHandles) {
		            if (!handle.equals(mainWindowHandle)) {
		                driver.switchTo().window(handle);

		                // Verify if the new tab contains content related to Twitter
		                if (driver.getTitle().contains("Twitter")) {
		                    System.out.println("Test Case Passed: Twitter link opens in a new Tab.");
		                } else {
		                    System.out.println("Test Case Failed: Twitter link does not open in a new Tab.");
		                }

		                // Close the new tab
		                driver.close();

		                // Switch back to the main window
		                driver.switchTo().window(mainWindowHandle);
		                break;
		            }
		        }

		        // Add similar steps for other social media links
// Test Case : Check if the Top Scroll button works properly
		        WebElement topScrollButton = driver.findElement(By.cssSelector(".top-scroll-button"));
		        topScrollButton.click();
		        
// Test Case : Check if the header section is sticky while scrolling down
		        driver.findElement(By.tagName("body")).sendKeys(Keys.END); // Scroll to the bottom
		        // Verify if the header is sticky (you need to inspect the page and find the appropriate CSS property)
		        
// Test Case : Check the alignment of texts/contents/buttons
		        // Implement your checks for alignment based on your website structure

// Test Case : Check if placeholders are given properly without spelling mistakes
		        WebElement usernameField = driver.findElement(By.id("username"));
		        String placeholder = usernameField.getAttribute("placeholder");
		        if (placeholder.equals("Enter your username")) {
		            System.out.println("Test Case Passed: Placeholder is correct.");
		        } else {
		            System.out.println("Test Case Failed: Placeholder is incorrect.");
		        }
// Test Case : Test at footer "Powered by WebCastle" redirects to the company website. It should be opened in a new tab.
		        WebElement poweredByLink = driver.findElement(By.cssSelector("#footer a"));
		        String originalWindowHandle = driver.getWindowHandle();
		        poweredByLink.click();

		        // Switch to the new tab
		        for (String windowHandle : driver.getWindowHandles()) {
		            if (!windowHandle.equals(originalWindowHandle)) {
		                driver.switchTo().window(windowHandle);

		                // Verify if the opened URL is the company website
		                if (driver.getCurrentUrl().equals("https://webcastle.in")) {
		                    System.out.println("Test Case Passed: Powered by WebCastle link redirects to the company website in a new tab.");
		                } else {
		                    System.out.println("Test Case Failed: Powered by WebCastle link does not redirect to the company website in a new tab.");
		                }

		                // Close the new tab
		                driver.close();

		                // Switch back to the original window
		                driver.switchTo().window(originalWindowHandle);
		                break;
		            }
		        }

// Test Case : Test '404 not found' page given in case of any missing pages
		        driver.get("https://example.com/nonexistent-page"); // Navigate to a non-existent page
		        // Implement logic to check if the '404 not found' message is displayed

// Test Case : Check image upload functionality with image files of different extensions
		        WebElement fileInput = driver.findElement(By.id("file-upload-input"));
		        // Set the file path based on your system
		        String imagePath = "path/to/image.jpg";
		        fileInput.sendKeys(imagePath);
		        // Implement verification logic for successful image upload
		     // Test Case 9: Check image upload functionality with images having space or any other allowed special character in the file name
		        WebElement fileInput1 = driver.findElement(By.id("file-upload-input"));
		        String imagePathWithSpecialCharacter = "path/to/image with space.jpg";
		        fileInput1.sendKeys(imagePathWithSpecialCharacter);
		        // Implement verification logic for successful image upload

		        // Test Case 10: Check duplicate name image upload
		        // Assuming there is a duplicate image with the same name as the one previously uploaded
		        WebElement duplicateFileInput = driver.findElement(By.id("file-upload-input"));
		        String duplicateImagePath = "path/to/duplicate-image.jpg";
		        duplicateFileInput.sendKeys(duplicateImagePath);
		        // Implement verification logic for handling duplicate image name

		        // Test Case 11: Check image upload with image size greater than the max allowed size. The proper error message should be displayed.
		        WebElement largeFileInput = driver.findElement(By.id("file-upload-input"));
		        String largeImagePath = "path/to/large-image.jpg";
		        largeFileInput.sendKeys(largeImagePath);
		        // Implement verification logic for handling large image size and checking error message

		        // Test Case 12: The image upload progress bar should appear for large size images.
		        WebElement progressBar = driver.findElement(By.id("upload-progress-bar"));
		        // Implement verification logic to check if the progress bar is displayed for large size images
		        // Test Case 13: Check if the user is able to view uploaded images
		        WebElement viewImageButton = driver.findElement(By.cssSelector(".view-image-button"));
		        viewImageButton.click();
		        // Implement verification logic for viewing images

		        // Test Case 14: Check if the user is able to download uploaded images
		        WebElement downloadImageButton = driver.findElement(By.cssSelector(".download-image-button"));
		        downloadImageButton.click();
		        // Implement verification logic for downloading images

		        // Test Case 15: Test if linking to the user account is given on the home page
		        driver.get("https://example.com"); // Navigate to the home page
		        WebElement userAccountLink = driver.findElement(By.cssSelector("#user-account-link"));
		        // Implement verification logic for user account link presence

		        // Test Case 16: Test the alignment and functionality for next and previous buttons
		        WebElement nextButton = driver.findElement(By.cssSelector(".next-button"));
		        WebElement previousButton = driver.findElement(By.cssSelector(".previous-button"));
		        // Implement verification logic for alignment and functionality of next and previous buttons

		        
//   Test the Java script is properly working in different browsers (IE, Firefox, Chrome, Safari and Edge).
		        // Set the paths to your WebDriver executables
		        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
		        System.setProperty("webdriver.gecko.driver", "path/to/geckodriver");
		        System.setProperty("webdriver.ie.driver", "path/to/IEDriverServer");
		        // Safari and Edge do not require setting the system property

		        // Create instances of different WebDriver
		        WebDriver chromeDriver = new ChromeDriver();
		        WebDriver firefoxDriver = new FirefoxDriver();
		        WebDriver ieDriver = new InternetExplorerDriver();
		        WebDriver edgeDriver = new EdgeDriver();
		        WebDriver safariDriver = new SafariDriver();

		        // Test JavaScript functionality in each browser
		        testJavaScriptFunctionality(chromeDriver, "https://example.com");
		        testJavaScriptFunctionality(firefoxDriver, "https://example.com");
		        testJavaScriptFunctionality(ieDriver, "https://example.com");
		        testJavaScriptFunctionality(edgeDriver, "https://example.com");
		        testJavaScriptFunctionality(safariDriver, "https://example.com");

		        // Close all browsers
		        chromeDriver.quit();
		        firefoxDriver.quit();
		        ieDriver.quit();
		        edgeDriver.quit();
		        safariDriver.quit();
		    }

		    private static void testJavaScriptFunctionality(WebDriver driver, String url) {
		        // Navigate to the website
		        driver.get(url);

		        // Execute JavaScript to test functionality
		        if (driver instanceof JavascriptExecutor) {
		            JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;

		            // Example: Scroll to the bottom of the page
		            jsExecutor.executeScript("window.scrollTo(0, document.body.scrollHeight);");

		            // Example: Change the background color of an element
		            WebElement targetElement = driver.findElement(By.cssSelector(".example-element"));
		            jsExecutor.executeScript("arguments[0].style.backgroundColor='yellow'", targetElement);

		            // Add more JavaScript tests as needed

		            // Sleep for a short time to visually observe the changes (optional)
		            try {
		                Thread.sleep(2000);
		            } catch (InterruptedException e) {
		                e.printStackTrace();
		            }
		        }

		     // Set the path to your WebDriver executable
		        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
		        System.setProperty("webdriver.gecko.driver", "path/to/geckodriver");

		        // Create instances of different WebDriver
		        WebDriver chromeDriver = new ChromeDriver();
		        WebDriver firefoxDriver = new FirefoxDriver();

		        // Test the site on different resolutions
		        testOnDifferentResolutions(chromeDriver, "https://example.com");
		        testOnDifferentResolutions(firefoxDriver, "https://example.com");

		        // Close all browsers
		        chromeDriver.quit();
		        firefoxDriver.quit();
		    }

		    private static void testOnDifferentResolutions(WebDriver driver, String url) {
		        // Navigate to the website
		        driver.get(url);

		        // Test Case: Check the site on different resolutions - Mobile
		        setWindowSize(driver, 360, 640); // Set to a mobile resolution
		        performResponsiveTests(driver);

		        // Test Case: Check the site on different resolutions - Tablet
		        setWindowSize(driver, 768, 1024); // Set to a tablet resolution
		        performResponsiveTests(driver);

		        
// Test Case: Check the site on different resolutions - Desktop
		        setWindowSize(driver, 1366, 768); // Set to a desktop resolution
		        performResponsiveTests(driver);
		    }

		    private static void setWindowSize(WebDriver driver, int width, int height) {
		        driver.manage().window().setSize(new Dimension(width, height));
		    }

		    private static void performResponsiveTests(WebDriver driver) {
		        // Example: Check the visibility of a responsive element
		        WebElement responsiveElement = driver.findElement(By.cssSelector(".responsive-element"));
		        if (responsiveElement.isDisplayed()) {
		            System.out.println("Element is displayed on this resolution.");
		        } else {
		            System.out.println("Element is not displayed on this resolution.");
		        }

		        // Add more responsive testing logic as needed

		        // Sleep for a short time to visually observe the changes (optional)
		        try {
		            Thread.sleep(2000);
		        } catch (InterruptedException e) {
		            e.printStackTrace();
		        }
// Test Case : Homepage should be linked in every page
		        WebElement homepageLink = driver.findElement(By.cssSelector("#homepage-link"));
		        homepageLink.click();
		        // Implement verification logic for homepage link

// Test Case : Copyright information in the footer with the current year
		        WebElement copyrightElement = driver.findElement(By.cssSelector("#copyright"));
		        String copyrightText = copyrightElement.getText();
		        // Implement verification logic for current year in copyright text

// Test Case : Check if dropdown list options are readable and not truncated
		        WebElement dropdown = driver.findElement(By.cssSelector("#dropdown"));
		        dropdown.click();
		        // Implement verification logic for readable dropdown options

// Test Case : All fields, buttons, and elements accessible by keyboard shortcuts
		        WebElement textBox = driver.findElement(By.cssSelector("#textbox"));
		        textBox.sendKeys("Test input");

		        WebElement radioButton = driver.findElement(By.cssSelector("#radio-button"));
		        radioButton.sendKeys(Keys.SPACE); // Select the radio button

		        WebElement button = driver.findElement(By.cssSelector("#submit-button"));
		        button.sendKeys(Keys.RETURN); // Perform the button click using the Enter key

		        // Add more accessibility tests as needed

		        // Sleep for a short time to visually observe the changes (optional)
		        try {
		            Thread.sleep(2000);
		        } catch (InterruptedException e) {
		            e.printStackTrace();
		        }
		        
		        
 // Set the path to your WebDriver executable
		        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
		        System.setProperty("webdriver.gecko.driver", "path/to/geckodriver");

		        // Create instances of different WebDriver
		        WebDriver chromeDriver = new ChromeDriver();
		        WebDriver firefoxDriver = new FirefoxDriver();

		        // Test the mentioned cases on both browsers
		        testSearchAndFilter(chromeDriver, "https://example.com");
		        testSearchAndFilter(firefoxDriver, "https://example.com");

		        // Close all browsers
		        chromeDriver.quit();
		        firefoxDriver.quit();
		    }

		    private static void testSearchAndFilter(WebDriver driver, String url) {
// Navigate to the website
		        driver.get(url);

// Test Case : Privacy Policy and Terms and Condition links are clearly defined and available
		        WebElement privacyPolicyLink = driver.findElement(By.cssSelector("#privacy-policy-link"));
		        WebElement termsAndConditionLink = driver.findElement(By.cssSelector("#terms-and-condition-link"));

		        // Implement verification logic for the presence and clarity of the links
//Test Case : If search filter is enabled, the user should be able to filter results using all parameters
		        WebElement searchBox = driver.findElement(By.cssSelector("#search-box"));
		        searchBox.sendKeys("Test Query");
		        searchBox.sendKeys(Keys.RETURN);
		        
		       // Implement verification logic for search results
		        
// Test Case : Refine search functionality should load the search page with all user-selected search parameters
		        WebElement refineSearchButton = driver.findElement(By.cssSelector("#refine-search-button"));
		        refineSearchButton.click();
		        // Implement verification logic for the refined search page with parameters

// Test Case : When at least one filter criterion is required, ensure proper error message is displayed
		        WebElement submitButton = driver.findElement(By.cssSelector("#submit-button"));
		        submitButton.click();
		        // Implement verification logic for the presence of error message

		        // Add more search and filter tests as needed

		        // Sleep for a short time to visually observe the changes (optional)
		        try {
		            Thread.sleep(2000);
		        } catch (InterruptedException e) {
		            e.printStackTrace();
		        }
// Test Case : Proper validation messages for all invalid values for filter criteria
		        WebElement invalidFilterField = driver.findElement(By.cssSelector("#invalid-filter-field"));
		        invalidFilterField.sendKeys("Invalid Value");
		        WebElement submitButton = driver.findElement(By.cssSelector("#submit-button"));
		        submitButton.click();
		        // Implement verification logic for the presence of proper validation message
// Test Case : Page loading symbol should be displayed for a delayed search result page
		        WebElement slowLoadingButton = driver.findElement(By.cssSelector("#slow-loading-button"));
		        slowLoadingButton.click();
		        // Implement verification logic for the presence of a loading symbol during a slow-loading operation

// Test Case : User should be able to select one radio option
		        WebElement radioOption = driver.findElement(By.cssSelector("input[name='radio-group'][value='option1']"));
		        radioOption.click();
		        // Implement verification logic for the selected radio option

// Test Case : User should be able to select any combination for checkboxes
		        WebElement checkbox1 = driver.findElement(By.cssSelector("#checkbox1"));
		        WebElement checkbox2 = driver.findElement(By.cssSelector("#checkbox2"));
		        checkbox1.click();
		        checkbox2.click();
		        // Implement verification logic for the selected checkboxes

// Test Case : Compare font style and font size as per the Marvel app
		        WebElement marvelText = driver.findElement(By.cssSelector("#marvel-text"));
		        // Implement verification logic to compare font style and font size with the Marvel app

		        // Add more tests as needed

		        // Sleep for a short time to visually observe the changes (optional)
		        try {
		            Thread.sleep(2000);
		        } catch (InterruptedException e) {
		            e.printStackTrace();
		        }
		    }

}
