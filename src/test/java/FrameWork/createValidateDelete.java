package FrameWork;

import static org.junit.Assert.assertFalse;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.Response;
import org.testng.annotations.Test;

import GenericUtility.DataBaseUtility;
import GenericUtility.EndpointUtility;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.restassured.response.ResponseBodyExtractionOptions;

public class createValidateDelete {
	String proId="TY_PROJ_3900";
	String projectName="tiktok";
	@Test
	public void createValidateDelete() throws Throwable
	{
		DataBaseUtility dlib=new DataBaseUtility();
		dlib.connectDB();
		String query="INSERT INTO project VALUES('"+proId+"','naga','o1/11/2023', 'tiktok', 'new','19')";
		dlib.execyteUpdate(query);
		String query1="select * from project";
		dlib.executeQuerryAndVerify(query1, 4, "tiktok");
		
		
		//validate in GUI
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("http://localhost:8084/");
		driver.findElement(By.xpath("//input[@id='usernmae']")).sendKeys("rmgyantra");;
		driver.findElement(By.xpath("//input[@id='inputPassword']")).sendKeys("rmgy@9999");
		driver.findElement(By.xpath("//button[text()='Sign in']")).click();
		driver.findElement(By.xpath("//a[text()='Projects']")).click();
		List<WebElement> actualdata = driver.findElements(By.xpath("//th[text()='ProjectId']/ancestor::table/child::tbody/child::tr/child::td[2]"));
		boolean flag = false;
		for (WebElement element : actualdata) {
			String listele = element.getText();
			
			if(listele.equals(projectName))
			{
				flag=true;
				break;
			}
			
			
		}
		if(flag)
		{
			System.out.println("project is present in GUI");
		}
		else
		{
			System.out.println("project is not present in GUI");
		}
		
		//delete in rest
		EndpointUtility enlib= new EndpointUtility();
		enlib.delete(proId);
		
		Thread.sleep(3000);
		 Response allpro = (Response) enlib.get();
		
		List<String>set=((ResponseBodyExtractionOptions) allpro).jsonPath().get("projectId");
		
		boolean flag1 = false;
		for (String st : set) {
			if(st.equals(proId))
			{	
				flag1=true;
				break;
			}
			
					
		}
		if(flag1)
		{
			System.out.println("project is present");
		}
		else
		{
			System.out.println("project is not present");
		}
	
		
		assertFalse(flag1);
		
		
	}
	}