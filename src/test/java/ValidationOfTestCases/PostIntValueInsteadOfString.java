package ValidationOfTestCases;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.port;
import static io.restassured.RestAssured.when;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import junit.framework.Assert;

public class PostIntValueInsteadOfString {
		
	@Test
	public void PostIntValueInsteadOfString()
	{
		int eData=404;
		
		JSONObject json = new JSONObject();
		json.put("createdBy", "SamanthaSamz");
		json.put("projectName", "RRR");
		json.put("status", 1231464);
		json.put("teamSize", 12);
		
		
		baseURI="http://localhost";
		port=8084;
		
		given()
			.body(json)
			.contentType(ContentType.JSON);
		
			Response res = when().post("/addProjects");
			int actData = res.getStatusCode();
			Assert.assertEquals(eData, actData);
		
		
	}
	
}
