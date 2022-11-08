package RequestChaining;
import static io.restassured.RestAssured.*;
import org.testng.annotations.Test;

import DifferentWaysToPostRequest.addProjectPojoTest;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class PostPutGetDelete {
	
		@Test
		 public void postAndGetProject()
		{
	  baseURI="http://localhost";
		 port=8084;
		 addProjectPojoTest pojo=new addProjectPojoTest("manjakumar",
		"bowlCatch", "onfg", 5);
	Response response = given()
		.contentType(ContentType.JSON)
		 .body(pojo)
		 .when()
		 .post("/addProject");
		
		String proId=response.jsonPath().get("projectId");
		addProjectPojoTest poj=new addProjectPojoTest("kumarmanja",
		"Btingbowl", "Fowl", 4);
	 given()
		 .body(poj)
		 .contentType(ContentType.JSON)
		 .pathParam("projectId", proId)
		 .when()
		 .put("http://localhost:8084/projects/{projectId}");
	 given()
	     .pathParam("projectId", proId)
		 .when()
		 .get("http://localhost:8084/projects/{projectId}");
	 given()
		 .pathParam("projectId", proId)
		 .when()
		 .delete("http://localhost:8084/projects/{projectId}")
		 .then()
		 .assertThat().statusCode(204).log().all();
	}

}
