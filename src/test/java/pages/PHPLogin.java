package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class PHPLogin {
    public WebDriver driver;

    //class constructor

    public PHPLogin(WebDriver driver){

        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(linkText = "Featured Hotels")
    List<WebElement> hotels;

    public int MakeReservation(){

         return hotels.size();
        System.out.println(hotels.size());





    }
}

