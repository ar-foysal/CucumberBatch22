package pages;

import drivers.PageDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class BasePage {

    public WebElement getElement(By locator){
       return PageDriver.getCurrentDriver().findElement(locator);
    }

    public void clickOnElement(By locator){
        getElement(locator).click();
    }

    public void writeOnAElement(By locator, String text){
        getElement(locator).sendKeys(text);
    }

    public void hoverOnElement(By locator){
        Actions actions = new Actions(PageDriver.getCurrentDriver());
        actions.clickAndHold(getElement(locator)).build().perform();
    }

    public void loadAWebPage(String url){
        PageDriver.getCurrentDriver().get(url);
    }

    public String getElementText(By locator){
        return getElement(locator).getText();
    }

}
