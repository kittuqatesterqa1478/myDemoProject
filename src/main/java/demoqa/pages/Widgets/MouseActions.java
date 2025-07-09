package demoqa.pages.Widgets;

import Utilities.ActionUtilities;
import demoqa.pages.BasePages.BasePageDqa;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MouseActions extends BasePageDqa {
    public MouseActions(WebDriver driver) {
        super(driver);
    }
    private By sliderMenu =By.xpath("//li[@id='item-3']/span[text()='Slider']");
    private By sliderAction = By.xpath("//span[@class='range-slider__wrap']/input[@type='range']");
    private By sliderValue = By.id("sliderValue");
    ActionUtilities au =new ActionUtilities(driver);
    public void clickSliderMenu(){
        click(sliderMenu);
    }
    public void moveSliderAction(){
    au.dragAndDropUtility(find(sliderAction),255,0);
    }
    public String getSliderValue(){
      return  find(sliderValue).getDomAttribute("value");

    }
}
