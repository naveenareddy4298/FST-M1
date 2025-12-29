package tests;

import base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import java.util.List;

public class Test07_CountCourses extends BaseTest {

    @Test
    public void countCourses() {
        driver.findElement(By.linkText("All Courses")).click();
        List<WebElement> courses = driver.findElements(By.className("entry-title"));
        System.out.println("Total courses: " + courses.size());
    }
}
