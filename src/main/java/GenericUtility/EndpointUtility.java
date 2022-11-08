package GenericUtility;
import static io.restassured.RestAssured.*;
import io.restassured.http.ContentType;
import io.restassured.response.Response;


public class EndpointUtility implements EndPointLibrary {
	String url="http://localhost:8084";

	public PojoExamples.addProjectPojoTest body(String createdBy, String projectName, String status, int teamSize)
	{
		PojoExamples.addProjectPojoTest pojoBody = new PojoExamples.addProjectPojoTest(createdBy, projectName, status, teamSize);
		return pojoBody;
	}

	public Response get ()
	{
		String getEnd=url+getAllProjects;
		Response getEndPoint=when().get(getEnd);
		return getEndPoint;
	}

	public Response post(PojoExamples.addProjectPojoTest body)
	{
		Response postEndPoint =given()
				.body(body)
				.contentType(ContentType.JSON)
				.when()
				.post(url+createdProject);
		return postEndPoint;
	}

	public Response delete( String proId)
	{
		Response deleteEndPoint=when()
				.delete(url+deleteProject+proId);
		return deleteEndPoint;
	}

	public  Response getSingleProject(String proId)
	{
		String getEnd=url+getSingleProject;
		Response getEndPoint =when().get(getEnd+proId);
		return getEndPoint;
	}

	public Response put(PojoExamples.addProjectPojoTest body,String proId)
	{
		Response putEndPoint =given()
				.body(body)
				.contentType(ContentType.JSON)
				.when()
				.post(url+updatedProject+proId);
		return putEndPoint;
	}

}