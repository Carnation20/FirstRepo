package com.testingshastra.Keyworkds;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.utils.Constant;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Keyword {
	public static void openBrowser(String browserName){
		switch (browserName) {
		case "Chrome":
			WebDriverManager.chromedriver().setup();
			Constant.driver = new ChromeDriver();
			
			break;
		case "Firefox":
			WebDriverManager.firefoxdriver().setup();
			Constant.driver = new FirefoxDriver();
		case "InternateExplorer":
			WebDriverManager.iedriver().setup();
			Constant.driver = new InternetExplorerDriver();
		default:
			System.out.println("Invalid Browser open");
			break;
		}	
	
	}

}
