package com.testingshastra.Keyworkds;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.utils.Constant;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Keyword {
	/**
	 * It will launch the specific browser
	 * 
	 * @param browserName has to be one of:
	 *                    <ul>
	 *                    <li>Chrome</li>
	 *                    <li>Firefox</li>
	 *                    <li>IE</li>
	 *                    </ul>
	 */
	public static void openBrowser(String browserName) {
		switch (browserName) {
		case "Chrome":
			WebDriverManager.chromedriver().setup();
			Constant.driver = new ChromeDriver();
			break;
		case "Firefox":
			WebDriverManager.firefoxdriver().setup();
			Constant.driver = new FirefoxDriver();
			break;
		case "IE":
			WebDriverManager.iedriver().setup();
			Constant.driver = new InternetExplorerDriver();
			break;

		default:
			System.out.println("Unable to launch browser");
			break;
		}

	}

	/**
	 * It will launch the URL
	 * 
	 * @param baseUrl
	 */
	public static void LaunchUrl(String baseUrl) {
		Constant.driver.get(baseUrl);
	}

}
