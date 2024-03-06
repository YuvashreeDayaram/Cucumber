package com.ajio.locators;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ajio.basefuntions.Reusable;

public class MensClothingLocators {
	public static MensClothingLocators locators = null;
	private MensClothingLocators() {
		PageFactory.initElements(Reusable.driver, this);
	}
	
	 public static MensClothingLocators getInstance() {
		 if(locators == null) {
			 locators = new MensClothingLocators();
		 }
		 return locators;
	 }
	
	@FindBy(xpath = "//span[text()='MEN']")
	private WebElement men;
	
	@FindBy(xpath = "//strong[text()='CLOTHING']/parent::span")
	private WebElement clothing;
	
	@FindBy(xpath = "//select[@id='sortBy']")
	private WebElement dropdown;

	@FindBy(xpath = "//span[@class='price  ']")
	private List<WebElement> prices;

	public WebElement getMen() {
		return men;
	}

	public WebElement getClothing() {
		return clothing;
	}

	public WebElement getDropdown() {
		return dropdown;
	}

	public List<WebElement> getPrices() {
		return prices;
	}
	
}

