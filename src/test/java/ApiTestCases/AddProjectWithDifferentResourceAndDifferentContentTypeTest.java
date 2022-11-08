package ApiTestCases;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.port;

import java.util.Random;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import GenericUtility.JavaUtility;
import io.restassured.http.ContentType;

public class AddProjectWithDifferentResourceAndDifferentContentTypeTest {
	@Test
	public void AddProjectWithDifferentContentType()
	{
			JavaUtility random = new JavaUtility();
			
			JSONObject jobj = new JSONObject();
			jobj.put("createdBy", 1234565);
			jobj.put("status", "Ongng");
			jobj.put("projectName", "jmngjhvdff"+random);
			jobj.put("teamSize", "10");
			baseURI="http://localhost";
			port=8084;
			
			
			given()
			.body(jobj)
			.contentType(ContentType.XML)
			
		.when()
			.post("/addProjectfvs")
			
		.then()
			.assertThat()
				.statusCode(404)
				.contentType(ContentType.JSON).log().all();
	}
}


