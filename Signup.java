package final_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public  class Signup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.msedge.driver", "C:\\Users\\Samii\\Downloads\\Compressed\\New folder\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		
		//Sign up
		driver.get("https://www.facebook.com/pages/create/?ref_type=registration_form");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Sign Up")).click();
		driver.findElement(By.name("firstname")).clear();
		driver.findElement(By.name("firstname")).sendKeys("Abdelrahman");
		driver.findElement(By.name("lastname")).clear();
		driver.findElement(By.name("lastname")).sendKeys("Samii");
		driver.findElement(By.name("reg_email__")).clear();
		driver.findElement(By.name("reg_email__")).sendKeys("01027500636");
		driver.findElement(By.name("reg_passwd__")).clear();
		driver.findElement(By.name("reg_passwd__")).sendKeys("123456");
		Select day = new Select(driver.findElement(By.name("birthday_day")));
		day.selectByVisibleText("12");
		Select month = new Select(driver.findElement(By.name("birthday_month")));
		month.selectByVisibleText("Jul");
		Select year = new Select(driver.findElement(By.name("birthday_year")));
		year.selectByVisibleText("2001");
        WebElement maleRadioButton = driver.findElement(By.xpath("//input[@value='2' and @name='sex']"));
        maleRadioButton.click();
		driver.findElement(By.name("websubmit")).click();
		
	}

}


