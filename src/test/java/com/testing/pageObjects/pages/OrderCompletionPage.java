package com.testing.pageObjects.pages;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;


@DefaultUrl("/order-completion")
public class OrderCompletionPage extends BasePage {
    // Locators
    // -------------------------------------------------------------------------------------------------------------------
    public static By ORDER_COMPLETION_TITLE = text("Thank you for your purchase!");
    // Public methods
    // -------------------------------------------------------------------------------------------------------------------
    public void waitForPageToLoad(){
        getElement(ORDER_COMPLETION_TITLE).waitUntilVisible();
        logWeAreOnPage();
    }
}
