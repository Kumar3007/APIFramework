package ValidationOfTestCases;

import static io.restassured.RestAssured.port;
import static io.restassured.RestAssured.when;
import static io.restassured.RestAssured.*;
import org.testng.annotations.Test;

import io.restassured.response.Response;
import junit.framework.Assert;

public class GetTheResponseWithWrongUri {
	
	@Test
	public void GetTheResponseWithWrongUri()
	{
		String eData="HTTP/1.1 200 ";
		
		baseURI="http://kuymadf";
		  port=8084;
		
		
			Response res = when().post("/Projects");
			String actData = res.getStatusLine();
			Assert.assertEquals(eData, actData);
	}

}
