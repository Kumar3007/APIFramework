package CRUD_OperationWithOut_BDD;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

public class D_GetAllProject {
	
	@Test
	public void getAllProject()
	{
	Response response = RestAssured.get("http://localhost:8084/projects");
	System.out.println(response.getContentType());
	ValidatableResponse validate = response.then();
	validate.assertThat().contentType(ContentType.JSON);
	validate.log().all();
		
				
				
	}

}
