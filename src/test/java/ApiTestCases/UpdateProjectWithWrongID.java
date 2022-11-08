package ApiTestCases;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.port;
import static io.restassured.RestAssured.when;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class UpdateProjectWithWrongID {
	@Test
	public void UpdateProjectWithWrongID()
	{
		JSONObject jobj = new JSONObject();
		jobj.put("createdBy", "DELL");
		jobj.put("projectName", "Mission#");
		jobj.put("status", "Ongng");
		jobj.put("teamSize", "101");
		baseURI="http://localhost";
		port=8084;
		
		given()
			.body(jobj)
			.contentType(ContentType.JSON);
		when()
			.put("/projects/TY_PROJ_600014")
		.then()
			.assertThat()
				.contentType(ContentType.JSON)
				.statusCode(500)
				.log().all();
	}
}
