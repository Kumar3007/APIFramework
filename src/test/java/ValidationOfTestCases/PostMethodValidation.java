package ValidationOfTestCases;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.port;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class PostMethodValidation {
	
	@Test
	public void createProjectTest()
	{
			JSONObject jobj = new JSONObject();
			jobj.put("createdBy", "DELL");
			jobj.put("projectName", "eljnfgsgblsDell");
			jobj.put("status", "Ongng");
			jobj.put("teamSize", "10");
			baseURI="http://localhost/";
			port=8084;
			
			
	given()
		.header("content-Type","application/json")
		.contentType(ContentType.JSON)
		.accept(ContentType.JSON)
		.body(jobj)
		
	.when()
		.post("/addProject")
		
	.then()
		.assertThat()
		.statusCode(201)
			.contentType(ContentType.JSON).log().all();
		
		
		
		
			
			
	}

}
