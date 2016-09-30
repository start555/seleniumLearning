package pages;

import core.PageBase;
import helpers.Locators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends PageBase{

    private static final By LENTA = Locators.get("lentaLink");
    private static final By COMPANIES = Locators.get("companiesLink");
    private static final By SALARIES = Locators.get("salariesLink");
    private static final By VACANCIES = Locators.get("vacanciesLink");
    private static final By VACANCIES_SEARCH = Locators.get("vacanciesSearch");


    public static boolean checkExpectedElementsWithVarargs(WebDriver driver){
        return checkExpectedElementsWithVarargs(driver, LENTA, COMPANIES, SALARIES, VACANCIES, VACANCIES_SEARCH);
    }


    public static boolean checkExpectedElementsWithoutVarargs(WebDriver driver){
        if (driver.findElement(LENTA).isDisplayed() == true
                & driver.findElement(COMPANIES).isDisplayed() == true
                & driver.findElement(SALARIES).isDisplayed() == true
                & driver.findElement(VACANCIES).isDisplayed() == true
                & driver.findElement(VACANCIES_SEARCH).isDisplayed() == true);
        return true;
    }
}
