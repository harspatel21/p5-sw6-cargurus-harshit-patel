package au.com.carguide.pages;

import au.com.carguide.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchUsedCarPage extends Utility{

    private static final Logger log = LogManager.getLogger(SearchUsedCarPage.class.getName());

    public SearchUsedCarPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(), 'Used')]")
    WebElement usedLink;

    //===========================================================================================//

    public void clickOnUsedLink(){
        clickOnElement(usedLink);
    }

}
