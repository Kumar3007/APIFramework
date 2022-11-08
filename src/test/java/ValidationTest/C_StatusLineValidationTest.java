package ValidationTest;
import static io.restassured.RestAssured.*;

import javax.xml.ws.Response;

import org.testng.Assert;
import org.testng.annotations.Test;

public class C_StatusLineValidationTest {

		@Test
		public void statusLineValidation()
		{
			baseURI="http://localhost";
			port=8084;
			String expectedStatusLine="HTTP/1.1 200 ";
			io.restassured.response.Response res=given()
					.get("/projects");
					String actualStatusLine=res.getStatusLine();
					Assert.assertEquals(actualStatusLine, expectedStatusLine);
		}
}
