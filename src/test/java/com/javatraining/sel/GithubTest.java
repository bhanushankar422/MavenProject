package com.javatraining.sel;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.javatraining.actions.CodeActions;
import com.javatraining.actions.GithubActions;


import static org.assertj.core.api.Assertions.*;

public class GithubTest {
	WebDriver driver;
	@BeforeEach
	public void setup() {
		driver = new ChromeDriver();
	}
	
	
	@Test
	public void verifyReadMeTitle() {
		GithubActions githubActions = new GithubActions();
		githubActions.navigateToUrl(driver, "https://github.com/bhanushankar422/ZoomRecordings/");
		
		CodeActions codeActions = new CodeActions();
		codeActions.selectCode(driver);
		String heading = codeActions.getReadMeHeading(driver);
		assertThat(heading).isEqualTo("Zoom Recordings for Java Training");
		driver.close();
	}

}
