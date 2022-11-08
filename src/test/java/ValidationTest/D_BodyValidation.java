package ValidationTest;
import static io.restassured.RestAssured.*;

import org.junit.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class D_BodyValidation {
	
	@Test
	public void bodyValTest()
	{
		baseURI="http://localhost";
		port=8084;
		String expectedStatusLine= "HTTP/1.1 200 ";
				Response res = given()
						.get("projects");
				
				
		String body=res.getBody().asString();
		Boolean flag=false;
		
		if(body.contains("TY_PROJ_802"))
		{
			flag=true;
			System.out.println("found");
		}
		org.testng.Assert.assertTrue(flag);
	}
	

}
