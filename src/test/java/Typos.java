import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class Typos {

    @Test
    public void firstLineIsChecked(){
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/typos\n");
        WebElement string1 = driver.findElement(By.tagName("p"));
        String actualString = string1.getText();
        String expectedString = "This example demonstrates a typo being introduced. It does it randomly on each page load.";
        Assert.assertEquals(expectedString,actualString , "Есть ошибка в первой строке");
        driver.quit();
    }

    @Test
    public void secondLineIsChecked(){
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/typos\n");
        List<WebElement> listoflines = driver.findElements(By.tagName("p"));
        WebElement line2 = listoflines.get(1);
        String actualLine = line2.getText();
        String expectedLine = "Sometimes you'll see a typo, other times you won't.";
        Assert.assertEquals(expectedLine,actualLine , "Есть ошибка во второй строке");
        driver.quit();
    }
}
