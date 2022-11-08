package DifferentWaysToPostRequest;
import static io.restassured.RestAssured.*;

import java.util.HashMap;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
public class PostRequestUsingHashMapTest {
	@Test
	public void createProjectHashMApTest() {
	HashMap hp = new HashMap();
	hp.put("createdBy", "Kalpana");
	hp.put("projectName", "anything-11");
	hp.put("status", "Created");
	hp.put("teamSize", 10);
	baseURI = "http://localhost";
	port = 8084;
	given()
	.body(hp)
	.contentType(ContentType.JSON)
	.when()
	.post("/addProject")
	.then()
	.assertThat().statusCode(201)
	.and()
	.assertThat().contentType(ContentType.JSON)
	.log().all();

}
}