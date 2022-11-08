package Practice;
import static io.restassured.RestAssured.*;
import org.testng.annotations.Test;

import GenericUtility.BaseClassRequestSpecification;

public class getProjectScriptTest extends BaseClassRequestSpecification
{
	
	@Test
	public void get()
	{
		given()
			.spec(requestspec)
			
		.when()
			.get("/projects").then().spec(responseSpec)
			.log().all();
		
		
			
	
	}

}
