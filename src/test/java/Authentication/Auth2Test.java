package Authentication;

import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
public class Auth2Test {
	
	@Test
	public void authentication()
	{
		Response reponse = given()
			.formParam("client_id", "kalunovuKUMAR")
			.formParam("client_secret", "")
			.formParam("grant_type", "")
			.formParam("redirect_uri", "")
			.formParam("code", "")
			
		.when()
			.post("http://coop.apps.symfonycasts.com/token");
		System.out.println(reponse);
		
		String token = reponse.jsonPath().get("access_token");
		
		given()
			.auth()
			.oauth2(token)
			.param("USER_ID", 3895)
			
		.when()
			.post("http://coop.apps.symfonycasts.com/api/{USER_ID}/eggs-count")
			.then().log().all();
	}

}
