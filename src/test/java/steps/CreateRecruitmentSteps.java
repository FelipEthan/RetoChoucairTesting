package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.BasePage;
import pages.CreateProcessRecruitmentPage;


public class CreateRecruitmentSteps {
    private WebDriver driver;
    private CreateProcessRecruitmentPage createProcessRecruitmentPage;

    public CreateRecruitmentSteps() {
        this.driver = BasePage.initializeDriver();
        this.createProcessRecruitmentPage = new CreateProcessRecruitmentPage(this.driver);
    }

    @Given("^El usuario está en la página de inicio de sesión Orange$")
    public void navigateOrange() {
        this.createProcessRecruitmentPage.navegarOrange();
    }

    @When("El usuario ingresa la cedula y la contraseña Orange")
    public void enterDataOrange() {
        this.createProcessRecruitmentPage.sendUser("Admin");
        this.createProcessRecruitmentPage.sendPass("admin123");
    }

    @And("^El usuario hace clic en el botón de Entrar Orange$")
    public void clickEntrarOrange() {
        this.createProcessRecruitmentPage.clickSubmit();
    }

    @Then("^El usuario debe ser redirigido a Dashboard Orange")
    public void screenOrange() {
        this.createProcessRecruitmentPage.textValidate();
    }
    @And("El usuario hace clic en Recruitment Orange y en agregar")
    public void clicKRecruitment() {
        this.createProcessRecruitmentPage.clickRecruitment();
        this.createProcessRecruitmentPage.clickAdd();
        this.createProcessRecruitmentPage.sendNombre("Juan");
        this.createProcessRecruitmentPage.sendMiddle("David");
        this.createProcessRecruitmentPage.sendLastName("Quimbayo");
        this.createProcessRecruitmentPage.clickPosition();
        this.createProcessRecruitmentPage.sendPosition("s");
        this.createProcessRecruitmentPage.sendEmail("afquimbayo@gmail.com");
        this.createProcessRecruitmentPage.sendContact("312021253");
        this.createProcessRecruitmentPage.sendKey();
        this.createProcessRecruitmentPage.sendNotes();
        this.createProcessRecruitmentPage.clickSave();
        this.createProcessRecruitmentPage.cerrarNavegador();

    }
}