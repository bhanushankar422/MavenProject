package com.javatraining.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.javatraining.page.GithubPage;

public class CodeActions {
	
	public void selectCode(WebDriver driver) {
		driver.findElement(By.xpath(GithubPage.CODE)).click();
	}
	
	public String getReadMeHeading(WebDriver driver) {
		return driver.findElement(By.xpath(GithubPage.README_HEADING)).getText();
	}

}
