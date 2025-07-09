package demoQaTests.testdemoqa.ElementsTest;

import Listerners.TestListener;
import demoQaTests.base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.util.List;
@Listeners(TestListener.class)
public class DropDownTest extends BaseTest {
    @Test
    public void selectOptions(){
        var selectMultiOptions= homepage.gotoWidgetsPage();
        selectMultiOptions.selectMenuOption();
        selectMultiOptions.selectMulti("Volvo");
        selectMultiOptions.selectMulti(1);
        selectMultiOptions.selectMulti("Audi");
        selectMultiOptions.selectMulti(2);
        selectMultiOptions.deselectMulti("saab");
      List<String> allOptions = selectMultiOptions.getAllSelectedoption();
      System.out.println(allOptions.get(0));
        System.out.println(allOptions.get(1));
        System.out.println(allOptions.get(2));
        Assert.assertTrue(allOptions.contains("Volvo"));
        Assert.assertTrue(allOptions.contains("Opel"));
       Assert.assertFalse(allOptions.contains("Saab"));
        Assert.assertTrue(allOptions.contains("Audi"));

       // boolean isSelectedMultiSelect=selectMultiOptions.checkSelected();
   //     Assert.assertTrue(isSelectedMultiSelect,"is not selected");
    }

    public static class CheckBoxTest extends BaseTest {
    @Test
    public void testCheckBox() {
    var formsPage = homepage.goToForms();
    formsPage.clickPracticrForm();// in java 10 and later "var" can be used
    formsPage.clickSportsCheckBox();
    formsPage.clickReadingCheckBox();
    formsPage.clickMusicCheckBox();
    //boolean clicksportsCheckBoxSelected = formsPage.musicCheckBoxSelected();
    //Assert.assertTrue(clicksportsCheckBoxSelected, "radio button not enabled ");
    }
    }

    public static class RadioButtonTest extends BaseTest {
    @Test
    public void testRadioBtn() {
    var formsPage = homepage.goToForms();
    formsPage.clickPracticrForm();// in java 10 and later "var" can be used
    formsPage.clickFemaleRadioBtn();
    boolean isFemaleRadiobtnSelected = formsPage.isFemaleSelected();
    Assert.assertTrue(isFemaleRadiobtnSelected, "radio button not selected ");

    }
    }
}


