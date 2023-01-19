package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Mousefunctions {

	public static void main(String[] args) throws Exception{
	//1 ****iFrames****
			/*
				System.setProperty("webdriver.driver.chrome", "./Driver/chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				driver.get("https://demo.automationtesting.in/Frames.html");
				driver.switchTo().frame("singleframe");
				driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Testing");
				driver.switchTo().defaultContent();
				driver.findElement(By.xpath("//a[@href='#Multiple']")).click();
				driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']")));
				driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']")));
				driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Testing");
				driver.switchTo().defaultContent();//main HTML
				driver.findElement(By.xpath("//a[@href='#Single']")).click();
			*/
	//2 ****Drag & Drop****
				/*
				System.setProperty("webdriver.driver.chrome", "./Driver/chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				driver.get("https://demo.guru99.com/test/drag_drop.html");
				
				Actions action = new Actions(driver);
				
				WebElement src= driver.findElement(By.xpath("//a[text()=' BANK ']"));
				WebElement des= driver.findElement(By.id("bank"));
				
				action.dragAndDrop(src, des).build().perform();
				
				WebElement src1= driver.findElement(By.xpath("//a[text()=' 5000']"));
				WebElement des1= driver.findElement(By.id("amt7"));
				action.dragAndDrop(src1, des1).build().perform();
				*/
		
	//3 ****Right Click****
				/*
				System.setProperty("webdriver.driver.chrome", "./Driver/chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				driver.get("https://demo.guru99.com/test/simple_context_menu.html");
				
				Actions action = new Actions(driver);
				
				WebElement src= driver.findElement(By.xpath("//span[text()='right click me']"));
				WebElement copy= driver.findElement(By.xpath("//span[text()='Copy']"));
				action.contextClick(src).click(copy).build().perform();	
				*/
		
	//4 ****Double Click****
				/*
				System.setProperty("webdriver.driver.chrome", "./Driver/chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		
				Actions action = new Actions(driver);
		
				WebElement src= driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
				action.doubleClick(src).build().perform();	
				*/
		
	//5 ****MouseOver****
			
				System.setProperty("webdriver.driver.chrome", "./Driver/chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				driver.get("https://www.snapdeal.com/");
		
				Actions action = new Actions(driver);
		
				WebElement src= driver.findElement(By.xpath("//span[text()='Home & Kitchen']"));
				action.moveToElement(src).build().perform();	
		
	}

}
