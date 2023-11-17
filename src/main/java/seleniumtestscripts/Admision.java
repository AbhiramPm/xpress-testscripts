package seleniumtestscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Admision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\ahbiram\\Downloads\\geckodriver-v0.33.0-win64\\geckodriver.exe");

        // Create a new instance of the FirefoxDriver
        FirefoxDriver driver = new FirefoxDriver();
        driver.get("https://dev16.intersmarthosting.in/vidhya-shekhar/");
      //  Verify Presence of Counter Section 
        WebElement counterSection = driver.findElement(By.id("counterSec"));

        if (counterSection.isDisplayed()) {
            System.out.println("Counter section is present on the page.");
        } else {
            System.out.println("Counter section is not present on the page.");
        }
	// Verify Counts
        WebElement studentsCount = counterSection.findElement(By.xpath("//*[@id=\"counterSec\"]/div/div[2]/div/div[1]/div/div/div/img"));
        WebElement teachersCount = counterSection.findElement(By.cssSelector(".num [data-count='700']"));
        WebElement awardsCount = counterSection.findElement(By.cssSelector(".num [data-count='35']"));
        WebElement coursesCount = counterSection.findElement(By.cssSelector(".num [data-count='10']"));

        System.out.println("Number of Students: " + studentsCount.getText());
        System.out.println("Number of Teachers: " + teachersCount.getText());
        System.out.println("Number of Awards: " + awardsCount.getText());
        System.out.println("Number of Courses: " + coursesCount.getText());
        
        
        //Verify icons
        WebElement awardIcon = counterSection.findElement(By.cssSelector(".icon img[src*='award.svg']"));
        WebElement courseIcon = counterSection.findElement(By.cssSelector(".icon img[src*='course.svg']"));
        WebElement studentIcon = counterSection.findElement(By.cssSelector(".icon img[src*='student.svg']"));
        WebElement teacherIcon = counterSection.findElement(By.cssSelector(".icon img[src*='teacher.svg']"));

        if (awardIcon.isDisplayed() && courseIcon.isDisplayed() && studentIcon.isDisplayed() && teacherIcon.isDisplayed()) {
            System.out.println("All icons are displayed.");
        } else {
          
        	System.out.println("Some icons are missing.");
            
        }
	
	}
	
	

}
