import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;


public class AddRemoveElements {

    @Test
    public void addElements(){
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/add_remove_elements/\n");
        driver.findElement(By.xpath("//*[@onclick= 'addElement()']")).click();
        driver.findElement(By.xpath("//*[@onclick= 'addElement()']")).click();
        driver.findElement(By.xpath("//*[@onclick= 'addElement()']")).click();
        List<WebElement> list = driver.findElements(By.className("added-manually"));
        Assert.assertEquals(3, list.size(), "Количество добавленных элементов не совпадает");
        driver.quit();
    }

    @Test
    public void deleteElements(){
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/add_remove_elements/\n");
        driver.findElement(By.xpath("//*[@onclick= 'addElement()']")).click();
        driver.findElement(By.xpath("//*[@onclick= 'addElement()']")).click();
        driver.findElement(By.xpath("//*[@onclick= 'addElement()']")).click();
        driver.findElement(By.xpath("//*[@onclick= 'addElement()']")).click();
        driver.findElement(By.xpath("//*[@onclick= 'deleteElement()']")).click();
        driver.findElement(By.xpath("//*[@onclick= 'deleteElement()']")).click();
        List <WebElement> list = driver.findElements(By.className("added-manually"));
        Assert.assertEquals(2, list.size(), "Количество добавленных элементов не совпадает");
        driver.quit();
    }
}

