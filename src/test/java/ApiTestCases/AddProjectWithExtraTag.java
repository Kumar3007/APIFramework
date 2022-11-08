package ApiTestCases;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.port;

import java.util.Random;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class AddProjectWithExtraTag {
	@Test
	public void AddProjectWithoutString()
	{
			Random ran=new Random();
			int random = ran.nextInt(500);
			
			JSONObject jobj = new JSONObject();
			jobj.put("createdBy", 1234565);
			jobj.put("status", "Ongng");
			jobj.put("projectName", "jmngjhvdff"+random);
			jobj.put("teamSize", "10");
			jobj.put("NameOfUser", "kdflf");
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