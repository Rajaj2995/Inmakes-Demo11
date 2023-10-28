package org.Takes;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeScreenShots {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace\\InmkesSeleniumClass\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://lh.inmakesedu.com/");
		driver.manage().window().maximize();
		
		TakesScreenshot tr = (TakesScreenshot)driver;
		
		File image = tr.getScreenshotAs(OutputType.FILE);

        File f = new File("C:\\Users\\Dell\\eclipse-workspace\\TakeScreenShotInmakes\\Inmakes\\Inmakeshome.png");
	
        FileUtils.copyFile(image, f);	
	}

}
