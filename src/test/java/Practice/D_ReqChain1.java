package Practice;
import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class D_ReqChain1 {
	
	@Test
	public void PostAndGet()
	{
		baseURI="http://localhost:8084";
		port=8084;
		
		//create an Object for POJO class
		A_NormalPojoClassCreation ReqChaining = new A_NormalPojoClassCreation("Anu", "Anu123", 987654321, "anuamam@gmail.com", "Mangalore");
		
				Response response =  given()
					.contentType(ContentType.JSON).body(ReqChaining)
					.when()
						.post("/addProject");
				
				String ProjId = response.jsonPath().get("/projectId");
							given().param("projectId", ProjId)
							.when().get("http://localhost:8084/projects/{projectId}")
							.then().assertThat().statusCode(200).log().all();
							
							
							
	}

}
