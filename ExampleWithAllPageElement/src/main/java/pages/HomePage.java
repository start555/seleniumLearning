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


    public static boolean checkExpectedElementsWithVarargs(WebDriver driver) {
        return checkExpectedElementsWithVarargs(driver, LENTA, COMPANIES, SALARIES, VACANCIES, VACANCIES_SEARCH);
    }


    public static boolean checkExpectedElementsWithoutVarargs(WebDriver driver) {
        if (driver.findElement(LENTA).isDisplayed()
                & driver.findElement(COMPANIES).isDisplayed()
                & driver.findElement(SALARIES).isDisplayed()
                & driver.findElement(VACANCIES).isDisplayed()
                & driver.findElement(VACANCIES_SEARCH).isDisplayed());
        return true;
    }
}
