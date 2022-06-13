package stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.AutomationExercisesPage;
import utilities.ConfigReader;
import utilities.Driver;

public class AutoExeStepDefinition {
    AutomationExercisesPage auto = new AutomationExercisesPage();
    Faker faker = new Faker();
    Actions actions=new Actions(Driver.getDriver());
    @Given("Navigate to url {string}")
    public void navigateToUrl(String istenenUrl) {
        Driver.getDriver().get(ConfigReader.getProperty(istenenUrl));
    }

    @Then("Verify that home page is visible successfully")
    public void verifyThatHomePageIsVisibleSuccessfully() {
        Assert.assertTrue(auto.sayfa.isDisplayed());
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

}
