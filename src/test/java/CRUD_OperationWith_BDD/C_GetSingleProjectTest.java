package CRUD_OperationWith_BDD;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class C_GetSingleProjectTest {
	
	@Test
	public void getSingleProjectTest()
	{
		baseURI="http://localhost";
		port=8084;
		
		when()
			.get("/projects/TY_PROJ_604")
			
		.then()
			.assertThat()
				.contentType(ContentType.JSON)
				.statusCode(200)
				.log().all();
	}

}
