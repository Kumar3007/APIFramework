package DifferentWaysToPostRequest;
import static io.restassured.RestAssured.*;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import ApiTestCases.AddProjectWithoutStatusTest;
import io.restassured.http.ContentType;

public class PostrequestWithPojoTest {
	@Test
	public void createProjectTest() {
	//AddProjectWithoutStatusTest pj= new AddProjectPOJOTest("Kalpana", "rmgtyss3", "Created", 5);
	given()
	.contentType(ContentType.JSON)
//	.body(pj)
	.when()
	.post("http://localhost:8084/addProject")
	.then()
	.assertThat().contentType(ContentType.JSON)
	.and()
	.assertThat().statusCode(201)
	.log().all();

}
}