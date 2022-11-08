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

public class GetWithoutUriTest {
	
	@Test
	public void GetWithoutUriTest()
	{
			int eData=404;
		  port=8084;
		
		
			Response res = when().post("/addProjects");
			int actData = res.getStatusCode();
			Assert.assertEquals(eData, actData);
		
	}

}
