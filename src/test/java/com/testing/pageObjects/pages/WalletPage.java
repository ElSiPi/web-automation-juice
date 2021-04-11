package com.testing.pageObjects.pages;

import org.openqa.selenium.By;

import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("/wallet")
public class WalletPage extends HomePage {
  // Locators ----------------------------------------------------------------------------------------------------------
  public static By DISMISS_BUTTON;
  public static By WALLET_TITLE = text("Digital Wallet");
  public static By WALLET_BALANCE = css("class[='confirmation']");//xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/app-wallet/mat-card/p/b");
  public static By AMOUNT_FIELD = ariaLabel("Enter an amount");

  // Public methods ----------------------------------------------------------------------------------------------------
  public void waitForPageToLoad() {
    getElement(WALLET_TITLE).waitUntilPresent();
    logWeAreOnPage();
  }
}
