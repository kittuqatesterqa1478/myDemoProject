package demoQaTests.testdemoqa.AlertsFrameWindows;

import demoQaTests.base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ModalTest extends BaseTest {
    @Test
    public void getModalText(){
        var smallModal = homepage.gotoModalPage();
        smallModal.clickModalDialogs();
        smallModal.clickSmallModal();
    String modalText= smallModal.getModalText();
     smallModal.closeModal();
        Assert.assertEquals("This is a small modal. It has very less content",modalText,"/n modal text does not match");

    }
}



