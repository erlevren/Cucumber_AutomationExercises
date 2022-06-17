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

import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.Duration;
import java.util.Random;

public class AutoExeStepDefinition {
    AutomationExercisesPage auto = new AutomationExercisesPage();
    Faker faker = new Faker();
    Actions actions = new Actions(Driver.getDriver());
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(20));
    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
    Random rnd = new Random(15);

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
            Thread.sleep(second * 1000);
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
        js.executeScript("arguments[0].scrollIntoView(true);", auto.searchProductVisible);
        Assert.assertTrue(auto.searchProductVisible.isDisplayed());
    }

    @And("Verify all the products related to search are visible")
    public void verifyAllTheProductsRelatedToSearchAreVisible() {
        Driver.getDriver().navigate().back();
        auto.searchProduct.clear();
        for (WebElement w : auto.products) {
            js.executeScript("arguments[0].scrollIntoView(true);", w);
            auto.searchProduct.sendKeys(w.getText());
            auto.searchButton.click();
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            js.executeScript("arguments[0].scrollIntoView(true);", auto.searchAllProductsVisible);
            Assert.assertTrue(auto.searchAllProductsVisible.isDisplayed());
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            Driver.getDriver().navigate().back();
            auto.searchProduct.clear();
        }
        for (WebElement each : auto.products) {
            System.out.println(each.getText());
        }
        Driver.getDriver().navigate().back();
    }

    @And("Scroll down to footer")
    public void scrollDownToFooter() {
        js.executeScript("arguments[0].scrollIntoView(true);", auto.subscription);
    }

    @And("Verify text SUBSCRIPTION")
    public void verifyTextSUBSCRIPTION() {
        String actualText = auto.subscription.getText();
        String expectedText = "SUBSCRIPTION";
        Assert.assertEquals(expectedText, actualText);
    }

    @And("Enter email address in input and click arrow button")
    public void enterEmailAddressInInputAndClickArrowButton() {
        auto.subscriptionEmail.sendKeys("ydu82@hotmail.com");
        auto.subscriptionEmailButton.click();
    }

    @And("Verify success message You have been successfully subscribed is visible")
    public void verifySuccessMessageYouHaveBeenSuccessfullySubscribedIsVisible() {
        String actualSuccessMessage = auto.subscriptionTextVisible.getText();
        String expectedSuccessMessage = "You have been successfully subscribed!";
        wait.until(ExpectedConditions.visibilityOf(auto.subscriptionTextVisible));
        Assert.assertEquals(expectedSuccessMessage, actualSuccessMessage);
    }

    @And("Click Cart button")
    public void clickCartButton() {
        auto.cartButton.click();
    }

    @And("Hover over first product and click Add to cart")
    public void hoverOverFirstProductAndClickAddToCart() {
        js.executeScript("arguments[0].scrollIntoView(true);", auto.clickAddCartFirst);
        auto.clickAddCartFirst.click();
    }

    @And("Click Continue Shopping button")
    public void clickContinueShoppingButton() {
        auto.continueShoppingButton.click();
    }

    @And("Hover over second product and click Add to cart")
    public void hoverOverSecondProductAndClickAddToCart() {
        js.executeScript("arguments[0].scrollIntoView(true);", auto.clickAddCartSecond);
        auto.clickAddCartSecond.click();
    }

    @And("Click View Cart button")
    public void clickViewCartButton() {
        auto.viewCart.click();
    }

    @And("Verify both products are added to Cart")
    public void verifyBothProductsAreAddedToCart() {
        for (WebElement w : auto.viewCartInfo) {
            System.out.println(w.getText());
            Assert.assertTrue(w.isDisplayed());
        }
    }

    @And("Verify their prices quantity and total price")
    public void verifyTheirPricesQuantityAndTotalPrice() {
        for (WebElement w : auto.cartPrice) {
            System.out.println(w.getText());
            Assert.assertTrue(w.isDisplayed());
        }
        for (WebElement each : auto.cartTotal) {
            System.out.println(each.getText());
            Assert.assertTrue(each.isDisplayed());
        }
    }

    @And("Click View Product for any product on home page")
    public void clickViewProductForAnyProductOnHomePage() {
        for (int i = 0; i < auto.viewProduct.size(); i++) {
            auto.viewProduct.get(rnd.nextInt(auto.viewProduct.size())).click();
        }
    }

    @And("Verify product detail is opened")
    public void verifyProductDetailIsOpened() {
        js.executeScript("arguments[0].scrollIntoView(true);", auto.viewProductVisible);
        Assert.assertTrue(auto.viewProductVisible.isDisplayed());
    }

    @And("Increase quantity to four")
    public void increaseQuantityToFour() {
        auto.productQuantity.clear();
        auto.productQuantity.sendKeys("4");
    }

    @And("Click Add to cart button")
    public void clickAddToCartButton() {
        auto.productAddToCart.click();
    }

    @And("Verify that product is displayed in cart page with exact quantity")
    public void verifyThatProductIsDisplayedInCartPageWithExactQuantity() {
        js.executeScript("arguments[0].scrollIntoView(true);", auto.productExactQuantityCart);
        String actualQuantity = auto.productExactQuantity.getText();
        String expectedQuantity = "4";
        Assert.assertEquals(expectedQuantity, actualQuantity);
    }

    @And("Add products to cart")
    public void addProductsToCart() {
        js.executeScript("arguments[0].scrollIntoView(true);", auto.productAddToCartHomePage);
        auto.productAddToCartHomePage.click();
        auto.viewCart.click();
    }

    @And("Verify that cart page is displayed")
    public void verifyThatCartPageIsDisplayed() {
        Assert.assertTrue(auto.cartPageVisible.isDisplayed());
    }

    @And("Click Proceed To Checkout")
    public void clickProceedToCheckout() {
        auto.proceedToCheckout.click();
    }

    @And("Click Register Login button")
    public void clickRegisterLoginButton() {
        auto.proceedToCheckoutLogin.click();
    }

    @And("Fill all details in Signup and create account")
    public void fillAllDetailsInSignupAndCreateAccount() {
        auto.name.sendKeys(faker.name().fullName());
        auto.email.sendKeys(faker.internet().emailAddress());
        auto.signup.click();
        auto.title.click();
        auto.password.sendKeys(faker.internet().password());
        actions.sendKeys(Keys.TAB).sendKeys("7").sendKeys(Keys.TAB)
                .sendKeys("May").sendKeys(Keys.TAB).sendKeys("1983").perform();
        auto.newsletter.click();
        auto.receive.click();
        actions.sendKeys(Keys.TAB)
                .sendKeys(faker.name().firstName())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.name().lastName())
                .sendKeys(Keys.TAB)
                .sendKeys("cosmospolit")
                .sendKeys(Keys.TAB)
                .sendKeys("where are you from :)")
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys("Canada")
                .sendKeys(Keys.TAB)
                .sendKeys("asdasdas")
                .sendKeys(Keys.TAB)
                .sendKeys("toronto")
                .sendKeys(Keys.TAB)
                .sendKeys("213213545")
                .sendKeys(Keys.TAB)
                .sendKeys(faker.phoneNumber().phoneNumber())
                .sendKeys(Keys.TAB).click().perform();
        auto.createAccount.click();
    }

    @And("Verify ACCOUNT CREATED and click Continue button")
    public void verifyACCOUNTCREATEDAndClickContinueButton() {
        js.executeScript("arguments[0].scrollIntoView(true);", auto.AccountCreatedVisible);
        Assert.assertTrue(auto.AccountCreatedVisible.isDisplayed());
        auto.continueButton.click();
    }

    @And("Verify Logged in as username at top")
    public void verifyLoggedInAsUsernameAtTop() {
        Assert.assertTrue(auto.loggedText.isDisplayed());
    }

    @And("Verify Address Details and Review Your Order")
    public void verifyAddressDetailsAndReviewYourOrder() {
        js.executeScript("arguments[0].scrollIntoView(true);", auto.adressDetails);
        Assert.assertTrue(auto.adressDetails.isDisplayed());
        js.executeScript("arguments[0].scrollIntoView(true);", auto.reviewYourOrder);
        Assert.assertTrue(auto.reviewYourOrder.isDisplayed());
    }

    @And("Enter description in comment text area and click Place Order")
    public void enterDescriptionInCommentTextAreaAndClickPlaceOrder() {
        js.executeScript("arguments[0].scrollIntoView(true);", auto.commentAboutYourOrder);
        auto.commentAboutYourOrder.sendKeys(faker.hitchhikersGuideToTheGalaxy().starship());
        auto.placeOrderButton.click();
    }

    @And("Enter payment details: Name on Card, Card Number, CVC, Expiration date")
    public void enterPaymentDetailsNameOnCardCardNumberCVCExpirationDate() {
        auto.nameOnCard.sendKeys(faker.name().fullName());
        actions.sendKeys(Keys.TAB)
                .sendKeys(faker.business().creditCardNumber())
                .sendKeys(Keys.TAB).sendKeys("311").sendKeys(Keys.TAB)
                .sendKeys("12").sendKeys(Keys.TAB).sendKeys("2027").perform();
    }

    @And("Click Pay and Confirm Order button")
    public void clickPayAndConfirmOrderButton() {
        auto.payAndConfirmOrderButton.click();
        Driver.getDriver().navigate().back();
        Assert.assertTrue(auto.orderPlacedSuccessMesage.isDisplayed());
        Driver.getDriver().navigate().forward();
    }

    @And("Verify success message Your order has been placed successfully!")
    public void verifySuccessMessageYourOrderHasBeenPlacedSuccessfully() {
        Driver.getDriver().navigate().refresh();
    }

    @And("Fill email, password and click Login button")
    public void fillEmailPasswordAndClickLoginButton() {
        auto.loginEmail.sendKeys("ydu82@hotmail.com");
        auto.loginPassword.sendKeys("123456");
        auto.loginButton.click();
    }

    @And("Click X button corresponding to particular product")
    public void clickXButtonCorrespondingToParticularProduct() {
        auto.XButton.click();
    }
    @And("Verify that product is removed from the cart")
    public void verifyThatProductIsRemovedFromTheCart() {
        Assert.assertTrue(auto.cartEmpty.isDisplayed());
    }

    @Then("Verify that categories are visible on left side bar")
    public void verifyThatCategoriesAreVisibleOnLeftSideBar() {
        js.executeScript("arguments[0].scrollIntoView(true);", auto.category);
        Assert.assertTrue(auto.category.isDisplayed());
    }
    @And("Click on Women category")
    public void clickOnWomenCategory() {
        auto.WomenCategory.click();
    }
    @And("Click on any category link under Women category, for example: Dress")
    public void clickOnAnyCategoryLinkUnderWomenCategoryForExampleDress() {
        auto.WomenCategorList.get(rnd.nextInt(auto.WomenCategorList.size())).click();
        //for (WebElement w:auto.WomenCategorList) {
        //    w.click();
        //    try {
        //        Thread.sleep(2000);
        //    } catch (InterruptedException e) {
        //        e.printStackTrace();
        //    }
        //    Assert.assertTrue(auto.WomenCategorVisibility.isDisplayed());
        //    Driver.getDriver().navigate().refresh();
        //    auto.WomenCategory.click();
        //    js.executeScript("arguments[0].scrollIntoView(true);", auto.category);
        //}

    }

    @And("Verify that category page is displayed and confirm text WOMEN - TOPS PRODUCTS")
    public void verifyThatCategoryPageIsDisplayedAndConfirmTextWOMENTOPSPRODUCTS() {
        Assert.assertTrue(auto.WomenCategorVisibility.isDisplayed());
    }
    @And("On left side bar, click on any sub-category link of Men category")
    public void onLeftSideBarClickOnAnySubCategoryLinkOfMenCategory() {
        auto.menCategory.click();
        auto.menCategorList.get(rnd.nextInt(auto.menCategorList.size())).click();

    }
    @And("Verify that user is navigated to that category page")
    public void verifyThatUserIsNavigatedToThatCategoryPage() {
        Assert.assertTrue(auto.menCategorVisible.isDisplayed());
    }

    @And("Verify that Brands are visible on left side bar")
    public void verifyThatBrandsAreVisibleOnLeftSideBar() {
        js.executeScript("arguments[0].scrollIntoView(true);", auto.productLeftSideBrandBar);
        Assert.assertTrue(auto.productLeftSideBrandBar.isDisplayed());
    }

    @And("Click on any brand name")
    public void clickOnAnyBrandName() {
        auto.brandList.get(rnd.nextInt(auto.brandList.size())).click();

    }
    @And("Verify that user is navigated to brand page and brand products are displayed")
    public void verifyThatUserIsNavigatedToBrandPageAndBrandProductsAreDisplayed() {
        js.executeScript("arguments[0].scrollIntoView(true);", auto.brandVisible);
        Assert.assertTrue(auto.brandVisible.isDisplayed());
    }

    @And("On left side bar, click on any other brand link")
    public void onLeftSideBarClickOnAnyOtherBrandLink() {
        js.executeScript("arguments[0].scrollIntoView(true);", auto.productLeftSideBrandBar);
        auto.brandList.get(rnd.nextInt(auto.brandList.size())).click();
    }

    @And("Verify that user is navigated to that brand page and can see products")
    public void verifyThatUserIsNavigatedToThatBrandPageAndCanSeeProducts() {
        js.executeScript("arguments[0].scrollIntoView(true);", auto.brandVisible);
        Assert.assertTrue(auto.brandVisible.isDisplayed());

    }

    @And("Add those products to cart")
    public void addThoseProductsToCart() {
        js.executeScript("arguments[0].scrollIntoView(true);", auto.allproductsVisibleProductPage);
        for (WebElement w:auto.allproductsAddToCard) {
            js.executeScript("arguments[0].scrollIntoView(true);", auto.allproductsVisibleProductPage);
            w.click();
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            auto.continueShoppingButtonProduct.click();
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    @And("Click Cart button and verify that products are visible in cart")
    public void clickCartButtonAndVerifyThatProductsAreVisibleInCart() {
        auto.cartButton.click();
        js.executeScript("arguments[0].scrollIntoView(true);", auto.cartTable);
        Assert.assertTrue(auto.cartTable.isDisplayed());


    }

    @And("Click Signup  Login button and submit login details")
    public void clickSignupLoginButtonAndSubmitLoginDetails() {
        auto.login.click();
        auto.loginEmail.sendKeys("ydu82@hotmail.com");
        auto.loginPassword.sendKeys("123456");


    }

    @And("Again, go to Cart page")
    public void againGoToCartPage() {
        auto.cartButton.click();
    }

    @And("Verify that those products are visible in cart after login as well")
    public void verifyThatThoseProductsAreVisibleInCartAfterLoginAsWell() {
        js.executeScript("arguments[0].scrollIntoView(true);", auto.cartTable);
        Assert.assertTrue(auto.cartTable.isDisplayed());
    }

    @And("Click on View Product button")
    public void clickOnViewProductButton() {
        auto.firstProduct.click();
    }

    @And("Verify Write Your Review is visible")
    public void verifyWriteYourReviewIsVisible() {
        Assert.assertTrue(auto.writeYourReview.isDisplayed());
    }

    @And("Enter name, email and review")
    public void enterNameEmailAndReview() {
        auto.writeYourReviewName.sendKeys(faker.name().name());
        auto.writeYourReviewMail.sendKeys(faker.internet().emailAddress());
        auto.writeYourReviewComment.sendKeys(faker.hitchhikersGuideToTheGalaxy().starship());

    }
    @And("Click Review Submit button")
    public void clickReviewSubmitButton() {
        auto.writeYourReviewSubmit.click();
    }

    @And("Verify success message Thank you for your review.")
    public void verifySuccessMessageThankYouForYourReview() {
        js.executeScript("arguments[0].scrollIntoView(true);", auto.writeYourReviewSubmit);
        wait.until(ExpectedConditions.visibilityOf(auto.writeYourReviewText));
        String actualText = auto.writeYourReviewText.getText();
        String expectedText = "Thank you for your review.";
        Assert.assertEquals(expectedText, actualText);
    }

    @Then("Scroll to bottom of page")
    public void scrollToBottomOfPage() {
        js.executeScript("arguments[0].scrollIntoView(true);", auto.recommendedItems);
    }

    @And("Verify RECOMMENDED ITEMS are visible")
    public void verifyRECOMMENDEDITEMSAreVisible() {
        Assert.assertTrue(auto.recommendedItems.isDisplayed());

    }

    @And("Click on Add To Cart on Recommended product")
    public void clickOnAddToCartOnRecommendedProduct() {
        auto.recommendedItemsAddToCart.click();
    }

    @And("Click on View Cart button")
    public void clickOnViewCartButton() {
        auto.viewCart.click();
    }

    @And("Verify that product is displayed in cart page")
    public void verifyThatProductIsDisplayedInCartPage() {
        Assert.assertTrue(auto.recommendedItemsAddToCartAfterCartPage.isDisplayed());
    }

    @And("Verify that the delivery address is same address filled at the time registration of account")
    public void verifyThatTheDeliveryAddressIsSameAddressFilledAtTheTimeRegistrationOfAccount() {
        Assert.assertTrue(auto.deliveryAdress.isDisplayed());
    }

    @And("Verify that the billing address is same address filled at the time registration of account")
    public void verifyThatTheBillingAddressIsSameAddressFilledAtTheTimeRegistrationOfAccount() {
        Assert.assertTrue(auto.billingAddress.isDisplayed());
    }

    @And("Click Download Invoice button and verify invoice is downloaded successfully.")
    public void clickDownloadInvoiceButtonAndVerifyInvoiceIsDownloadedSuccessfully() {
        js.executeScript("arguments[0].scrollIntoView(true);", auto.downloadInvoiceButton);
        auto.downloadInvoiceButton.click();
        String dosyaYolu = "C:\\Users\\Lenovo\\Downloads\\invoice.txt";
        Files.exists(Paths.get(dosyaYolu));
        Assert.assertTrue(auto.downloadInvoiceText.isDisplayed());
    }

    @And("Click on arrow at bottom right side to move upward")
    public void clickOnArrowAtBottomRightSideToMoveUpward() {
        auto.moveUp.click();
    }

    @And("Verify that page is scrolled up and Full-Fledged practice website for Automation Engineers text is visible on screen")
    public void verifyThatPageIsScrolledUpAndFullFledgedPracticeWebsiteForAutomationEngineersTextIsVisibleOnScreen() {
       Assert.assertTrue(auto.moveUpHomePage.isDisplayed());
    }

    @And("Scroll up page to top")
    public void scrollUpPageToTop() {
        actions.sendKeys(Keys.HOME).perform();
    }
}

