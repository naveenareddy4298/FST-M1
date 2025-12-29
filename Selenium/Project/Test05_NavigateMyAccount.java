package tests;

import base.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test05_NavigateMyAccount extends BaseTest {

    @Test
    public void navigateMyAccount() {
        driver.findElement(By.linkText("My Account")).click();
        String title = driver.getTitle();
        Assert.assertTrue(title.contains("My Account"));
    }
}
