package Practice;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
public class C_RequestChaining {
	
	@Test
	public void postAndGetTest()
	{
		baseURI="http://localhost:8084";
		port=8084;
	  //create an object for Pojo class to send PayLoad
	A_NormalPojoClassCreation ReqChain = new A_NormalPojoClassCreation("Samanthasam", "sam123", 123456789, "kumar@gmail.com", "MysHYd");
	
	//post the request in String Format(body accepts only in String format)
	//Store that response in a variable and covert to json and capture the Project ID
			Response response = given().contentType(ContentType.JSON).body(ReqChain)
								.when().post("/addProject");
							String projId = response.jsonPath().get("/projectId");
							
							given().param("projectId", projId);
							when().get("http://localhost:8084/projects/")
							.then().assertThat().statusCode(200).log().all();
								
							
	
	}

}
