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
public class createPVerifyInDBTest extends BaseClass {
	public DataBaseUtility dlib=new DataBaseUtility();
	public JavaUtility jlib=new JavaUtility();
	public RestAssuerdLibrary rlib=new RestAssuerdLibrary();

	@Test
	public void createPVerifyInDB() throws Throwable
	{
		//Step 1: create pre requisites
		PojoExamples.addProjectPojoTest pLib = new PojoExamples.addProjectPojoTest("KRJKumar", "kantararockzz", "succesful", 23);

		//Step 2: send request
		Response response = given()
				.body(pLib)
				.contentType(ContentType.JSON)
				.when()
				.post(EndPointLibrary.createdProject);

		//Step 3: capture the ID
		String expData = rlib.getJsonData(response, "projectId");
		Reporter.log(expData,true);

		//Step 4: validate the id in database
		String query = "select * from project";
		boolean actData = dlib.executeQuerryAndVerify(query, 1, expData);

		Assert.assertEquals(expData, actData);

	}
}