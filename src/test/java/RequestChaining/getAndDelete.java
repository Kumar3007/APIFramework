package RequestChaining;
import static io.restassured.RestAssured.*;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class getAndDelete {
	
	@Test
	public void getAndDelete()
	{
		Response response = when()
			.get("http://localhost:8084/projects");
		
		String proId = response.jsonPath().get("[0].projectId");
		given()
			.pathParam("projectId", proId)
			
		.when()
			.delete("http://localhost:8084/projects/{projectId}")
		.then()
		.assertThat().log().all();
		
	}

}
