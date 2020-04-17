import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class Tables {
        @Test

    public void lastNameTest(){
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/tables\n");
        String smith = driver.findElement(By.xpath("//table/tbody/tr[1]/td[1]")).getText();
        String bach = driver.findElement(By.xpath("//table/tbody/tr[2]/td[1]")).getText();
        String doe = driver.findElement(By.xpath("//table/tbody/tr[3]/td[1]")).getText();
        String conway = driver.findElement(By.xpath("//table/tbody/tr[4]/td[1]")).getText();
        String lastnames = smith + " " + bach + " " + doe + " " +conway;
        System.out.println(lastnames);
        Assert.assertEquals(lastnames, "Smith Bach Doe Conway" , "Строки не совпадают");
        driver.quit();
    }
    @Test

    public void firstNameTest(){
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/tables\n");
        String smith = driver.findElement(By.xpath("//table/tbody/tr[1]/td[2]")).getText();
        String bach = driver.findElement(By.xpath("//table/tbody/tr[2]/td[2]")).getText();
        String doe = driver.findElement(By.xpath("//table/tbody/tr[3]/td[2]")).getText();
        String conway = driver.findElement(By.xpath("//table/tbody/tr[4]/td[2]")).getText();
        String firstNames = smith + " " + bach + " " + doe + " " +conway;
        Assert.assertEquals(firstNames, "John Frank Jason Tim" , "Строки не совпадают");
        driver.quit();
    }
    @Test

    public void emailsTest(){
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/tables\n");
        String smith = driver.findElement(By.xpath("//table/tbody/tr[1]/td[3]")).getText();
        String bach = driver.findElement(By.xpath("//table/tbody/tr[2]/td[3]")).getText();
        String doe = driver.findElement(By.xpath("//table/tbody/tr[3]/td[3]")).getText();
        String conway = driver.findElement(By.xpath("//table/tbody/tr[4]/td[3]")).getText();
        String emails = smith + " " + bach + " " + doe + " " +conway;
        System.out.println(emails);
        Assert.assertEquals(emails, "jsmith@gmail.com fbach@yahoo.com jdoe@hotmail.com tconway@earthlink.net" , "Строки не совпадают");
        driver.quit();
    }
    @Test

    public void dueTest(){
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/tables\n");
        String smith = driver.findElement(By.xpath("//table/tbody/tr[1]/td[4]")).getText();
        String bach = driver.findElement(By.xpath("//table/tbody/tr[2]/td[4]")).getText();
        String doe = driver.findElement(By.xpath("//table/tbody/tr[3]/td[4]")).getText();
        String conway = driver.findElement(By.xpath("//table/tbody/tr[4]/td[4]")).getText();
        String dues = smith + " " + bach + " " + doe + " " +conway;
        System.out.println(dues);
        Assert.assertEquals(dues, "$50.00 $51.00 $100.00 $50.00" , "Строки не совпадают");
        driver.quit();
    }
    @Test

    public void webSitesTest(){
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/tables\n");
        String smith = driver.findElement(By.xpath("//table/tbody/tr[1]/td[5]")).getText();
        String bach = driver.findElement(By.xpath("//table/tbody/tr[2]/td[5]")).getText();
        String doe = driver.findElement(By.xpath("//table/tbody/tr[3]/td[5]")).getText();
        String conway = driver.findElement(By.xpath("//table/tbody/tr[4]/td[5]")).getText();
        String dues = smith + " " + bach + " " + doe + " " +conway;
        System.out.println(dues);
        Assert.assertEquals(dues, "http://www.jsmith.com http://www.frank.com http://www.jdoe.com http://www.timconway.com" , "Строки не совпадают");
        driver.quit();
    }

}
