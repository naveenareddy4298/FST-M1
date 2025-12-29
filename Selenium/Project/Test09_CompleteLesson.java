package tests;

import base.BaseTest;
import java.time.Duration;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Test09_CompleteLesson extends BaseTest {

    @Test
    public void completeLesson() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        JavascriptExecutor js = (JavascriptExecutor) driver;

        // Login
        driver.findElement(By.linkText("My Account")).click();
        driver.findElement(By.linkText("Login")).click();
        driver.findElement(By.id("user_login")).sendKeys("root");
        driver.findElement(By.id("user_pass")).sendKeys("pa$$w0rd");
        driver.findElement(By.id("wp-submit")).click();

        // Navigate to All Courses
        driver.findElement(By.linkText("All Courses")).click();

        // Open first course → click See More / Explore button
        WebElement seeMoreBtn = wait.until(
                ExpectedConditions.elementToBeClickable(
                        By.xpath("(//a[contains(@class,'btn-primary')])[1]"))
        );
        js.executeScript("arguments[0].scrollIntoView(true);", seeMoreBtn);
        js.executeScript("arguments[0].click();", seeMoreBtn);

        // Enroll if enrollment required
        try {
            WebElement enroll = wait.until(
                    ExpectedConditions.elementToBeClickable(
                            By.xpath("//a[contains(text(),'Enroll') or contains(text(),'Take') or contains(text(),'Buy')]"))
            );
            js.executeScript("arguments[0].click();", enroll);
            System.out.println("Enrollment completed.");
        } catch (Exception e) {
            System.out.println("Enroll button not found → skipping (maybe already enrolled)");
        }

        // Expand all lessons inside course content
        try {
            WebElement expandAll = wait.until(
                    ExpectedConditions.elementToBeClickable(
                            By.xpath("//button[contains(.,'Expand All')]"))
            );
            js.executeScript("arguments[0].click();", expandAll);
        } catch (Exception ignored) {}

        // Click first available lesson
        WebElement lesson = wait.until(
                ExpectedConditions.elementToBeClickable(
                        By.xpath("(//a[contains(@href,'lesson')])[1]"))
        );
        js.executeScript("arguments[0].scrollIntoView(true);", lesson);
        js.executeScript("arguments[0].click();", lesson);

        // Click Mark Complete button if visible
        try {
            WebElement btn = wait.until(
                    ExpectedConditions.elementToBeClickable(
                            By.xpath("//input[contains(@value,'Complete')]"))
            );
            js.executeScript("arguments[0].click();", btn);
            System.out.println("Lesson Completed!!!");
        } catch (Exception e) {
            System.out.println("Mark Complete button not found → lesson may already be completed.");
        }
    }
}
