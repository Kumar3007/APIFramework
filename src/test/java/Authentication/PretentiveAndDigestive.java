package Authentication;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
public class PretentiveAndDigestive {
	
	@Test
	public void PretentiveTest()
	{
		given()
			.auth()
			.preemptive()
			.basic("rmgyantra", "rmgy@9999")
			
		.when()
				.get("http://localhost:8084/login")
		
		.then()
			.assertThat().log().all();
	}
	
	@Test
	public void DigestiveTest()
	{
		given()
			.auth()
			.digest("rmgyantra", "rmgy@9999")
			
		.when()
			.get("http://localhost:8084/login")
			
		.then()
			.assertThat().log().all();
	}
	

}
