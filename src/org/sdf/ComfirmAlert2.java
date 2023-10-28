package org.sdf;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ComfirmAlert2 {
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace\\Inmkes\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
	WebElement com = driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']"));
		com.click();
		
		WebElement comf = driver.findElement(By.xpath("//button[text()='click the button to display a confirm box ']"));
		comf.click();
		
		Alert  yes = driver.switchTo().alert();
		String print = yes.getText();
		System.out.println(print);
		yes.accept();
}

}