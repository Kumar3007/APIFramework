package RequestChaining;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.port;

import org.testng.annotations.Test;

import DifferentWaysToPostRequest.addProjectPojoTest;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class PostAndUpdate {
	
	@Test
	public void PostAndUpdate()
	{
		baseURI="http://localhost";
		port=8084;
		
		addProjectPojoTest pojo = new addProjectPojoTest("AKRDS", "MaanasaSarovaraYatra", "Pending", 10);
		Response response = given()
			.body(pojo)
			.contentType(ContentType.JSON)
			
		.when()
			.post("/addProject");
		String proId = response.jsonPath().get("projectId");
		addProjectPojoTest poj = new addProjectPojoTest("AKDRDS", "aMaanasaSarovaraYatra", "dPending", 100);
			
		given()
				.body(poj)
				.contentType(ContentType.JSON)
				.pathParam("projectId", proId)
				
				.when()
					.put("http://localhost:8084/projects/{projectId}")
					
					
				.then()
					.assertThat().log().all();
	}
}
