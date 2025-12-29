package tests;

import base.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test04_VerifySecondCourse extends BaseTest {

    @Test
    public void verifySecondCourse() {
        String text = driver.findElement(By.xpath("(//h3[@class='uagb-ifb-title'])[2]")).getText();
        Assert.assertEquals(text, "Interesting Quizzes");
    }
}
