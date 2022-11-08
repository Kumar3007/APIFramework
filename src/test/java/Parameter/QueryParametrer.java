package Parameter;
import static io.restassured.RestAssured.*;
import org.testng.annotations.Test;

public class QueryParametrer {
	
		@Test
	public void QueryParameterTest()
	{
			given()
				.queryParam("page", 2)
				
			.when()
				.get("https://reqres.in/api/users")
				.then().log().all();
				
	}

}
