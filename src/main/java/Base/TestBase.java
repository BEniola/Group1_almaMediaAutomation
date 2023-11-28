package Base;

//import cucumber.api.java.ca.I;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class TestBase {
    public static Properties CONFIG = null;
    public static WebDriver driver = null;

    public void initialize() throws IOException {
        if (driver == null) {

            CONFIG = new Properties();
            FileInputStream fn = new FileInputStream(System.getProperty("user.dir") + "/src/main/java/config/config.properties");
            CONFIG.load(fn);


        }

    }
}
