package ValidationTest;
import static io.restassured.RestAssured.*;

import com.sun.xml.bind.v2.schemagen.xmlschema.List;

import io.restassured.response.Response;
import junit.framework.Assert;
public class B_DynamicResponseValTest {
	
	public void getAllProjectTest()
	{
		String ExpectedId="TY_PROJ_802";
		Response res = when().get("https://localhost:8084/projects");
			java.util.List<String> actualId = res.jsonPath().get("projectId");
			
			Boolean flag=false;
			for (String aID : actualId) {
				if(aID.equalsIgnoreCase(ExpectedId))
				{
					System.out.println("projectId is found");
					flag=true;
				}
				
			
				
			}
			Assert.assertTrue(flag);
		
		
		
	}

}
