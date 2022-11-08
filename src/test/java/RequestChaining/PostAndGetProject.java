package RequestChaining;
import static io.restassured.RestAssured.*;
import org.testng.annotations.Test;

import DifferentWaysToPostRequest.addProjectPojoTest;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class PostAndGetProject {
	
	@Test
	public void PostAndGetProject()
	{
		baseURI="http://localhost:8084";
		port=8084;
		
		addProjectPojoTest pojo = new addProjectPojoTest("SmokeManja", "testmySkill", "completed", 4);
				Response response = given().contentType(ContentType.JSON).body(pojo)
							.when().post("/addProject");
				String proId = response.jsonPath().get("projectId");
				given().param("projectId", proId)
					.when().get("http://localhost:8084/projects/{projectId}")
					.then()
					.assertThat().statusCode(200).log().all();
						
	}
}
