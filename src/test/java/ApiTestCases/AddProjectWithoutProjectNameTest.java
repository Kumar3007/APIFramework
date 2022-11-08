package ApiTestCases;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

import java.util.Random;

public class AddProjectWithoutProjectNameTest {
	
		@Test
	public void AddProjectWithoutProjectName()
	{
			Random ran=new Random();
			int random = ran.nextInt(500);
			
			JSONObject jobj = new JSONObject();
			jobj.put("createdBy", "DELL"+random);
			
			jobj.put("status", "Ongng");
			jobj.put("teamSize", "10");
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
