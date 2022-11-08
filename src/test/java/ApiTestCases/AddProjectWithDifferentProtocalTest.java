package ApiTestCases;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.port;

import java.util.Random;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import GenericUtility.JavaUtility;
import io.restassured.http.ContentType;

public class AddProjectWithDifferentProtocalTest {
	@Test
	public void AddProjectWithDifferentProtocalTest()
	{
			JavaUtility random = new JavaUtility();
			
			JSONObject jobj = new JSONObject();
			jobj.put("createdBy", "dghdgh");
			jobj.put("status", "Ongng");
			jobj.put("projectName", "jmngjhvdff"+random);
			jobj.put("teamSize", "10");
			
			try
			{
				
			}
			finally
			{
				baseURI="https://localhost";
				port=8084;
			}
			
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
