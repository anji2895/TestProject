package com.facebook.genericPage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class CommonMethods extends MasterPage {

	public CommonMethods() throws Exception {
		super();
	}

	public void click(String xpathkey) {
		driver.findElement(By.xpath(lprop.getProperty(xpathkey))).click();

	}

	public void enterData(String xpathkey, String testData) {
		driver.findElement(By.xpath(lprop.getProperty(xpathkey))).sendKeys(tprop.getProperty(testData));
	}

	public void clearData(String xpathkey) {
		driver.findElement(By.xpath(lprop.getProperty(xpathkey))).clear();
	}

	public void moveToElement(String xpathkey) {
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath(lprop.getProperty(xpathkey)))).perform();
	}

	public void clickListElement(String xpathkey, String testdata) {
		List<WebElement> listofelements = driver.findElements(By.xpath(lprop.getProperty(xpathkey)));
		for (int i = 0; i < listofelements.size(); i++) {
			if (listofelements.get(i).getText().equalsIgnoreCase(tprop.getProperty(testdata))) {
				listofelements.get(i).click();
			}
		}
	}

	public void selectDropdownValue(String xpathkey, String testdata1, String testdata2) {
		WebElement ele = driver.findElement(By.xpath(lprop.getProperty(xpathkey)));
		Select element = new Select(ele);
		element.selectByVisibleText(testdata1);
		element.selectByValue(testdata2);
	}
	
	public void selectRadioButton(String xpathkey, int num) {
		List <WebElement> radios = driver.findElements(By.xpath(lprop.getProperty(xpathkey)));
		radios.get(num).click();
	}
	

}
