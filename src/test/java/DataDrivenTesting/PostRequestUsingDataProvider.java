package DataDrivenTesting;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import GenericUtility.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import DifferentWaysToPostRequest.addProjectPojoTest;
import io.restassured.http.ContentType;

public class PostRequestUsingDataProvider {

			
	
	@Test(dataProvider="TestBody")
	public void addProjectTest(String createdBy,String projectName,String status,int teamSize)
	{
		addProjectPojoTest apj = new addProjectPojoTest(createdBy, projectName, status, teamSize);
		given()
		.contentType(ContentType.JSON)
		
		.body(apj)
		.when()
		.post("http://localhost:8084/addProject")
		.then().assertThat().contentType(ContentType.JSON)
		.log().all();
		
	}
	
	
	@DataProvider
	public Object[][]  TestBody() throws Throwable
	{
	
	
	ExcelUtility Exlib = new ExcelUtility();
	Object[][] obj = new Object[2][4];
	
	obj[0][0]=Exlib.getExcelData("Sheet1", 1, 0);
	obj[0][1]=Exlib.getExcelData("Sheet1", 1, 1);	
	obj[0][2]=Exlib.getExcelData("Sheet1", 1, 2);	
	obj[0][3]=Exlib.getIntExcelData("Sheet1", 1, 3);	
	obj[1][0]=Exlib.getExcelData("Sheet1", 2, 0);	
	obj[1][1]=Exlib.getExcelData("Sheet1", 2, 1);	
	obj[1][2]=Exlib.getExcelData("Sheet1", 2, 2);	
	obj[1][3]=Exlib.getIntExcelData("Sheet1", 2, 3);	
		return obj;
	
	
	
	}
}

