package CRUD_OperationWith_BDD;

import static io.restassured.RestAssured.*;


import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class D_UpdateProjectTest {

	@Test
	public void updateProjectTest()
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
			.put("/projects/TY_PROJ_604")
		.then()
			.assertThat()
				.contentType(ContentType.JSON)
				.statusCode(200)
				.log().all();
				
		
		
	}
}
