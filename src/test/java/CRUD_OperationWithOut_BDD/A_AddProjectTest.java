package CRUD_OperationWithOut_BDD;

import java.util.Random;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class A_AddProjectTest {
	
	
	@Test
	public void createProject()
	{
		
		Random ran=new Random();
		int random = ran.nextInt(500);
		
		//Step1:- create the body using json simple
		
		JSONObject jobj=new JSONObject();//creates emptyspace for u in backend
		jobj.put("createdBy", "kumar");
		jobj.put("projectName", "TYSStys"+random);
		jobj.put("status", "ongng");
		jobj.put("teamSize", "10");
		
		//preconditions (body and contenttype)
		RequestSpecification reqs = RestAssured.given();
		reqs.body(jobj);
		reqs.contentType(ContentType.JSON);
		
		//Actions
		Response response = reqs.post("http://localhost:8084/addProject");//gets the response
		ValidatableResponse valResp = response.then();
		valResp.assertThat().contentType(ContentType.JSON);
		valResp.assertThat().statusCode(201);
		valResp.log().all();
		
		
		
		
		
		
		
		
		
		
	}

}
