package pages;

import org.openqa.selenium.WebDriver;

public class CreateProcessRecruitmentPage extends BasePage{

    String element1 = "//input[@name='username']";
    String element2 = "//input[@name='password']";
    String element3 = "//button[@type='submit']";
    String element4 = "//div[contains(@class, 'topbar')]//h6[text()='Dashboard']";
    String element5 = "//span[text()='Recruitment']";
    String element6 = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[1]/button";
    String element7 = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div/div/div[2]/div[1]/div[2]/input";
    String element8 = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div/div/div[2]/div[2]/div[2]/input";
    String element9  = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div/div/div[2]/div[3]/div[2]/input";
    String element10  = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div/div/div[2]/div/div/div[1]";
    String element11  = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div/div/div[2]/div/div/div[1]";
    String element12  = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[3]/div/div[1]/div/div[2]/input";
    String element13  = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[3]/div/div[2]/div/div[2]/input";
    String element14  = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[5]/div/div[1]/div/div[2]/input";
    String element15  = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[6]/div/div/div/div[2]/textarea";
    String element16  = "//button[normalize-space()='Save']";
    String element17  = "//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[1]";



    public CreateProcessRecruitmentPage(WebDriver driver) {
        super(driver);
    }
    public void navegarOrange() {
        navigateTo("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }


    public void sendUser(String value) {
        this.write(element1, value);
    }

    public void sendPass(String value) {
        this.write(element2, value);
    }

    public void clickSubmit() {
        this.clickElement(element3);
    }
    public void textValidate(){
        this.textValidate(element4);

    }
    public void clickRecruitment(){
        this.clickElement(element5);
    }
    public void clickAdd(){
        this.clickElement(element6);
    }
    public void sendNombre(String value) {
        this.write(element7, value);
    }
    public void sendMiddle(String value) {
        this.write(element8, value);
    }
    public void sendLastName(String value) {
        this.write(element9, value);
    }
    public void clickPosition(){
        this.clickElement(element10);
    }

    public void sendPosition(String value) {
        this.writeAndSubmit(element11, value);
    }
    public void sendEmail(String value) {
        this.write(element12, value);
    }
    public void sendContact(String value) {
        this.write(element13, value);
    }
    public void sendKey() {
        this.write(element14, "Lorem Ipsum es simplemente el texto de relleno de las imprentas y archivos de texto.");
    }
    public void sendNotes() {
        this.write(element15, "Lorem Ipsum es simplemente el texto de relleno de las imprentas y archivos de texto. Lorem Ipsum ha sido el texto de relleno estándar de las industrias desde el año 1500.");
    }
    public void clickSave() {
        this.clickElement(element16);
    }
    public void cerrarNavegador(){
        this.closeNavigate();
    }

}

