package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class Subscribtion_page extends PageBase {

	public Subscribtion_page(WebDriver driver) {
		super(driver);

	}
	@FindBy(id ="country")

	WebElement Country;
	@FindBy(id ="لايت-selection")

	WebElement lite_selection;

	@FindBy(id ="الأساسية-selection")

	WebElement Basic_selection;

	@FindBy(id ="بريميوم-selection")

	WebElement Periumium_selection;

	@FindBy(id ="country-selct")

	WebElement country_DropDownmenu;

	@FindBy(id ="bh")

	WebElement bahrain;

	@FindBy(id ="kw")

	WebElement Kwait;

	@FindBy(id ="sa")

	WebElement suadia;

	public void Select_bh_Country_lite() throws InterruptedException {

		Country.click();	
		bahrain.click();
		lite_selection.click();



	}

	public void Select_bh_Country_Basic() throws InterruptedException {

		Country.click();	
		bahrain.click();
		Basic_selection.click();



	}
	public void Select_bh_Country_Premium() throws InterruptedException {

		Country.click();	
		bahrain.click();
		Periumium_selection.click();



	}

	public void Select_kw_Country_lite() throws InterruptedException {

		Country.click();	
		Kwait.click();
		lite_selection.click();

	}
	
	public void Select_kw_Country_Basic() throws InterruptedException {

		Country.click();	
		Kwait.click();
		Basic_selection.click();



	}
	
	public void Select_kw_Country_Premium() throws InterruptedException {

		Country.click();	
		Kwait.click();
		Periumium_selection.click();



	}
	public void Select_sa_Country_lite() throws InterruptedException {

		Country.click();	
		suadia.click();
		lite_selection.click();
	}

	public void Select_sa_Country_Basic() throws InterruptedException {

		Country.click();	
		suadia.click();
		Basic_selection.click();



	}

	public void Select_sa_Country_Premium() throws InterruptedException {

		Country.click();	
		suadia.click();
		Periumium_selection.click();



	}
	
	


}




