package br.com.alura.leilao.e2e.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserFactory {

//  Documentação
//	http://chromedriver.storage.googleapis.com/index.html
//	https://github.com/mozilla/geckodriver/releases	

	// Modificado para utilizar WebDriverManager
	public WebDriver createWebDriver() {
//		String webdriver = System.getProperty("browser", "chrome");
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();		
//		driver.manage().window().setSize(new Dimension(1024, 768));
		driver.manage().window().maximize();
		
//		switch (webdriver) {
//			case "firefox":
//				return initFirefoxDriver();
//			case "chrome":
//				return initChromeDriver();
//			default:
//				return new HtmlUnitDriver();
				return driver;
		
	}

//	private  WebDriver initChromeDriver() {
//		System.setProperty("webdriver.chrome.driver",
//				"drivers\\chromedriver.exe");
//		return new ChromeDriver();
//	}
//
//	private  WebDriver initFirefoxDriver() {
//		System.setProperty("webdriver.gecko.driver",
//				"drivers\\geckodriver.exe");
//		return new FirefoxDriver();
//	}
}
