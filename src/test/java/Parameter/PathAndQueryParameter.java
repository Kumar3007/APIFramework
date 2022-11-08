package Parameter;
import static io.restassured.RestAssured.*;
import org.testng.annotations.Test;

public class PathAndQueryParameter {
	
	@Test
	public void parameter()
	{
		given()
			.pathParam("username", "Samantha")
			.queryParam("sort", "created")
			.queryParam("page", "2")
			
		.when()
			.get("https://api.github.com/users/{username}/repos")
			
			.then()	
				.assertThat().statusCode(200).log().all();
	}

}
