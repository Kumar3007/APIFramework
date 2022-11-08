package ValidationOfTestCases;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import junit.framework.Assert;

import static io.restassured.RestAssured.*;

public class PostingWithoutEndPoint {
	
	@Test
	public void postingWithoutEndPoint()
	{
		String eData="HTTP/1.1 405 ";
		
		JSONObject json = new JSONObject();
		json.put("createdBy", "SamanthaSamz");
		json.put("projectName", "RRR");
		json.put("status", "completed");
		json.put("teamSize", 12);
		
		baseURI="http://localhost";
		port=8084;
		
		given()
			.body(json)
			.contentType(ContentType.JSON);
		
			Response res = when().post("");
			String actData = res.getStatusLine();
			Assert.assertEquals(eData, actData);
		
		
		
	}

}
