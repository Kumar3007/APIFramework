package FrameWork;

import java.sql.SQLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import GenericUtility.DataBaseUtility;
import GenericUtility.EndpointUtility;
import GenericUtility.JavaUtility;
import io.github.bonigarcia.wdm.WebDriverManager;

public class EndToEndApiTest3 {
	
	String PID;
	JavaUtility jlib= new JavaUtility();
	public String projname= "endtoendtest"+jlib.getRanDomNumber();
	@Test
	public void createProjectInGUI() throws InterruptedException, Throwable 
	{
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://localhost:8084/");
		driver.findElement(By.xpath("//input[@id='usernmae']")).sendKeys("rmgyantra");
		driver.findElement(By.xpath("//input[@id='inputPassword']")).sendKeys("rmgy@9999");
		driver.findElement(By.xpath("//button[text()='Sign in']")).click();
		driver.findElement(By.xpath("//a[text()='Projects']")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-success']")).click();
		driver.findElement(By.xpath("//input[@name='projectName']")).sendKeys(projname);
		driver.findElement(By.xpath("//input[@name='createdBy']")).sendKeys("kumar");
		Select sel=new Select(driver.findElement(By.xpath("//label[text()='Project Status ']/parent::div[@class='form-group']/child::select[@name='status']")));
		sel.selectByVisibleText("On Goging");
		driver.findElement(By.xpath("//input[@class='btn btn-success']")).click();
		Thread.sleep(3000);
		WebElement proID = driver.findElement(By.xpath("//tbody/tr/td[text()='"+projname+"']/parent::tr/td[1]"));
		 PID = proID.getText();
		System.out.println(PID);
	
		EndpointUtility endpoint= new EndpointUtility();
		endpoint.delete(PID)
		.then().assertThat().statusCode(204);
	
	
			String query = "select * from project";
		DataBaseUtility dblib= new DataBaseUtility();
		dblib.connectDB();
		//String query1 ="insert into empinfo values('KUMAR', 5,45000) ";
		dblib.executeQuerryAndVerify(query, 1, PID);
		
		
	}

	
}
