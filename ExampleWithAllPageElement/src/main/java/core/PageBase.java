package core;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PageBase {

    protected static boolean checkExpectedElementsWithVarargs(WebDriver driver, By...elements){
        for (int i = 0; i < elements.length; i++){
            if (driver.findElement(elements[i]).isDisplayed() == true){
                return true;
            }
        } return false;
    }
}
