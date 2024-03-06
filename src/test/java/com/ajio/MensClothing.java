package com.ajio;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.ajio.basefuntions.Reusable;
import com.ajio.locators.MensClothingLocators;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class MensClothing {
	public static Reusable base = Reusable.getInstance();
	public static MensClothingLocators locators = MensClothingLocators.getInstance();
	public static List<WebElement> prices;
	
	@Given("launch the Ajio {string}")
	public void launch_the_Ajio(String string) {
		Reusable.goToUrl(string);
	   
	}
	@Given("To check broken link {string}")
	public void to_check_broken_link(String string) throws Throwable {
		List<WebElement> links = base.driver.findElements(By.tagName("link"));
		Iterator<WebElement> iterator = links.iterator();
		while(iterator.hasNext()) {
		WebElement link = iterator.next();
		String href = link.getAttribute("href");
		if(href == null || href.isEmpty()) {
			System.out.println("Link Not Available");
				
	}
		else if(!href.startsWith(string)) {
			System.out.println("Link not related to Ajio:"+href);
		}
		else {
			HttpURLConnection http = (HttpURLConnection) (new URL(href).openConnection());
			http.setRequestMethod("HEAD");
			http.connect();
			int responcecode= http.getResponseCode();
			if(responcecode==200) {
				System.out.println("Link is not broken:"+href);
			}
		}	
	}
	}
		

	@Given("navigate To Mens clothing")
	public void navigate_To_Mens_clothing()  {
		base.goToElement(locators.getMen());
		base.button(locators.getClothing());
	   
	}

	@When("user Click sort dropdown and select a value")
	public void user_Click_sort_dropdown_and_select_a_value()  {
//		 select = new Select(dropdown);
//		 select.selectByVisibleText("Price (lowest first)");
	    base.selectVisibleText(locators.getDropdown(), "Price (lowest first)");
	}

	

	@Then("validate outcome")
	public void validate_outcome()  {
		try {
		prices = locators.getPrices();
		Thread.sleep(5000);
		boolean check = true;
		 for(int i=0;i<prices.size()-1;i++) {
		    	String previous = prices.get(i).getText().replaceAll(",","").replaceAll("₹", "");
		    	String next = prices.get(i+1).getText().replaceAll(",","").replaceAll("₹", "");
		    	int firstValue = Integer.parseInt(previous);
		    	int secondValue = Integer.parseInt(next);
		    	if(firstValue < secondValue) {
		    		System.out.println(firstValue);
		    	}
		    	else {
		    		check = false;
		    	}
		 }
		 if(check=true) System.out.println("Values are sorted in ascending order");
	    	else System.out.println("test case failed");
	} catch (Exception e) {
		e.printStackTrace();
		
		//driver.quit();
	}

}
}
