package org.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FramesDemo {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("");
		
		WebDriver frame3 = driver.switchTo().frame(driver.findElement(By.id("frm3")));// main frame
		
		WebElement txtBox = driver.findElement(By.id("name"));
		txtBox.sendKeys("Welcome!");
		
		WebDriver frame1 = driver.switchTo().frame(driver.findElement(By.id("frm1")));
		
		WebElement courseDropDown = driver.findElement(By.id("course"));
		Select select = new Select(courseDropDown);
		select.selectByVisibleText("Javascript");
		
		driver.switchTo().defaultContent();
		
		WebElement txtBox2 = driver.findElement(By.id("name"));
		txtBox2.sendKeys("Hello Welcome!");

		
		WebDriver frame2 = driver.switchTo().frame(driver.findElement(By.id("frm2")));
		
		WebElement frstName = driver.findElement(By.id("firstName"));
		frstName.sendKeys("Pratik");
		
		WebElement lstName = driver.findElement(By.id("lastName"));
		lstName.sendKeys("Kumar");
		
		WebElement maleBtn = driver.findElement(By.id("malerb"));
		maleBtn.click();
		
		
		WebElement languageBox = driver.findElement(By.id("englishchbx"));
		languageBox.click();
		
		
		
	}

}
