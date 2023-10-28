package org.sdf;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PromptAlert3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Dell\\eclipse-workspace\\InmkesAlert\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");

		WebElement p = driver.findElement(By.xpath("//a[text()='Alert with Textbox ']"));
		p.click();

		WebElement c = driver
				.findElement(By.xpath("//button[text()='click the button to demonstrate the prompt box ']"));
		c.click();
		Alert al = driver.switchTo().alert();

		Thread.sleep(3000);
		String t = al.getText();
		System.out.println(t);
		al.sendKeys("Hello Raj");
		Thread.sleep(4000);
		al.accept();

	}

}
