package ApiTestCases;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.port;

import java.util.Random;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class AddProjectWithWrongResourceTest {
	@Test
	public void AddProjectWithoutProjectName()
	{
			Random ran=new Random();
			int random = ran.nextInt(500);
			
			JSONObject jobj = new JSONObject();
			jobj.put("createdBy", "DELL");
			jobj.put("status", "Ongng");
			jobj.put("projectName", "jmngjhf");
			jobj.put("teamSize", "10");
			baseURI="http://localhost";
			port=8084;
			
			
			given()
			.body(jobj)
			.contentType(ContentType.JSON)
			
		.when()
			.post("/addProjectdede")
			
		.then()
			.assertThat()
				.statusCode(404)
				.contentType(ContentType.JSON).log().all();
	}
}
