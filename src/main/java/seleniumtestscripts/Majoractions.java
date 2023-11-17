package seleniumtestscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import okhttp3.Cookie;

public class Majoractions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\ahbiram\\Downloads\\geckodriver-v0.33.0-win64\\geckodriver.exe");

        // Create a new instance of the FirefoxDriver
        FirefoxDriver driver = new FirefoxDriver();
        driver.get("https://dev16.intersmarthosting.in/vidhya-shekhar/");
        // Navigate to a URL
        driver.get("https://www.example.com");

        // Find an element by ID and perform a click action
        WebElement clickElement = driver.findElement(By.id("elementId"));
        clickElement.click();

        // Find an element by name and enter text
        WebElement inputElement = driver.findElement(By.name("username"));
        inputElement.sendKeys("exampleuser");

        // Find a button by XPath and submit the form
        WebElement submitButton = driver.findElement(By.xpath("//button[@type='submit']"));
        submitButton.submit();

        // Handle dropdown using Select class
        WebElement dropdownElement = driver.findElement(By.id("dropdownId"));
        Select dropdown = new Select(dropdownElement);
        dropdown.selectByVisibleText("Option 1");

        // Perform keyboard actions using Actions class
        Actions actions = new Actions(driver);
        WebElement targetElement = driver.findElement(By.id("targetElementId"));
        actions.moveToElement(targetElement).perform();

        // Pressing Enter key
        actions.sendKeys(Keys.ENTER).perform();

        // Handling alerts
        WebElement alertButton = driver.findElement(By.id("alertButtonId"));
        alertButton.click();

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().accept();
     // Handling radio buttons
        WebElement radioButton = driver.findElement(By.id("radioButtonId"));
        radioButton.click();

        // Handling checkboxes
        WebElement checkBox = driver.findElement(By.id("checkBoxId"));
        if (!checkBox.isSelected()) {
            checkBox.click();
        }

        // Handling file uploads
        WebElement fileInput = driver.findElement(By.id("fileInputId"));
        fileInput.sendKeys("path/to/file.txt");

        // Capturing screenshots
        // Takes a screenshot and saves it to the specified file
        TakesScreenshot screenshot = ((TakesScreenshot) driver);
        File screenshotFile = screenshot.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenshotFile, new File("path/to/screenshot.png"));

        // Handling frames
        WebElement frameElement = driver.findElement(By.id("frameId"));
        driver.switchTo().frame(frameElement);
        // Perform actions inside the frame
        // ...

        // Handling dynamic waits
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement dynamicElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("dynamicElementId")));
        // Perform actions on the dynamically loaded element
        // ...

        // Handling multiple windows
        String mainWindowHandle = driver.getWindowHandle();
        WebElement openNewWindowButton = driver.findElement(By.id("openNewWindowButtonId"));
        openNewWindowButton.click();
        for (String windowHandle : driver.getWindowHandles()) {
            if (!windowHandle.equals(mainWindowHandle)) {
                driver.switchTo().window(windowHandle);
                // Perform actions in the new window
                // ...
                driver.close();
            }
        }
        driver.switchTo().window(mainWindowHandle);
        // Handling cookies
        // Add a new cookie
        Cookie cookie = new Cookie("cookieName", "cookieValue");
        driver.manage().addCookie(cookie);

        // Delete a specific cookie
        driver.manage().deleteCookie(cookie);

        // Delete all cookies
        driver.manage().deleteAllCookies();

        // Handling JavaScript execution
        // Execute JavaScript code
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript("alert('Hello, World!');");

        // Scroll the page
        jsExecutor.executeScript("window.scrollBy(0, 500);");

        // Handling mouse actions
        Actions actions = new Actions(driver);
        WebElement mouseOverElement = driver.findElement(By.id("mouseOverElementId"));
        // Hover over an element
        actions.moveToElement(mouseOverElement).perform();

        // Perform a right-click
        actions.contextClick(mouseOverElement).perform();

        // Perform a double-click
        actions.doubleClick(mouseOverElement).perform();

        // Drag and drop
        WebElement sourceElement = driver.findElement(By.id("sourceElementId"));
        WebElement targetElement = driver.findElement(By.id("targetElementId"));
        actions.dragAndDrop(sourceElement, targetElement).perform();
        try {
            // Navigate to a URL
            driver.get("https://www.example.com");

            // Handling iframes
            WebElement iframeElement = driver.findElement(By.id("iframeId"));
            driver.switchTo().frame(iframeElement);
            // Perform actions inside the iframe
            // ...

            // Switch back to the default content
            driver.switchTo().defaultContent();

            // Capture network traffic (requires browsermob-proxy library)
            BrowserMobProxy proxy = new BrowserMobProxyServer();
            proxy.start(0);
            Proxy seleniumProxy = ClientUtil.createSeleniumProxy(proxy);
            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability(CapabilityType.PROXY, seleniumProxy);
            WebDriver driverWithProxy = new ChromeDriver(capabilities);

            // Perform actions with the driverWithProxy
            // ...

            // Access captured network traffic
            Har har = proxy.getHar();
            // Analyze network traffic data
            // ...

            // Advanced interactions
            Actions actions = new Actions(driver);
            WebElement element = driver.findElement(By.id("elementId"));

            // Click and hold
            actions.clickAndHold(element).perform();

            // Move to element
            WebElement targetElement = driver.findElement(By.id("targetElementId"));
            actions.moveToElement(targetElement).perform();

            // Release
            actions.release().perform();

            // Context-click
            actions.contextClick(element).perform();

            // Double-click
            actions.doubleClick(element).perform();

            // Keyboard actions (e.g., keyDown, keyUp)
            actions.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();

        } finally {
        
        	
        	
        	
        	//
        	
        	//
        	
        	//// Close the browser window
	}

	}}
