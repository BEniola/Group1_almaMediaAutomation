package Step_Definitions;

import Base.TestBase;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

import java.io.IOException;

public class commonSteps extends TestBase {

    @Before
    public void setup() throws IOException {
        initialize();
    }

    @Given("^I am on the home page$")
    public void iAmOnTheHomePage() throws InterruptedException {
        WebDriverManager.edgedriver().setup();
        driver = new EdgeDriver();
        driver.manage().deleteAllCookies();
        driver.get(CONFIG.getProperty("URL"));
        driver.manage().window().maximize();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"almacmp-modalConfirmBtn\"]")).click();

    }
}