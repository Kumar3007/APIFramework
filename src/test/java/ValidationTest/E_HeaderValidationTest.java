package ValidationTest;
import static io.restassured.RestAssured.*;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class E_HeaderValidationTest {
	
	@Test
	public void validation()
	{
		baseURI="http://localhost";
		port=8084;
		String expectedContentType= "application/json";
		String expectedVary="Access-Control-Request-Headers";
			Response response = when().get("/projects");
			String actualcontentType=response.getContentType();
			String actualVary=response.getHeader("Vary");
			response.then().log().all();
			Assert.assertEquals(expectedContentType, actualcontentType);
			Assert.assertEquals(expectedVary, actualVary);
	}

}
