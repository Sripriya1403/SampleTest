package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ChromeTesting {

	public static void main(String[] args) {
	//1
		System.setProperty("webdriver.driver.chrome", "./Drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("FirstName Test");
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("LastName Test");
		driver.findElement(By.xpath("//textarea[@rows='3']")).sendKeys("Address Test");
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("Test@123.com");
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).clear();
		driver.findElement(By.xpath("//input[@value='Cricket']")).click();

	
		Select dropdownSkill = new Select(driver.findElement(By.xpath("//select[@ng-model='Skill']")));
		dropdownSkill.selectByIndex(4);
		//dropdownSkill.selectByValue("Backup Management"); //select by attribute value
		//dropdownSkill.selectByVisibleText("Certifications"); //select by textarea value
		driver.close(); 
		
	//2
		
		/*System.setProperty("webdriver.driver.chrome", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		driver.manage().window().minimize();
		driver.manage().window().fullscreen();
		
		driver.close();
		
		driver.navigate().refresh();
		driver.navigate().back();
		driver.navigate().forward();*/
	}

}
