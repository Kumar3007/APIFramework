package GenericUtility;
import static io.restassured.RestAssured.*;

import java.sql.SQLException;
import io.restassured.response.Response;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class BaseClass {
	public DataBaseUtility dlib=new DataBaseUtility();
	public JavaUtility jlib=new JavaUtility();
	public RestAssuerdLibrary rlib=new RestAssuerdLibrary();

	@BeforeSuite
	public void bsConfig() throws Throwable
	{
		dlib.connectDB();
		baseURI="http://localhost";
		port=8084;
	}

	@AfterSuite
	public void asConfig() throws SQLException 
	{
		dlib.closeDB();
	}
}