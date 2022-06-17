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
    @FindBy(xpath = "/html/body/section/div/div/div/div/div/div/div/div[1]/p")
    public List<WebElement> products;
    @FindBy(xpath = "//*[@class='col-sm-9 padding-right']")
    public WebElement searchAllProductsVisible;
    @FindBy(xpath = "//h2[normalize-space()='Subscription']")
    public WebElement subscription;
    @FindBy(xpath = "//input[@id='susbscribe_email']")
    public WebElement subscriptionEmail;
    @FindBy(xpath = "//i[@class='fa fa-arrow-circle-o-right']")
    public WebElement subscriptionEmailButton;
    @FindBy(xpath = "//*[@class='alert-success alert']")
    public WebElement subscriptionTextVisible;
    @FindBy(xpath = "(//*[@href='/view_cart'])[1]")
    public WebElement cartButton;
    @FindBy(xpath = "(//*[@class='btn btn-default add-to-cart'])[1]")
    public WebElement clickAddCartFirst;
    @FindBy(xpath = "//button[@class='btn btn-success close-modal btn-block']")
    public WebElement continueShoppingButton;
    @FindBy(xpath = "(//*[@class='btn btn-default add-to-cart'])[3]")
    public WebElement clickAddCartSecond;
    @FindBy(xpath = "//u[normalize-space()='View Cart']")
    public WebElement viewCart;
    @FindBy(xpath = "//*[@id='cart_info_table']")
    public List<WebElement> viewCartInfo;
    @FindBy(xpath = "//*[@class='cart_price']")
    public List<WebElement> cartPrice;
    @FindBy(xpath = "//*[@class='cart_total']")
    public List<WebElement> cartTotal;
    @FindBy(xpath = "//*[text()='View Product']")
    public List<WebElement> viewProduct;
    @FindBy(xpath = "//*[@class='col-sm-7']")
    public WebElement viewProductVisible;
    @FindBy(xpath = "//*[@id='quantity']")
    public WebElement productQuantity;
    @FindBy(xpath = "//button[@type='button']")
    public WebElement productAddToCart;
    @FindBy(xpath = "//*[@class='disabled']")
    public WebElement productExactQuantity;
    @FindBy(xpath = "//*[@class='quantity']")
    public WebElement productExactQuantityCart;
    @FindBy(xpath = "(//*[@class='btn btn-default add-to-cart'])[1]")
    public WebElement productAddToCartHomePage;
    @FindBy(xpath = "//*[@id='product-1']")
    public WebElement cartPageVisible;
    @FindBy(xpath = "//a[@class='btn btn-default check_out']")
    public WebElement proceedToCheckout;
    @FindBy(xpath = "//u[normalize-space()='Register / Login']")
    public WebElement proceedToCheckoutLogin;
    @FindBy(xpath = "//*[text()='Address Details']")
    public WebElement adressDetails;
    @FindBy(xpath = "//*[text()='Review Your Order']")
    public WebElement reviewYourOrder;
    @FindBy(xpath = "//*[@class='form-control']")
    public WebElement commentAboutYourOrder;
    @FindBy(xpath = "//*[text()='Place Order']")
    public WebElement placeOrderButton;
    @FindBy(xpath = "//*[@class='form-control']")
    public WebElement nameOnCard;
    @FindBy(xpath = "//*[@id='submit']")
    public WebElement payAndConfirmOrderButton;
    @FindBy(xpath = "//*[@id='success_message']")
    public WebElement orderPlacedSuccessMesage;
    @FindBy(xpath = "//tr[@id='product-1']//i[@class='fa fa-times']")
    public WebElement XButton ;
    @FindBy(xpath = "//*[text()='Cart is empty!']")
    public WebElement cartEmpty;
    @FindBy(xpath = "//h2[normalize-space()='Category']")
    public WebElement category;
    @FindBy(xpath = "(//*[@class='fa fa-plus'])[1]")
    public WebElement WomenCategory;
    @FindBy(xpath = "//*[@id=\"Women\"]//li/a")
    public List<WebElement> WomenCategorList;
    @FindBy(xpath = "//*[@class='features_items']")
    public WebElement WomenCategorVisibility;
    @FindBy(xpath = "(//*[@class='fa fa-plus'])[2]")
    public WebElement menCategory;
    @FindBy(xpath = "//*[@id=\"Men\"]//li/a")
    public List<WebElement> menCategorList;
    @FindBy(xpath = "//*[@class='features_items']")
    public WebElement menCategorVisible;
    @FindBy(xpath = "//*[@class='features_items']")
    public WebElement brandVisible;
    @FindBy(xpath = "//*[@class='nav nav-pills nav-stacked']//li/a")
    public List<WebElement> brandList;
    @FindBy(xpath = "//*[@class='brands_products']")
    public WebElement productLeftSideBrandBar;
    @FindBy(xpath = "//*[@class='features_items']")
    public WebElement allproductsVisibleProductPage;
    @FindBy(xpath = "/html/body/section/div/div/div/div/div/div/div/div/a")
    public List<WebElement> allproductsAddToCard;
    @FindBy(xpath = "//button[@class='btn btn-success close-modal btn-block']")
    public WebElement continueShoppingButtonProduct;
    @FindBy(xpath = "//*[@id='cart_info']")
    public WebElement cartTable;
    @FindBy(xpath = "//*[text()='Write Your Review']")
    public WebElement writeYourReview;
    @FindBy(xpath = "//input[@id='name']")
    public WebElement writeYourReviewName;
    @FindBy(xpath = "//input[@id='email']")
    public WebElement writeYourReviewMail;
    @FindBy(xpath = "//textarea[@id='review']")
    public WebElement writeYourReviewComment;
    @FindBy(xpath = "//button[@id='button-review']")
    public WebElement writeYourReviewSubmit;
    @FindBy(xpath = "//*[text()='Thank you for your review.']")
    public WebElement writeYourReviewText;
    @FindBy(xpath = "//h2[normalize-space()='recommended items']")
    public WebElement recommendedItems;
    @FindBy(xpath = "//div[@class='item active']//div[1]//div[1]//div[1]//div[1]//a[1]")
    public WebElement recommendedItemsAddToCart;
    @FindBy(xpath = "//*[@id='cart_info']")
    public WebElement recommendedItemsAddToCartAfterCartPage;
    @FindBy(id = "address_delivery")
    public WebElement deliveryAdress;
    @FindBy(id = "address_invoice")
    public WebElement billingAddress;
    @FindBy(xpath = "//*[text()='Download Invoice']")
    public WebElement downloadInvoiceButton;
    @FindBy(xpath = "//*[text()='Congratulations! Your order has been confirmed!']")
    public WebElement downloadInvoiceText;
    @FindBy(xpath = "//*[@class='fa fa-angle-up']")
    public WebElement moveUp;
    @FindBy(xpath = "(//*[@class='carousel-inner'])[1]")
    public WebElement moveUpHomePage;





}
