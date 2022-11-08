package DifferentWaysToPostRequest;
import static io.restassured.RestAssured.*;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class PostRequestUsingJsonObjectTest {
	@Test
	public void createProjectTest() {
	JSONObject jobj = new JSONObject();
	jobj.put("createdBy", "Kalpana");
	jobj.put("projectName", "anything-1");
	jobj.put("status", "Created");
	jobj.put("teamSize", 10);
	baseURI = "http://localhost";
	port = 8084;
	given()
	.body(jobj)
	.contentType(ContentType.JSON)
	.when()
	.post("/addProject")
	.then()
	.assertThat()
	.contentType(ContentType.JSON).log().all();

}
}