package core;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PageBase {

    protected static boolean checkExpectedElementsWithVarargs(WebDriver driver, By...elements) {
        boolean allElementsAreVisible = true;
        for (By element : elements) {
            if (!driver.findElement(element).isDisplayed()) {
                return false;
            }
        }
        return allElementsAreVisible;
    }
}
