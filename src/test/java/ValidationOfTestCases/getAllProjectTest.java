package ValidationOfTestCases;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.port;
import static io.restassured.RestAssured.when;
import static org.junit.Assert.assertThat;

import org.hamcrest.collection.HasItemInArray;

import static org.hamcrest.Matcher.*;

import org.testng.Assert;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

import io.restassured.http.ContentType;
import io.restassured.matcher.ResponseAwareMatcher;
import io.restassured.response.Response;
import net.bytebuddy.implementation.bytecode.assign.Assigner.EqualTypesOnly;

public class getAllProjectTest {
	
	@Test
	public void allProjects()
	{
	
		ResponseAwareMatcher<Response> equalto;
		given()
		.get("https://localhost:8084/projects")
		
		.then()
		.statusCode(200)
	//	.body("data.projectId[0]", equalto)
		.log().all();
		
		
			
		
		
		
		
		
	}

}
