import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegistrationPage {
WebDriver driver;
By RegLink= By.linkText("Create new account");
    By Yourname= By.name("customerName");
    By Email= By.name("email");
  //  By email= By.name("email");
    By password= By.name("password");
    By passwordcheck= By.name("passwordcheck");


    public RegistrationPage(WebDriver d){
        driver = d;
    }
    public void clickRegLink(){
        driver.findElement(RegLink).click();
    }

    public void setYourname(String s){

        driver.findElement(Yourname).sendKeys("pooja");
    }
    public void setEmail(String s){

        driver.findElement(Email).sendKeys("9075977636");
    }
    public void setPassword(String s){
        driver.findElement(password).sendKeys("password");
    }
    }
