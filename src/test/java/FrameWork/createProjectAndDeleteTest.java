package FrameWork;

import org.testng.Reporter;
import org.testng.annotations.Test;

import GenericUtility.BaseClass;
import GenericUtility.DataBaseUtility;
import GenericUtility.EndPointLibrary;
import GenericUtility.JavaUtility;
import GenericUtility.RestAssuerdLibrary;
//import GenericUtility.RestAssuredLibrary;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import junit.framework.Assert;
import PojoExamples.addProjectPojoTest;

import static io.restassured.RestAssured.*;
public class createProjectAndDeleteTest extends BaseClass {
	public DataBaseUtility dlib=new DataBaseUtility();
	public JavaUtility jlib=new JavaUtility();
	public RestAssuerdLibrary rlib=new RestAssuerdLibrary();

	@Test
	public void createProjectAndDelete() throws Throwable
	{
		//Step 1: create pre requisites
		PojoExamples.addProjectPojoTest pLib = new PojoExamples.addProjectPojoTest("KRJKumarzz", "kantararockzz", "succesful", 23);

		//Step 2: send request
		Response response = given()
				.body(pLib)
				.contentType(ContentType.JSON)
				.when()
				.post(EndPointLibrary.createdProject);
		
		when()
		.delete("/projects/TY_PROJ_604")
		
	.then()
		.assertThat()
			.contentType(ContentType.JSON)
			.statusCode(204)
			.log().all();

}
}