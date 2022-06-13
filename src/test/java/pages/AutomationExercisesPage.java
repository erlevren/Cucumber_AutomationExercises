package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AutomationExercisesPage {
    public AutomationExercisesPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//html")
    public WebElement sayfa;
    @FindBy(xpath = "//a[normalize-space()='Signup / Login']")
    public WebElement login;
    @FindBy(xpath = "(//h2)[3]")
    public WebElement newUser;
    @FindBy(xpath = "//input[@placeholder='Name']")
    public WebElement name;
    @FindBy(xpath = "//input[@data-qa='signup-email']")
    public WebElement email;
    @FindBy(xpath = "//button[normalize-space()='Signup']")
    public WebElement signup;
    @FindBy(xpath = "(//h2)[1]")
    public WebElement enterAccountVisible;
    @FindBy(xpath = "//input[@id='id_gender1']")
    public WebElement title;
    @FindBy(xpath = "//input[@id='newsletter']")
    public WebElement newsletter;
    @FindBy(xpath = "//input[@id='optin']")
    public WebElement receive;
    @FindBy(xpath = "//button[normalize-space()='Create Account']")
    public WebElement createAccount;
    @FindBy(xpath = "//b[normalize-space()='Account Created!']")
    public WebElement AccountCreatedVisible;
    @FindBy(xpath = "//a[@class='btn btn-primary']")
    public WebElement continueButton;
    @FindBy(xpath = "//*[text()=' Logged in as ']")
    public WebElement loggedText;
    @FindBy(xpath = "//a[normalize-space()='Delete Account']")
    public WebElement deleteAccount;
    @FindBy(xpath = "//h1")
    public WebElement deleteAccountText;
    @FindBy(xpath = "//input[@id='password']")
    public WebElement password;
    @FindBy(xpath = "//select[@id='days']")
    public WebElement date;


}
