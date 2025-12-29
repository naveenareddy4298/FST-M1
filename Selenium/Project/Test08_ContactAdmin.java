package tests;

import base.BaseTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Test08_ContactAdmin extends BaseTest {

	@Test
	public void contactAdmin() {

	    driver.findElement(By.linkText("Contact")).click();

	    driver.findElement(By.name("wpforms[fields][0]")).sendKeys("Naveena");
	    driver.findElement(By.name("wpforms[fields][1]")).sendKeys("test@gmail.com");
	    driver.findElement(By.name("wpforms[fields][2]")).sendKeys("Query");
	    driver.findElement(By.name("wpforms[fields][3]")).sendKeys("Checking form automation test.");

	    driver.findElement(By.cssSelector("button[type='submit']")).click();

	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

	    WebElement confirmation = wait.until(
	            ExpectedConditions.visibilityOfElementLocated(
	                    By.xpath("//div[contains(@class,'wpforms-confirmation')]")
	            )
	    );

	    System.out.println("Form submitted successfully: " + confirmation.getText());
	}


    
}
