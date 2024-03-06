package com.ajio;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.ajio.basefuntions.Reusable;
import com.ajio.locators.KidsClothingLocators;
import com.ajio.locators.MensClothingLocators;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class KidsClothing {
	public static Reusable base = Reusable.getInstance();
	public static KidsClothingLocators locators = KidsClothingLocators.getInstance();
	public static List<WebElement> options;
	
	
	@Given("Launch the Ajio website {string}")
	public void launch_the_Ajio_website(String string) {
		Reusable.goToUrl(string);
	}
	

	@Given("To check the broken link {string}")
	public void to_check_the_broken_link(String string) throws Throwable {
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
	


	@Given("Navigate to Kids and click the clothing")
	public void navigate_to_Kids_and_click_the_clothing()  throws InterruptedException {
	    base.goToElement(locators.getKids());
		base.button(locators.getClothingNew());
	}

	@When("user click sort dropdown and select option in a dropdown with one dim map")
	public void user_click_sort_dropdown_and_select_option_in_a_dropdown_with_one_dim_map(DataTable dataTable){
		Map<String,String> map = dataTable.asMap(String.class, String.class);
		String high = map.get("sort3");
		 options = base.selectAllOptions(locators.getDropdown());
		 for(WebElement option: options) {
			 String text = base.returnText(option);
			 if(text.contains(high)) {
				 base.selectVisibleText(locators.getDropdown(), text);
			 }
		 }
	}

	@Then("validate the outcome")
	public void validate_the_outcome() {
		System.out.println("complete");
		
		
	  
	}

}
