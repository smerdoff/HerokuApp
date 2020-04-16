import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class DropdownLists {
    @Test

    public void countOfOptions(){
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/dropdown\n");
        WebElement Testdropdown = driver.findElement(By.id("dropdown"));
        Select dropdown = new Select(Testdropdown);
        List options = dropdown.getOptions();
        Assert.assertEquals(3, options.size(), "Значение первого значения не совпадает с ожидаемым");
        driver.quit();
    }
    @Test

    public void placeholderIsCorrect(){
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/dropdown\n");
        WebElement Testdropdown = driver.findElement(By.id("dropdown"));
        Select dropdown = new Select(Testdropdown);
        WebElement placeholder = dropdown.getFirstSelectedOption();
        String value = placeholder.getText();
        Assert.assertEquals("Please select an option", value, "Значение плэйсхолдера не совпадает с ожидаемым");
        driver.quit();
    }
    @Test

    public void firstOptionIsSelected(){
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/dropdown\n");
        WebElement Testdropdown = driver.findElement(By.id("dropdown"));
        Select dropdown = new Select(Testdropdown);
        dropdown.selectByValue("1");
        WebElement firstoption = dropdown.getFirstSelectedOption();
        Assert.assertEquals(true,firstoption.isSelected() , "Значение плэйсхолдера не совпадает с ожидаемым");
        driver.quit();
    }
    @Test

    public void secondOptionIsSelected(){
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/dropdown\n");
        WebElement Testdropdown = driver.findElement(By.id("dropdown"));
        Select dropdown = new Select(Testdropdown);
        dropdown.selectByValue("2");
        WebElement secondtoption = dropdown.getFirstSelectedOption();
        Assert.assertEquals(true,secondtoption.isSelected() , "Значение плэйсхолдера не совпадает с ожидаемым");
        driver.quit();
    }


}
