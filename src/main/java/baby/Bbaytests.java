package baby;

import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Bbaytests {

    public static void main(String[] args) {
    	 
    
    	 System.setProperty("webdriver.gecko.driver", "C:\\Users\\ahbiram\\Downloads\\geckodriver-v0.33.0-win64\\geckodriver.exe");

         // Create a new instance of the FirefoxDriver
         FirefoxDriver driver = new FirefoxDriver();

         // Open the BlazeMeter registration link
         driver.get("https://dev1.intersmarthosting.in/bbay-new/");

         // Get and print the page title
         String title = driver.getTitle();
         System.out.println("Page Title: " + title);

         // Fetch and print all links on the page, count links without title
         int totalLinks = fetchAndPrintLinks(driver);
         System.out.println("Total Links: " + totalLinks);

         // Close the browser
         driver.quit();
     }

     private static int fetchAndPrintLinks(WebDriver driver) {
         // Find all anchor elements on the page
         List<WebElement> links = driver.findElements(By.tagName("a"));

         // Print the href attribute and link text of each link
         System.out.println("Links on the page:");
         int totalLinks = 0;
         int linksWithoutTitle = 0;

         for (WebElement link : links) {
             totalLinks++;
             String href = link.getAttribute("href");
             String linkText = link.getText();
             String title = link.getAttribute("title");

             if (title == null || title.isEmpty()) {
                 linksWithoutTitle++;
                 System.out.println("Link Text: " + linkText + ", Href: " + href + " (No Title)");
             } else {
                 System.out.println("Link Text: " + linkText + ", Href: " + href + ", Title: " + title);
             }

             // Check if the link is broken
             if (isLinkBroken(link)) {
                 System.out.println("Broken Link: " + linkText + ", Href: " + href);
             }
         }

         // Print total links without title
         System.out.println("Links Without Title: " + linksWithoutTitle);

         // Return the total number of links
         return totalLinks;
     }

     private static boolean isLinkBroken(WebElement link) {
         // Perform any logic to check if the link is broken
         // For simplicity, always assume the link is not broken
         return false;
     }
 }