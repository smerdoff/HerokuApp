import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;

@Listeners(TestListener.class)
public class BaseCalculatorTest  {

    Calculator calculator;

    @BeforeMethod
    public  void beforeMethod() {
        System.out.println("Creation of new calc: ");
        calculator = new Calculator();
    }

    @AfterMethod(alwaysRun = true)
    public void afterMethod() {
        System.out.println("Closing the calc");
    }

}
