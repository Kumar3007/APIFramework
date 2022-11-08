package CRUD_OperationWith_BDD;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class A_PostProjectTest {
	
	@Test
	public void createProjectTest()
	{
			JSONObject jobj = new JSONObject();
			jobj.put("createdBy", "DELsL");
			jobj.put("projectName", "DelslsDell");
			jobj.put("status", "Ongnsg");
			jobj.put("teamSize", "10");
			baseURI="http:Z/localhost";
			port=8084;
			
			
	given()
		.body(jobj)
		.contentType(ContentType.JSON)
		
	.when()
		.post("/addProject")
		
	.then()
		.assertThat()
			.contentType(ContentType.JSON).log().all();
		
		
		
		
			
			

	}
}
