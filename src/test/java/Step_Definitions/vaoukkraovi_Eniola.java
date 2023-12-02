package Step_Definitions;

import Base.TestBase;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

public class vaoukkraovi_Eniola extends TestBase {


    @When("^I click on advertisers$")
    public void iClickOnAdvertisers() {
        driver.findElement(By.xpath("//*[@id=\"navigation\"]/div/div[1]/nav/div/div[2]/ul/li[2]")).click();

    }

    @And("^I click on media and services$")
    public void iClickOnMediaAndServices() {
        driver.findElement(By.xpath("//*[@id=\"navigation\"]/div/div[1]/nav/div/div[2]/ul/li[2]/ul/li[2]")).click();

    }

    @And("^I click on national consumers$")
    public void iClickOnNationalConsumers() {
        driver.findElement(By.xpath("//*[@id=\"navigation\"]/div/div[1]/nav/div/div[2]/ul/li[2]/ul/li[2]/ul/li[1]")).click();

    }

    @And("^I click on voukkraovi$")
    public void iClickOnVoukkraovi() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"navigation\"]/div/div[1]/nav/div/div[2]/ul/li[2]/ul/li[2]/ul/li[1]/ul/li/ul[1]/li[8]/a")).click();
        Thread.sleep(5000);
    }

    @Then("^I should be led to vuokkraovi landing page$")
    public void iShouldBeLedToVuokkraoviLandingPage() {
        String ExpectedHeadLineMessage = "Vuokraovi.com is the most comprehensive marketplace for rental housing in Finland";
        String ActualHeadLineMessage = driver.findElement(By.xpath("//*[@id=\"main\"]/div[1]/div[1]/div/div/div[3]")).getText();
        Assert.assertEquals(ExpectedHeadLineMessage, ActualHeadLineMessage);
        System.out.println(ActualHeadLineMessage);
    }
}


