package pages;

import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {

    String element1 = "//input[@name='username']";
    String element2 = "//input[@name='password']";
    String element3 = "//button[@type='submit']";
    String element4 = "//div[contains(@class, 'topbar')]//h6[text()='Dashboard']";

    public LoginPage(WebDriver driver) {
        super(driver);
    }
    public void navigateToOrange() {
        navigateTo("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }
    public void sendUser(String usuario) {
        this.write(element1, usuario);
    }
    public void sendPass(String contraseña) {
        this.write(element2, contraseña);
    }
    public void clickSubmit(){
        this.clickElement(element3);
    }
    public void textValidate(){
        this.textValidate(element4);
    }
    public void closessBrowser(){
        this.closeBrowser();
    }


}
