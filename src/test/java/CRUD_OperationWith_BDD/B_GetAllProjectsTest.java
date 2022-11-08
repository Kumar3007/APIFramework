package CRUD_OperationWith_BDD;

import org.apache.http.impl.cookie.BasicSecureHandler;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class B_GetAllProjectsTest {
	
	@Test
	public void getAllProjectTest()
	{
		baseURI="http://localhost";
		port=8084;
		
		when()
			.get("/projects")
			
		.then()
				.assertThat()
				.contentType(ContentType.JSON)
				.statusCode(200)
				.log().all();
				
			
	
	}

}
