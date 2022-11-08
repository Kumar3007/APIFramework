package FrameWork;

import org.testng.annotations.Test;

import DifferentWaysToPostRequest.addProjectPojoTest;
import GenericUtility.EndpointUtility;
import GenericUtility.JavaUtility;
import GenericUtility.RestAssuerdLibrary;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class CreateGetUpdateDelete {
	addProjectPojoTest plib=new addProjectPojoTest("", " ", " ", 0);
	String proid="";
	JavaUtility ran=new JavaUtility();	
	RestAssuerdLibrary rest=new RestAssuerdLibrary();
	EndpointUtility	Epu=new EndpointUtility();
	@Test(priority = 1)
	public void createtest()
	{
		int random = ran.getRanDomNumber();
		Response body = Epu.post(Epu.body("manju78797","Projec46"+random,"ongoing",7));
		proid = rest.getJsonData(body,"projectId");
		body.then().assertThat().statusCode(201).log().all(); 
	}
	@Test(priority =2 )
	public void updatetest()
	{
		int rand = ran.getRanDomNumber();
		Epu.put(Epu.body("manju@354","djnkvgvhij"+rand, "Ongoing", 8),proid).
		then().assertThat().statusCode(500).log().all();
	}
	@Test(priority = 3)
	public void DeleteProject()
	{
		Epu.delete(proid).then().log().all();
	} 
}
