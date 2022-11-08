package RequestChaining;
import static io.restassured.RestAssured.*;


import org.testng.annotations.Test;

import DifferentWaysToPostRequest.addProjectPojoTest;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class PostRequestAndDeleteResponse {
	
	@Test
	public void PostRequestAndDeleteResponse()
	{
		baseURI="http://localhost";
		port=8084;
		
		addProjectPojoTest pojo = new addProjectPojoTest("Rio", "MaanasaSarovaraYatra", "Pending", 10);
		Response response = given()
			.body(pojo)
			.contentType(ContentType.JSON)
			
		.when()
			.post("/addProject");
		
				String proId = response.jsonPath().get("projectId");
				given()
					.pathParam("projectId", proId)
				
				.when()
				.delete("projects/{projectId}")
				
				.then()
					.log().all();
			
			
	}
	
	

}
