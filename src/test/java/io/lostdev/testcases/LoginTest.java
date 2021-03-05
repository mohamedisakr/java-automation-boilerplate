package io.lostdev.testcases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import io.lostdev.base.TestBase;

public class LoginTest extends TestBase {

	@Test
	public void loginAsBankManager() {
		driver.findElement(By.cssSelector(OR.getProperty("BankMgrLoginButton"))).click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
