package PracticeExamples;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
public class C_PostUsingRequestChaining {
	
			@Test
			public void C_PostUsingRequestChainingTest()
			{
				baseURI="http://localhost:8084";
				port=8084;
				
				A_addProjectPojoClass obj = new A_addProjectPojoClass("Anusam", "Saaamazz", "future", 10);
				
					Response response = given().contentType(ContentType.JSON).body(obj)
						.when().post("/addProject");
					
						String projId = response.jsonPath().get("projectId");
						
						given().pathParam("projectId", projId)
						.when().get("http://localhost:8084/projects/")
						.then().assertThat().log().all();
						
			}

			
}
