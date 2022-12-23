package au.com.carguide.pages;

import au.com.carguide.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class FindDealerPage extends Utility {

    private static final Logger log = LogManager.getLogger(FindDealerPage.class.getName());

    public FindDealerPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(), 'Find a Dealer')]")
    WebElement clickFindDealer;

    @CacheLookup
    @FindBy(xpath = "//a[@data-gtm-value='title']")
    List<WebElement> listOfDealer;

    @CacheLookup
    @FindBy(xpath = "//span[@class='listing-pagination-next-text']")
    WebElement nextBtn;


    //========================================================================================//

    public void clickOnFindADealerLink() {
        clickOnElement(clickFindDealer);
    }

    public void verifyDealerNamesAreDesplayed(String dealers) {
        List<WebElement> list = listOfDealer;
        for (WebElement e : list) {
            System.out.println(e.getText());
            if (e.getText().equals(dealers)) {
                break;
            }
        }

    }


//    public void verifyDealerNamesAreDesplayed(String dealers) {
//        By nextBtn = By.xpath("//span[@class='listing-pagination-next-text']");
//        List<WebElement> allresponses= listOfDealer;
//        List<String> responseText = new ArrayList<>();
//        for(int i=0; i<allresponses.size(); i++)
//        {
//            responseText.add(allresponses.get(i).getText());
//        }
//        driver.findElement(nextBtn).click();
//        List<WebElement> allresponses1= driver.findElements(By.xpath("//input[@type='button' and @value='Responses']"));
//        List<String> responseText1 = new ArrayList<>();
//        for(int i=0; i<allresponses1.size(); i++)
//        {
//            responseText1.add(allresponses1.get(i).getText());
//        }
//        responseText.addAll(responseText1);
//        //System.out.println(responseText);
//    }
}
