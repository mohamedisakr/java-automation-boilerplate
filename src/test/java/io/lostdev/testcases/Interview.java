package io.lostdev.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.lostdev.base.TestBase;

public class Interview extends TestBase {
	@Test
	public void chooseAndPurchase() throws InterruptedException {
		WebElement shopLink = driver.findElement(By.xpath(OR.getProperty("ShopLink")));
		shopLink.click();

		WebElement the4thProduct = driver.findElement(By.cssSelector(OR.getProperty("the4thProduct")));
		the4thProduct.click();

		Actions actions = new Actions(driver);
		WebElement colorLabel = driver.findElement(By.cssSelector(OR.getProperty("colorLabel")));
		actions.moveToElement(colorLabel).click().build().perform();

		WebElement spinner = driver.findElement(By.cssSelector(OR.getProperty("spinner")));
		spinner.click();
		spinner.click();

		WebElement AddtoCart = driver.findElement(By.cssSelector(OR.getProperty("AddtoCart")));
		AddtoCart.click();

//		actions = new Actions(driver);	
//		actions.moveToElement(cartWidgetTotal).click().build().perform();

		WebElement cartWidgetTotal = driver.findElement(By.cssSelector(OR.getProperty(".cart-widget-total")));
		WebDriverWait wait = new WebDriverWait(driver, 3);
		wait.until(ExpectedConditions.visibilityOf(cartWidgetTotal)).wait(2000);

		String total = cartWidgetTotal.getText();
		System.out.println(total);
		Assert.assertEquals(Float.parseFloat(total), 75.00);
	}
}
