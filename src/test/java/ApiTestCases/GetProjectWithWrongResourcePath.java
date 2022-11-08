package ApiTestCases;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.port;
import static io.restassured.RestAssured.when;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class GetProjectWithWrongResourcePath {
	@Test
	public void getAllProjectTest()
	{
		baseURI="http://localhost";
		port=8084;
		
		when()
			.get("/projects.kklbh")
			
		.then()
				.assertThat()
				.contentType(ContentType.JSON)
				.statusCode(404)
				.log().all();
				

}
}