package GenericUtility;

import java.sql.SQLException;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import static io.restassured.RestAssured.*;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class BaseClassRequestSpecification {
	
		public JavaUtility jlib=new JavaUtility();
		public DataBaseUtility	dlib=new DataBaseUtility();
		public RestAssuerdLibrary rlib=new RestAssuerdLibrary();
		public RequestSpecification requestspec;
		public ResponseSpecification responseSpec;
		
		@BeforeSuite
		public void bsConfig() throws SQLException
		{
		
			dlib.connectDB();
			RequestSpecBuilder builder = new RequestSpecBuilder();
			builder.setBaseUri("http://localhost");
			builder.setPort(8084);
			builder.setContentType(ContentType.JSON);
			requestspec=builder.build();
			ResponseSpecBuilder builder1=new ResponseSpecBuilder();
			responseSpec = builder1.expectContentType(ContentType.JSON).build();
		}
		
		@AfterSuite
		public void asConfig() throws Throwable
		{
			dlib.closeDB();
			
		}
		
}
