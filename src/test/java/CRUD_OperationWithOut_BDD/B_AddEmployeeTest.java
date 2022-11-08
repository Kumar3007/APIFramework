package CRUD_OperationWithOut_BDD;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class B_AddEmployeeTest {
	
	@Test
	public void AddEmployee()
	{
		//Create an Object for JSONObject
		
			JSONObject jobj = new JSONObject();
			jobj.put("designation", "SDETeng");
			jobj.put("dob","30/07/1995" );
			jobj.put("email", "kur3007ram@gmail.com");
			jobj.put("empName", "Kumar");
			jobj.put("experience", "10");
			jobj.put("mobileNo", "8867432421");
			jobj.put("project", "kumarPro");
			jobj.put("role", "apitester");
			jobj.put("username", "zzkumaz");
		//precondtions(body and contentType)
			
			RequestSpecification reqs = RestAssured.given();
			reqs.body(jobj);
			reqs.contentType(ContentType.JSON);
			
		
		//Actions
			Response response = reqs.post("http://localhost:8084/employees");//gets the response
			ValidatableResponse valResp = response.then();
			valResp.assertThat().contentType(ContentType.JSON);
			valResp.assertThat().statusCode(201);
			valResp.log().all();
			
			
	}

}
