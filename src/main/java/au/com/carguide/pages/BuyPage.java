package au.com.carguide.pages;

import au.com.carguide.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Jay Vaghani
 */
public class BuyPage extends Utility {

    private static final Logger log = LogManager.getLogger(BuyPage.class.getName());

    public BuyPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'buy + sell')]")
    WebElement mouseHoverOnBuyAndSell;

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Search Cars')]")
    WebElement clickOnSerchCars;

    @CacheLookup
    @FindBy(xpath = "//select[@id='makes']")
    //@FindBy(id = "makes")
    WebElement selectMake;

    @CacheLookup
    @FindBy(xpath = "//select[@id='models']")
    //@FindBy(id = "models")
    WebElement selectModel;

    @CacheLookup
    @FindBy(xpath = "//select[@id='locations']")
    //@FindBy(id = "locations")
    WebElement selectLocation;

    @CacheLookup
    @FindBy(xpath = "//*[@id=\"priceTo\"]")
    //@FindBy(id = "priceTo")
    WebElement selectPrice;

    @CacheLookup
    @FindBy(xpath = "//input[@id='search-submit']")
    WebElement findMyNextCarButton;

    @CacheLookup
    //@FindBy(xpath = "//div[contains(text(),'Make')]")
    @FindBy(id = "search-submit")
    WebElement shouldSeeTheResult;


//***************************************************************************


    public void mouseHoverOnBuyAndSell(){

        mouseHoverToElement(mouseHoverOnBuyAndSell);
        log.info("mouse Hover On Buy And Sell: " + mouseHoverOnBuyAndSell.toString());

    }

    public void clickOnSerchCars(){

        mouseHoverToElementAndClick(clickOnSerchCars);
        log.info("click On Serch Cars : " + clickOnSerchCars.toString());
    }


    public void selectMake(String make){

        selectByVisibleTextFromDropDown(selectMake, make);
        log.info("select Make : " + selectMake.toString());
    }

    public void selectModel(String model){

        selectByVisibleTextFromDropDown(selectModel, model);
        log.info("select Model : " + selectModel.toString());
    }


    public void selectLocation(String location){

        selectByVisibleTextFromDropDown(selectLocation, location);
        log.info("select Location: " + selectLocation.toString());
    }

    public void selectPrice(String price){

        selectByVisibleTextFromDropDown(selectPrice, price);
        log.info("select Price: " + selectPrice.toString());
    }

    public void clickOnFindMyNextCarButton(){

        clickOnElement(findMyNextCarButton);
        log.info("click On Find My Next Car Button : " + findMyNextCarButton.toString());
    }

}
