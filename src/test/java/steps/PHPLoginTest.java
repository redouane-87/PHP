package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.PHPLogin;

import java.util.concurrent.TimeUnit;

public class PHPLoginTest {
    public static WebDriver driver;
    String URL= "https://www.phptravels.net/";
    PHPLogin phpLogin;


    @Given("user navigate to URL")
    public void user_navigate_to_url() {
        System.setProperty("webdriver.chrome.driver","c:\\Drivers\\chromedriver.exe\\");
        driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get(URL);



    }

    @And("user should see PHP travels home page")
    public void user_should_see_php_travels_home_page() {
        phpLogin= new PHPLogin(driver);


    }

    @Then("user make a reservation")
    public void user_make_a_reservation() {
        phpLogin= new PHPLogin(driver);
        phpLogin.MakeReservation();




    }



}
