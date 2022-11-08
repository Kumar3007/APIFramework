package CRUD_OperationWithOut_BDD;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class C_GetProjectTest {
	
	@Test
	public void getAllProjects()
	{
		Response resp = RestAssured.get("http://localhost:8084/projects");
		
		String completebody = resp.prettyPrint();
		System.out.println(completebody);
		
		int actSc=resp.getStatusCode();
		System.out.println(actSc);
		
		String actCT = resp.getContentType();
		System.out.println(actCT);
	}

}
