package Parameter;
import static io.restassured.RestAssured.*;
import org.testng.annotations.Test;

public class QueryParameter {

	@Test
	public void Queryparameter()
	{
		given()
		.queryParam("per_page", 1)
		
		.when()
			.get("https://docs.github.com/en/rest/deploy-keys")
		
			.then().log().all();
	}
}
