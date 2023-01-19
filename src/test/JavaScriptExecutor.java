package test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class JavaScriptExecutor {

	public static void main(String[] args)throws Exception {
		
	//1 scroll by pixel value
		/*
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");	
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,350)");
		*/
	//2 scroll by element
		/*
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");	
		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement x= driver.findElement(By.linkText("Automation Testing"));
		js.executeScript("arguments[0].scrollIntoView();",x);
		*/
		
	//Get the title of the webpage
		/*
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");	
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		System.out.println(driver.getTitle());
		
		String title = js.executeScript("return document.title;").toString();
		System.out.println(title);
		*/
		
	// Get the text of an element
		/*
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://accounts.google.com/signup");	
		JavascriptExecutor js = (JavascriptExecutor)driver;		
		String title = js.executeScript("return document.title;").toString();
		System.out.println(title);
		js.executeScript("document.getElementById('firstName').value='testing'");
		WebElement x= driver.findElement(By.xpath("//input[@type='checkbox']"));
		js.executeScript("arguments[0].click();", x);
		js.executeScript("location.reload();");
		*/
		
	// 
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");	
		driver.findElement(By.xpath("//span[@class='select2-selection select2-selection--single']")).click();
		driver.findElement(By.className("select2-search__field")).sendKeys("India");
		driver.findElement(By.xpath("//li[text()='India']")).click();
		
	}

}
