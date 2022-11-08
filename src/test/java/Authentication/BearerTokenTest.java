package Authentication;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
public class BearerTokenTest {
	
	@Test
	public void BearerTokenTest()
	{
		given()
			.auth()
			.oauth2("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")
		.when()
			.get("https://api.github.com/user/repos")
			
		.then()
			.assertThat().statusCode(200)
			.log().all();
	}

}
