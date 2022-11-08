package ValidationTest;
import static io.restassured.RestAssured.*;

import org.testng.Assert;

import io.restassured.response.Response;

public class A_GetAllProjectStaticValTest {
	
	public void getAllProjectTest()
	{
	
		String ExpectedPname="samzz";
		Response response = when().get("https://localhost:8084/projects");
		String actualPname = response.jsonPath().get("[0].projectName");
		Assert.assertEquals(actualPname, ExpectedPname);
		
		
	}

}
