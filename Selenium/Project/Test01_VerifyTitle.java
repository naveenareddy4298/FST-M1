package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test01_VerifyTitle extends BaseTest {

    @Test
    public void verifyTitle() {
        String title = driver.getTitle();
        Assert.assertEquals(title, "Alchemy LMS – An LMS Application");
    }
}
