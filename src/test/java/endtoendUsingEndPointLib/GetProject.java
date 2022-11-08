package endtoendUsingEndPointLib;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import GenericUtility.EndpointUtility;

public class GetProject {
	EndpointUtility epoint=new EndpointUtility();
	//	@Test
	//	public void get()
	//	{
	//		epoint.get()
	//		.then().log().all();
	//	}

	@Test
	public void post()
	{
		epoint.post(epoint.body("krjkumar", "samantha", "ultimate", 71)).then().log().all();
	}

}