import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;


public class Checkboxes {
    @Test

    public void fistCheckboxIsUnchecked(){
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/checkboxes\n");
        WebElement option1 = driver.findElement(By.xpath("//input[@type='checkbox']"));
        Assert.assertEquals(false, option1.isSelected(), "Чекбокс№1 выбран");
        driver.quit();
    }
    @Test

    public void fistCheckboxIsChecked(){
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/checkboxes\n");
        WebElement option1 = driver.findElement(By.xpath("//input[@type='checkbox']"));
        option1.click();
        Assert.assertEquals(true, option1.isSelected(), "Чекбокс№1 не выбран");
        driver.quit();
    }
    @Test

    public void secondCheckboxIsChecked(){
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/checkboxes\n");
        List<WebElement> listofelements = driver.findElements(By.xpath("(//*[@type = 'checkbox'])"));
        WebElement option2 = listofelements.get(1);
        Assert.assertEquals(true, option2.isSelected(), "Чекбокс№2 не выбран");
        driver.quit();
    }
    @Test

    public void secondCheckboxIsUnchecked(){
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/checkboxes\n");
        new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[@type='checkbox'])[2]")));
        WebElement option2 = driver.findElement(By.xpath("(//*[@type='checkbox'])[2]"));
        option2.click();
        Assert.assertEquals(false, option2.isSelected(), "Чекбокс№2 не выбран");
        driver.quit();
    }
}
