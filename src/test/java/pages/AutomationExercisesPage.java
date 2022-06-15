package pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class AutomationExercisesPage {
    public AutomationExercisesPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "(//*[@class='container'])[2]")
    public WebElement Anasayfa;
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
    @FindBy(xpath = "(//h2)[1]")
    public WebElement loginAccountVisible;
    @FindBy(xpath = "//input[@data-qa='login-email']")
    public WebElement loginEmail;
    @FindBy(xpath = "//input[@placeholder='Password']")
    public WebElement loginPassword;
    @FindBy(xpath = "//button[normalize-space()='Login']")
    public WebElement loginButton;
    @FindBy(xpath = "//p[normalize-space()='Your email or password is incorrect!']")
    public WebElement incorrectUser;
    @FindBy(xpath = "//a[normalize-space()='Logout']")
    public WebElement logoutButton;
    @FindBy(xpath = "//p[normalize-space()='Email Address already exist!']")
    public WebElement emailAlreadyExists;
    @FindBy(xpath = "//a[normalize-space()='Contact us']")
    public WebElement contactUsButton;
    @FindBy(xpath = "//h2[normalize-space()='Get In Touch']")
    public WebElement getInTouchVisible;
    @FindBy(xpath = "//input[@placeholder='Name']")
    public WebElement contactName;
    @FindBy(xpath = "//input[@placeholder='Email']")
    public WebElement contactEmail;
    @FindBy(xpath = "//input[@placeholder='Subject']")
    public WebElement contactSubject;
    @FindBy(xpath = "//textarea[@id='message']")
    public WebElement contactMesaj;
    @FindBy(xpath = "//input[@name='upload_file']")
    public WebElement contactUploadFile;
    @FindBy(xpath = "//input[@name='submit']")
    public WebElement contactSubmitButton;
    @FindBy(xpath = "//div[@class='status alert alert-success']")
    public WebElement successMesaj;
    @FindBy(xpath = "//span[normalize-space()='Home']")
    public WebElement homeButton;
    @FindBy(xpath = "//a[contains(text(),'Test Cases')]")
    public WebElement testCasesButton;
    @FindBy(xpath = "//a[contains(text(),'Test Cases')]")
    public WebElement testCasesPage;
    @FindBy(xpath = "//a[@href='/products']")
    public WebElement productsButton;
    @FindBy(xpath = "//*[@class='features_items']")
    public WebElement allproductsVisible;
    @FindBy(xpath = "//*[@class='brands_products']")
    public WebElement productsVisible;
    @FindBy(xpath = "//*[@href='/product_details/1']")
    public WebElement firstProduct;
    @FindBy(xpath = "//*[@class='col-sm-9 padding-right']")
    public WebElement productDetails;
    @FindBy(xpath = "//*[@class='product-information']")
    public WebElement productsInformation;
    @FindBy(xpath = "//input[@id='search_product']")
    public WebElement searchProduct;
    @FindBy(xpath = "//i[@class='fa fa-search']")
    public WebElement searchButton;
    @FindBy(xpath = "//h2[@class='title text-center']")
    public WebElement searchProductVisible;
    @FindBy(xpath = "/html/body/section/div/div/div/div/div/div/div[1]/div[1]/p")
    public List<WebElement> products;
    @FindBy(xpath = "//*[@class='features_items']")
    public WebElement searchAllProductsVisible;











}
