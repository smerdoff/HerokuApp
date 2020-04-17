import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class Inputs {

    @Test
    public void enterCorrectValue(){
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/inputs\n");
        WebElement input =  driver.findElement(By.xpath("//input[@type='number']"));
        input.sendKeys("12");
        String currentValue = input.getAttribute("value");
        Assert.assertEquals("12", currentValue, "Значение первого значения не совпадает с ожидаемым");
        driver.quit();
    }

    @Test
    public void enterIncorrectValue(){
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/inputs\n");
        WebElement input =  driver.findElement(By.xpath("//input[@type='number']"));
        input.sendKeys("ssss");
        String currentValue = input.getAttribute("value");
        Assert.assertEquals("", currentValue, "Введённое значение не совпадает с ожидаемым");
        driver.quit();
    }

    @Test
    public void increaseValue(){
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/inputs\n");
        WebElement input =  driver.findElement(By.xpath("//input[@type='number']"));
        int randomValue = (int) (Integer.MIN_VALUE + Math.random() * Integer.MAX_VALUE);
        String stringRandom = Integer.toString(randomValue);
        input.sendKeys(stringRandom);
        input.sendKeys(Keys.ARROW_UP);
        randomValue++;
        String expectedValue = Integer.toString(randomValue);
        String currentValue = input.getAttribute("value");
        Assert.assertEquals(expectedValue, currentValue, "Значение первого значения не совпадает с ожидаемым");
        driver.quit();
    }

    @Test
    public void decreaseValue(){
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/inputs\n");
        WebElement input =  driver.findElement(By.xpath("//input[@type='number']"));
        int randomValue = (int) (Integer.MIN_VALUE + Math.random() * Integer.MAX_VALUE);
        String stringRandom = Integer.toString(randomValue);
        input.sendKeys(stringRandom);
        input.sendKeys(Keys.ARROW_DOWN);
        randomValue--;
        String expectedValue = Integer.toString(randomValue);
        String currentValue = input.getAttribute("value");
        Assert.assertEquals(expectedValue, currentValue, "Значение первого значения не совпадает с ожидаемым");
        driver.quit();
    }
}
