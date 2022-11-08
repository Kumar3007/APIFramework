package CRUD_OperationWith_BDD;
import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class E_DeleteSingleProject {
	
		@Test
		public void deleteSingleProjectTest()
		{
			baseURI="http://localhost";
			port=8084;
			
			when()
				.delete("/projects/TY_PROJ_604")
				
			.then()
				.assertThat()
					.contentType(ContentType.JSON)
					.statusCode(204)
					.log().all();
		}
}
