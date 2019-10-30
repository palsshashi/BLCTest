package Tests;

import java.util.List;
import java.util.concurrent.TimeUnit;

import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class RegistrationTest {
    WebDriver driver;

    @Given("^User is on Home Page$")
    public void user_is_on_Home_Page() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.setProperty("webdriver.chrome.driver","C:\\Sealights\\DemoSite\\braodleafcucumbertests\\src\\test\\resources\\Drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://localhost:8443");
        //throw new PendingException();
    }

    @When("^User Navigate to Register Page$")
    public void user_Navigate_to_Register_Page() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
        driver.findElement(By.xpath("//*[@id=\"sectionsNav\"]/div/div[1]/ul[2]/li[1]/a")).click();
        Thread.sleep(2000);

    }

    @When("^User enters Mandatory details$")
    public void user_enters_Mandatory_details() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
       // throw new PendingException();
        driver.findElement(By.xpath("//*[@id=\"customer.emailAddress\"]")).sendKeys("rroy@wipro.com");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"customer.firstName\"]")).sendKeys("rajib");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"customer.lastName\"]")).sendKeys("roy");
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//*[@id=\"password\"])[2]")).sendKeys("abc12$");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"passwordConfirm\"]")).sendKeys("abc12$");
        Thread.sleep(2000);
    }

    @Then("^Message is displayed \"([^\"]*)\"$")
    public void message_is_displayed(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
        driver.findElement(By.xpath("//*[@id=\"registrationForm\"]/button")).click();
        Thread.sleep(2000);
        driver.close();
    }




}