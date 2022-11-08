package RequestChaining;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.port;

import org.testng.annotations.Test;

import DifferentWaysToPostRequest.addProjectPojoTest;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class UpdateAndGet {
	
	@Test
	public void Post_UpdateAndGet()
	{
		baseURI="http://localhost";
		port=8084;
		
		addProjectPojoTest pojo = new addProjectPojoTest("AKRMDS", "mMaanasaSarovaraYatra", "mPending", 110);
		Response response = given()
			.body(pojo)
			.contentType(ContentType.JSON)
			
		.when()
			.post("/addProject");
		
				String proId = response.jsonPath().get("projectId");
				given()
					.pathParam("projectId", proId)
				
				.when()
					.put("http://localhost:8084/projects/{projectId}")
					
				.then()
					.assertThat().log().all();
				
	}

}
