package ApiTestCases;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.port;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class AddProjectWithoutBody{
	@Test
	public void AddProjectWithoutBody()
	{
			JSONObject jobj = new JSONObject();
			jobj.put("projectName", "samsamsam");
			
			baseURI="http://localhost";
			port=8084;
			
			
	given()
		.body(jobj)
		.contentType(ContentType.JSON)
		
	.when()
		.post("/addProject")
		
	.then()
		.assertThat()
			.statusCode(400)
			.contentType(ContentType.JSON).log().all();
		
		
		
		
			
	}
}
