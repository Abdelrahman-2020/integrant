package Tests;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.Subscribtion_page;

public class Subscribe_TCs extends TestBase{
	
	Subscribtion_page home ;
	
	@Test (priority = 1)
	
	public  void select_Bahrain_Country_lite () throws InterruptedException {
		
	home = new Subscribtion_page(driver);	
	home.Select_bh_Country_lite();
	String url = driver.getCurrentUrl();

	
	String ExpectedUrl = url;
	String ActualUrl = driver.getCurrentUrl();
	
	assertEquals(ActualUrl, ExpectedUrl);
	
		
	
	 String ActualPakage = driver.findElement(By.id("order-tier-name")).getText();
	 
	 
	String ExpectedPakage = "خطة الاشتراك: لايت";
	Assert.assertEquals(ActualPakage,ExpectedPakage);
	
	String Actualprice = driver.findElement(By.xpath("//span[@id='order-tier-price']")).getText();
	 System.out.println(Actualprice);

	String expectedPrice = "2.00 ‫دينار بحريني/الشهر";
	Assert.assertEquals(expectedPrice, Actualprice);
	
			
	driver.navigate().back();
	
	
	
	
	}
	
	@Test( priority = 2 )
	
	public void select_Bahrain_Country_basic () throws InterruptedException {
		
home = new Subscribtion_page(driver);	
home.Select_bh_Country_Basic();
String ActualPakage = driver.findElement(By.id("order-tier-name")).getText();

String ExpectedPakage = "خطة الاشتراك: الأساسية";

Assert.assertEquals(ActualPakage,ExpectedPakage);

String Actualprice = driver.findElement(By.xpath("//span[@id='order-tier-price']")).getText();

String expectedPrice = "3.00 ‫دينار بحريني/الشهر";
Assert.assertEquals(expectedPrice, Actualprice);

driver.navigate().back();
	}
	
	@Test (priority = 3)
	
	public void select_Bahrain_Country_Premium () throws InterruptedException {
		
		home = new Subscribtion_page(driver);	
		home.Select_bh_Country_Premium();
		String ActualPakage = driver.findElement(By.id("order-tier-name")).getText();

		String ExpectedPakage = "خطة الاشتراك: بريميوم";

		Assert.assertEquals(ActualPakage,ExpectedPakage);
		
		String Actualprice = driver.findElement(By.xpath("//span[@id='order-tier-price']")).getText();

		String expectedPrice = "6.00 ‫دينار بحريني/الشهر";
		Assert.assertEquals(expectedPrice, Actualprice);


		driver.navigate().back();
	}
	
@Test (priority = 4)
	
	public void Select_Kw_Country_lite () throws InterruptedException {
		
	home = new Subscribtion_page(driver);	
	home.Select_kw_Country_lite();
	String url = driver.getCurrentUrl();

	
	String ExpectedUrl = url;
	String ActualUrl = driver.getCurrentUrl();
	
	assertEquals(ActualUrl, ExpectedUrl);
	
		
	
	 String ActualPakage = driver.findElement(By.id("order-tier-name")).getText();
	 
	String ExpectedPakage = "خطة الاشتراك: لايت";
	
	Assert.assertEquals(ActualPakage,ExpectedPakage);
	
	String Actualprice = driver.findElement(By.xpath("//span[@id='order-tier-price']")).getText();

	String expectedPrice = "1.20 دينار كويتي/الشهر";
	Assert.assertEquals(expectedPrice, Actualprice);

	driver.navigate().back();
}

@Test (priority = 5)

public void Select_Kw_Country_Basic () throws InterruptedException {
	
home = new Subscribtion_page(driver);	
home.Select_kw_Country_Basic();
String ActualPakage = driver.findElement(By.id("order-tier-name")).getText();

String ExpectedPakage = "خطة الاشتراك: الأساسية";

Assert.assertEquals(ActualPakage,ExpectedPakage);

String Actualprice = driver.findElement(By.xpath("//span[@id='order-tier-price']")).getText();

String expectedPrice = "2.50 دينار كويتي/الشهر";
Assert.assertEquals(expectedPrice, Actualprice);

driver.navigate().back();
}

@Test (priority = 6)

public void select_Kwait_Country_Premium () throws InterruptedException {
	
	home = new Subscribtion_page(driver);	
	home.Select_kw_Country_Premium();;
	String ActualPakage = driver.findElement(By.id("order-tier-name")).getText();

	String ExpectedPakage = "خطة الاشتراك: بريميوم";

	Assert.assertEquals(ActualPakage,ExpectedPakage);
	
	String Actualprice = driver.findElement(By.xpath("//span[@id='order-tier-price']")).getText();

	String expectedPrice = "4.80 دينار كويتي/الشهر";
	Assert.assertEquals(expectedPrice, Actualprice);

	driver.navigate().back();
}

@Test (priority =7 )

public  void select_suadia_Country_lite () throws InterruptedException {
	
home = new Subscribtion_page(driver);	
home.Select_sa_Country_lite();;
String url = driver.getCurrentUrl();


String ExpectedUrl = url;
String ActualUrl = driver.getCurrentUrl();

assertEquals(ActualUrl, ExpectedUrl);

	

 String ActualPakage = driver.findElement(By.id("order-tier-name")).getText();
  
String ExpectedPakage = "خطة الاشتراك: لايت";
Assert.assertEquals(ActualPakage,ExpectedPakage);

String Actualprice = driver.findElement(By.xpath("//span[@id='order-tier-price']")).getText();

String expectedPrice = "15.00 ريال سعودي/الشهر";
Assert.assertEquals(expectedPrice, Actualprice);


driver.navigate().back();


}

@Test( priority = 8 )

public void select_Suadia_Country_basic () throws InterruptedException {
	
home = new Subscribtion_page(driver);	
home.Select_sa_Country_Basic();
String ActualPakage = driver.findElement(By.id("order-tier-name")).getText();

String ExpectedPakage = "خطة الاشتراك: الأساسية";

Assert.assertEquals(ActualPakage,ExpectedPakage);
String Actualprice = driver.findElement(By.xpath("//span[@id='order-tier-price']")).getText();

String expectedPrice = "25.00 ريال سعودي/الشهر";
Assert.assertEquals(expectedPrice, Actualprice);

driver.navigate().back();
}	
@Test (priority = 9)

public void select_suadia_Country_Premium () throws InterruptedException {
	
	home = new Subscribtion_page(driver);	
	home.Select_sa_Country_Premium();
	String ActualPakage = driver.findElement(By.id("order-tier-name")).getText();

	String ExpectedPakage = "خطة الاشتراك: بريميوم";

	Assert.assertEquals(ActualPakage,ExpectedPakage);
	
	String Actualprice = driver.findElement(By.xpath("//span[@id='order-tier-price']")).getText();

	String expectedPrice = "60.00 ريال سعودي/الشهر";
	Assert.assertEquals(expectedPrice, Actualprice);
}
	
}
