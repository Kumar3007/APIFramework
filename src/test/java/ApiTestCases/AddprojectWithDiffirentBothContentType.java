package ApiTestCases;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.port;

import java.util.Random;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class AddprojectWithDiffirentBothContentType {
	@Test
	public void AddProjectWithaMultipleData()
	{
			Random ran=new Random();
			int random = ran.nextInt(500);
			
			JSONObject jobj = new JSONObject();
			jobj.put("createdBy", "kfjfkal");
			jobj.put("status", "Ongng");
			jobj.put("projectName", "jmngjhvdff"+random);
			jobj.put("teamSize", "10");
			baseURI="http://localhost";
			port=8084;
			
			
			given()
			.body(jobj)
			.contentType(ContentType.XML)
			
		.when()
			.post("/addProject")
			
		.then()
			.assertThat()
				.statusCode(500)
				.contentType(ContentType.XML).log().all();
	}
}
