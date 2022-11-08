package ApiTestCases;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.port;
import static io.restassured.RestAssured.when;

import java.util.Random;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import junit.framework.Assert;

public class AddProjectWithDifferentContentType {
	@Test
	public void AddProjectWithDifferentContentType()
	{
			Random ran=new Random();
			int random = ran.nextInt(500);
			
			JSONObject jobj = new JSONObject();
			jobj.put("createdBy", 1234565);
			jobj.put("status", "Ongng");
			jobj.put("projectName", "jmngjhvdff"+random);
			jobj.put("teamSize", "10");
			baseURI="http://localhost";
			port=8084;
			
			
			given()
			.body(jobj)
			.contentType(ContentType.XML)
			
		.when()
			.post("/addProject")
			
		.then()
			.assertThat()
				.statusCode(500)
				.contentType(ContentType.JSON).log().all();
	}	
//		//validation
//		public void getAllProjectTest()
//			{
//				String ExpectedId="1234565";
//				Response res = when().get("https://localhost:8084/projects");
//					java.util.List<String> actualId = res.jsonPath().get("createdBy");
//					
//					Boolean flag=false;
//					for (String aID : actualId) 
//					{
//						if(aID.equalsIgnoreCase(ExpectedId))
//						{
//							System.out.println("createdBy is found");
//							flag=true;
//						}
//						
					
						
					}
				
//			}
//			
//			}

