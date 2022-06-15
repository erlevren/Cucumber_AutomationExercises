package stepDefinitions;
import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.AutomationExercisesPage;
import utilities.ConfigReader;
import utilities.Driver;

import java.time.Duration;

public class AutoExeStepDefinition {
    AutomationExercisesPage auto = new AutomationExercisesPage();
    Faker faker = new Faker();
    Actions actions=new Actions(Driver.getDriver());
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(20));
    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
    @Given("Navigate to url {string}")
    public void navigateToUrl(String istenenUrl) {
        Driver.getDriver().get(ConfigReader.getProperty(istenenUrl));
    }

    @Then("Verify that home page is visible successfully")
    public void verifyThatHomePageIsVisibleSuccessfully() {
        Assert.assertTrue(auto.Anasayfa.isDisplayed());
    }
    @And("Click on SignupLogin button")
    public void clickOnSignupLoginButton() {
        auto.login.click();
    }
    @And("Verify New User Signup is visible")
    public void verifyNewUserSignupIsVisible() {
        Assert.assertTrue(auto.newUser.isDisplayed());
    }
    @And("Enter name and email address")
    public void enterNameAndEmailAddress() {
        auto.name.sendKeys(faker.name().fullName());
        auto.email.sendKeys(faker.internet().emailAddress());
    }
    @And("Click Signup button")
    public void clickSignupButton() {
        auto.signup.click();
    }

    @And("Verify that ENTER ACCOUNT INFORMATION is visible")
    public void verifyThatENTERACCOUNTINFORMATIONIsVisible() {
        Assert.assertTrue(auto.enterAccountVisible.isDisplayed());
    }

    @And("Fill details: Title, Name, Email, Password, Date of birth")
    public void fillDetailsTitleNameEmailPasswordDateOfBirth() {

        auto.title.click();
        auto.password.sendKeys(faker.internet().password());
        actions.sendKeys(Keys.TAB).sendKeys("7").sendKeys(Keys.TAB)
                .sendKeys("May").sendKeys(Keys.TAB).sendKeys("1983").perform();
    }
    @And("Select checkbox Sign up for our newsletter")
    public void selectCheckboxSignUpForOurNewsletter() {
        auto.newsletter.click();

    }
    @And("Select checkbox Receive special offers from our partners")
    public void selectCheckboxReceiveSpecialOffersFromOurPartners() {
        auto.receive.click();
        actions.sendKeys(Keys.TAB)
                .sendKeys(faker.name().firstName())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.name().lastName())
                .sendKeys(Keys.TAB)
                .sendKeys("cosmos")
                .sendKeys(Keys.TAB)
                .sendKeys("adress adresss")
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys("Canada")
                .sendKeys(Keys.TAB)
                .sendKeys("asdasdas")
                .sendKeys(Keys.TAB)
                .sendKeys("toronto")
                .sendKeys(Keys.TAB)
                .sendKeys("213213")
                .sendKeys(Keys.TAB)
                .sendKeys(faker.phoneNumber().phoneNumber())
                .sendKeys(Keys.TAB).click().perform();
    }

    @And("Click Create Account button")
    public void clickCreateAccountButton() {
        auto.createAccount.click();
    }
    @And("Verify that ACCOUNT CREATED is visible")
    public void verifyThatACCOUNTCREATEDIsVisible() {
        Assert.assertTrue(auto.AccountCreatedVisible.isDisplayed());
    }
    @And("Click Continue button")
    public void clickContinueButton() {
        auto.continueButton.click();
    }
    @And("Verify that Logged in as username is visible")
    public void verifyThatLoggedInAsUsernameIsVisible() {
        Assert.assertTrue(auto.loggedText.isDisplayed());
    }
    @And("Click Delete Account button")
    public void clickDeleteAccountButton() {
        auto.deleteAccount.click();
    }
    @And("Verify that ACCOUNT DELETED is visible and click Continue button")
    public void verifyThatACCOUNTDELETEDIsVisibleAndClickContinueButton() {
        Assert.assertTrue(auto.deleteAccountText.isDisplayed());
    }


    @And("wait {int} second")
    public void waitSecond(int second) {
        try {
            Thread.sleep(second*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @And("Verify Login to your account is visible")
    public void verifyLoginToYourAccountIsVisible() {
        Assert.assertTrue(auto.loginAccountVisible.isDisplayed());
    }

    @And("Enter correct email address and password")
    public void enterCorrectEmailAddressAndPassword() {
        auto.loginEmail.sendKeys("ydu82@hotmail.com");
        auto.loginPassword.sendKeys("123456");
    }

    @And("Click login button")
    public void clickLoginButton() {
        auto.loginButton.click();
    }

    @And("Enter incorrect email address and password")
    public void enterIncorrectEmailAddressAndPassword() {
        auto.loginEmail.sendKeys(faker.internet().emailAddress());
        auto.loginPassword.sendKeys(faker.internet().password());
    }

    @And("Verify error Your email or password is incorrect is visible")
    public void verifyErrorYourEmailOrPasswordIsIncorrectIsVisible() {
        Assert.assertTrue(auto.incorrectUser.isDisplayed());
    }

    @And("Click Logout button")
    public void clickLogoutButton() {
        auto.logoutButton.click();
    }

    @And("Verify that user is navigated to login page")
    public void verifyThatUserIsNavigatedToLoginPage() {
        Assert.assertTrue(auto.login.isDisplayed());
    }

    @And("Enter name and already registered email address")
    public void enterNameAndAlreadyRegisteredEmailAddress() {
        auto.name.sendKeys("emrecan");
        auto.email.sendKeys("ydu82@hotmail.com");
    }

    @And("Verify error Email Address already exist is visible")
    public void verifyErrorEmailAddressAlreadyExistIsVisible() {
        Assert.assertTrue(auto.emailAlreadyExists.isDisplayed());
    }

    @And("Click on Contact Us button")
    public void clickOnContactUsButton() {
        auto.contactUsButton.click();
    }

    @And("Verify GET IN TOUCH is visible")
    public void verifyGETINTOUCHIsVisible() {
        Assert.assertTrue(auto.getInTouchVisible.isDisplayed());
    }

    @And("Enter name email subject and message")
    public void enterNameEmailSubjectAndMessage() {
        auto.contactName.sendKeys("emrecan");
        auto.contactEmail.sendKeys("ydu82@hotmail.com");
        auto.contactSubject.sendKeys("Automation Exercises tests");
        auto.contactMesaj.sendKeys("Automation Exercises tests very good");
    }

    @And("Upload file")
    public void uploadFile() {
        String dosyaYolu = "C:\\Users\\Lenovo\\OneDrive\\Masaüstü\\ısı.PNG";
        wait.until(ExpectedConditions.visibilityOf(auto.contactUploadFile));
        auto.contactUploadFile.sendKeys(dosyaYolu);
    }

    @And("Click Submit button")
    public void clickSubmitButton() {
        auto.contactSubmitButton.click();
    }

    @And("Click OK button")
    public void clickOKButton() {
        Driver.getDriver().switchTo().alert().accept();

    }

    @And("Verify success message Success Your details have been submitted successfully is visible")
    public void verifySuccessMessageSuccessYourDetailsHaveBeenSubmittedSuccessfullyIsVisible() {
        Assert.assertTrue(auto.successMesaj.isDisplayed());
    }

    @And("Click Home button and verify that landed to home page successfully")
    public void clickHomeButtonAndVerifyThatLandedToHomePageSuccessfully() {
        auto.homeButton.click();
        Assert.assertTrue(auto.Anasayfa.isDisplayed());
    }

    @And("Click on Test Cases button")
    public void clickOnTestCasesButton() {
        auto.testCasesButton.click();
    }

    @And("Verify user is navigated to test cases page successfully")
    public void verifyUserIsNavigatedToTestCasesPageSuccessfully() {
        Assert.assertTrue(auto.testCasesPage.isDisplayed());
    }

    @And("Click on Products button")
    public void clickOnProductsButton() {
        auto.productsButton.click();

    }

    @And("Verify user is navigated to ALL PRODUCTS page successfully")
    public void verifyUserIsNavigatedToALLPRODUCTSPageSuccessfully() {
        Assert.assertTrue(auto.allproductsVisible.isDisplayed());
    }

    @And("The products list is visible")
    public void theProductsListIsVisible() {
        Assert.assertTrue(auto.productsVisible.isDisplayed());
    }

    @And("Click on View Product of first product")
    public void clickOnViewProductOfFirstProduct() {
        auto.firstProduct.click();
    }

    @And("User is landed to product detail page")
    public void userIsLandedToProductDetailPage() {
        Assert.assertTrue(auto.productDetails.isDisplayed());
    }

    @And("Verify that detail detail is visible product name category price availability condition brand")
    public void verifyThatDetailDetailIsVisibleProductNameCategoryPriceAvailabilityConditionBrand() {
        Assert.assertTrue(auto.productsInformation.isDisplayed());
    }

    @And("Enter product name in search input and click search button")
    public void enterProductNameInSearchInputAndClickSearchButton() {
        auto.searchProduct.sendKeys("winter top");
        auto.searchButton.click();

    }

    @And("Verify SEARCHED PRODUCTS is visible")
    public void verifySEARCHEDPRODUCTSIsVisible() {
        Assert.assertTrue(auto.searchProductVisible.isDisplayed());
    }

    @And("Verify all the products related to search are visible")
    public void verifyAllTheProductsRelatedToSearchAreVisible() {
        Driver.getDriver().navigate().back();
        auto.searchProduct.clear();
        for (WebElement w:auto.products) {
            js.executeScript("arguments[0].scrollIntoView(true);",w);
            auto.searchProduct.sendKeys(w.getText());
            auto.searchButton.click();
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            js.executeScript("arguments[0].scrollIntoView(true);",auto.searchAllProductsVisible);
            Assert.assertTrue(auto.searchAllProductsVisible.isDisplayed());
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            Driver.getDriver().navigate().back();
            auto.searchProduct.clear();
        }
        for (WebElement each:auto.products) {
            System.out.println(each.getText());
        }
        Driver.getDriver().navigate().back();

    }
}
