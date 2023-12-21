package final_project;

import java.io.IOException;
import java.util.Iterator;

import javax.swing.JRadioButton;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class login {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.msedge.driver", "C:\\Users\\Samii\\Downloads\\Compressed\\New folder\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
	
		excel e =new excel();
		for(int i =0 ; i< e.count(); i++) {
			driver.get("https://www.facebook.com/login.html");
			driver.manage().window().maximize();
			driver.findElement(By.name("email")).clear();
			driver.findElement(By.name("email")).sendKeys(e.getdata(i, 0));
			driver.findElement(By.name("pass")).clear();
			driver.findElement(By.name("pass")).sendKeys(e.getdata(i, 1));
			driver.findElement(By.id("loginbutton")).click();	
		}
		
		
		
		
		
		
		
		
		
//		
//		
//		//test login
//				driver.get("https://www.facebook.com/login.html");
//				driver.manage().window().maximize();
//				driver.findElement(By.name("email")).clear();
//				driver.findElement(By.name("email")).sendKeys("samii@gmail.com");
//				driver.findElement(By.name("pass")).clear();
//				driver.findElement(By.name("pass")).sendKeys("123");
//			    driver.findElement(By.name("loginbutton")).click();
//				driver.findElement(By.id("loginbutton")).click();
//				driver.close();
//				
		
		
		
		
		
		
		
		
		//driver.manage().window().maximize();
		//System.out.println(driver.getTitle());
		//driver.findElement(By.linkText("Facebook")).click();
		//driver.findElement(By.partialLinkText("Facebook")).click();
		//Thread.sleep(3000);
		//driver.close(); 
		
		
		
		
		
		
		
		
		
	}

}
