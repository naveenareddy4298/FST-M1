package tests;

import base.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test02_VerifyHeading extends BaseTest {

    @Test
    public void verifyHeading() {
        String heading = driver.findElement(By.tagName("h1")).getText();
        Assert.assertEquals(heading, "Learn from Industry Experts");
    }
}
