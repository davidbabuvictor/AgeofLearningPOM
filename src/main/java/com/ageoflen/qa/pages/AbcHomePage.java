package com.ageoflen.qa.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
//import io.github.sukgu.*;
import com.ageoflen.qa.base.TestBase;

import io.github.sukgu.Shadow;

public class AbcHomePage extends TestBase {

	public AbcHomePage() {
		PageFactory.initElements(driver, this);
	}

	public AbcRegisterPage signUpButtonClick() throws InterruptedException {
		Shadow ds = new Shadow(driver);
		WebElement element =ds.findElementByXPath("//*[@id='email-input'])");
		Thread.sleep(1000);
		element.sendKeys("David");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement signup = (WebElement) js.executeScript(
				"return document.querySelector(\"body > route-view\").shadowRoot.querySelector(\"#page-component\").shadowRoot.querySelector(\"main-layout > header > home-header > authstate-context:nth-child(3) > signup-button\")");
		js.executeScript("arguments[0].click();", signup);
		return new AbcRegisterPage();

	}

}
