package FrameWork;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.Response;
import org.testng.annotations.Test;

import GenericUtility.DataBaseUtility;
import GenericUtility.EndpointUtility;
import GenericUtility.ExcelUtility;
import GenericUtility.JavaUtility;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.restassured.RestAssured;
import io.restassured.response.Validatable;
import io.restassured.response.ValidatableResponse;

public class EndToEnd5 {
	ExcelUtility elib= new ExcelUtility();
	JavaUtility jlib= new JavaUtility();
	String projectName;
	String pId;
	//create project in rest
	@Test
	public void createProject() throws Throwable
	{
		String createdBy = elib.getExcelData("sheet1", 11, 0);
		projectName=elib.getExcelData("sheet1", 11, 1)+jlib.getRanDomNumber();
		String status=elib.getExcelData("sheet1", 11, 2);
		String team=elib.getExcelData("sheet1", 11, 3);
		int teamSize= Integer.parseInt(team);
		
		EndpointUtility endPoint= new EndpointUtility();
		Response body = (Response) endPoint.post(endPoint.body(createdBy, projectName, status, teamSize));
		
				
		((Validatable<ValidatableResponse, io.restassured.response.Response>) body).then().log().all();
		RestAssured rlib= new RestAssured();
	//	pId=rlib.getJsonData(body, "projectId");
		//pId=body.jsonPath().get("projectId");
		System.out.println(pId);

		//check in database
       DataBaseUtility Dlib = new DataBaseUtility();
		
		Dlib.connectDB();
		
		String query = "select* from project";
		
		Dlib.executeQuerryAndVerify(query, 1, pId);
		
		//delete in GUI
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
	//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("http://localhost:8084/");
		driver.findElement(By.xpath("//input[@id='usernmae']")).sendKeys("rmgyantra");;
		driver.findElement(By.xpath("//input[@id='inputPassword']")).sendKeys("rmgy@9999");
		driver.findElement(By.xpath("//button[text()='Sign in']")).click();
		driver.findElement(By.xpath("//a[text()='Projects']")).click();
		driver.findElement(By.xpath("//td[text()='"+pId+"']/following-sibling::td/a[@class='delete']")).click();
		driver.findElement(By.xpath("//input[@class='btn btn-danger']")).click();
		List<WebElement> allproid = driver.findElements(By.xpath("//th[text()='ProjectId']/ancestor::table[@class='table table-striped table-hover']/descendant::tr/td[1]"));
		boolean flag = false;
		for (WebElement element : allproid) {
			if(element.equals(pId))
			{
				flag=true;
				break;
			}
		}
		if(flag)
		{
			System.out.println("data is present");
		}
		else
		{
			System.out.println("data is not present");
		}
	}


}
