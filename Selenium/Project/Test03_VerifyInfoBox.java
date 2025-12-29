package tests;

import base.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test03_VerifyInfoBox extends BaseTest {

    @Test
    public void verifyInfoBox() {
        String text = driver.findElement(By.xpath("(//h3)[1]")).getText();
        Assert.assertEquals(text, "Actionable Training");
    }
}
