package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Testing {

	public static void main(String[] args) {
		System.setProperty("webdriver.driver.chrome","./chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	//1	
		/*driver.get("https://precisesoftware.in/");
		driver.findElement(By.xpath("//input[@name='zn_form_field_i_am_interested_in1_0']")).sendKeys("Software Testing");
		driver.findElement(By.xpath("//input[@name='zn_form_field__first_name1_1']")).sendKeys("Sripriya");
		driver.findElement(By.xpath("//input[@name='zn_form_field_last_name1_2']")).sendKeys("D");
		driver.findElement(By.xpath("//input[@name='zn_form_field_e_mail1_3']")).sendKeys("aacsd@gmail.com");
		driver.findElement(By.xpath("//input[@name='zn_form_field_phone1_4']")).sendKeys("9876543210");
		driver.findElement(By.xpath("//input[@name='zn_form_field_company1_5']")).sendKeys("Wipro Ltd");
		driver.findElement(By.xpath("//input[@name='zn_form_field_country1_6']")).sendKeys("India");
		driver.findElement(By.xpath("//textarea[@name='zn_form_field_project_description1_7']")).sendKeys("Java with Selenium");
		//driver.manage().window().minimize();
		driver.findElement(By.xpath("//input[@name='zn_form_field_i_am_interested_in1_0']")).clear();
		driver.findElement(By.xpath("//input[@name='zn_form_field__first_name1_1']")).clear();
		driver.findElement(By.xpath("//input[@name='zn_form_field_last_name1_2']")).clear();
		driver.findElement(By.xpath("//input[@name='zn_form_field_e_mail1_3']")).clear();
		driver.findElement(By.xpath("//input[@name='zn_form_field_phone1_4']")).clear();
		driver.findElement(By.xpath("//input[@name='zn_form_field_company1_5']")).clear();
		driver.findElement(By.xpath("//input[@name='zn_form_field_country1_6']")).clear();
		driver.findElement(By.xpath("//textarea[@name='zn_form_field_project_description1_7']")).clear();*/
		
	//2
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Sripriya");
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("D");
		driver.findElement(By.xpath("//textarea[@rows='3']")).sendKeys("123 Shivaji Nagar Bangalore 600101");
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("123@abc.com");
		driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("9876543210");
		driver.findElement(By.xpath("//input[@value='FeMale']")).click();
		driver.findElement(By.xpath("//input[@value='Movies']")).click();
		driver.findElement(By.xpath("//input[@id='firstpassword']")).sendKeys("abc@123");
		driver.findElement(By.xpath("//input[@id='secondpassword']")).sendKeys("abc@123");

		Select dropdown1=new Select(driver.findElement(By.xpath("//select[@id='Skills']")));
		dropdown1.selectByIndex(1);
		
		Select dropdown2=new Select(driver.findElement(By.xpath("//select[@id='Skills']")));
		dropdown2.selectByValue("Andriod");
		
		Select dropdown3=new Select(driver.findElement(By.xpath("//select[@id='yearbox']")));
		dropdown3.selectByVisibleText("1992");
		
		Select dropdown4=new Select(driver.findElement(By.xpath("//select[@placeholder='Month']")));
		dropdown4.selectByVisibleText("October");
		
		Select dropdown5=new Select(driver.findElement(By.xpath("//select[@id='daybox']")));
		dropdown5.selectByVisibleText("17");
		
	}

}
