package com.ajio.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ajio.basefuntions.Reusable;

public class KidsClothingLocators {
	public static KidsClothingLocators locators = null;
	private KidsClothingLocators() {
		PageFactory.initElements(Reusable.driver, this);
	}
	
	 public static KidsClothingLocators getInstance() {
		 if(locators == null) {
			 locators = new KidsClothingLocators();
		 }
		 return locators;
	 }
	
	@FindBy(xpath = "//span[text()='KIDS']")
	private WebElement kids;
	
	@FindBy(xpath = "//strong[text()='NEW IN: CLOTHING']")
	private WebElement clothingNew;
	
	@FindBy(xpath = "//select[@id='sortBy']")
	private WebElement dropdown;

	public WebElement getKids() {
		return kids;
	}

	public WebElement getClothingNew() {
		return clothingNew;
	}

	public WebElement getDropdown() {
		return dropdown;
	}

	
	
	
}
