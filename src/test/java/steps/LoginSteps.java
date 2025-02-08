package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;
import pages.BasePage;
import org.openqa.selenium.WebDriver;

public class LoginSteps {
    private WebDriver driver;
    private LoginPage loginPage;

    public LoginSteps() {
        this.driver = BasePage.initializeDriver();
        this.loginPage = new LoginPage(this.driver);
    }

    @Given("^El usuario está en la página de inicio de sesión$")
    public void navigateEkogui() {
        this.loginPage.navigateToOrange();
    }

    @When("El usuario ingresa la cedula y la contraseña")
    public void enterData() {
        this.loginPage.sendUser("Admin");
        this.loginPage.sendPass("admin123");
    }

    @And("^El usuario hace clic en el botón de Entrar$")
    public void clickEntrar() {
        this.loginPage.clickSubmit();
    }

    @Then("^El usuario debe ser redirigido a Dashboard")
    public void screenOrange() {
        this.loginPage.textValidate();
        this.loginPage.closessBrowser();
    }
}
