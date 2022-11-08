package ValidationTest;

import org.hamcrest.Matcher;
import org.hamcrest.Matchers;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.junit.Assert.assertThat;

import java.util.concurrent.TimeUnit;

public class F_TimeValidation {

			@Test
			public void ValResTime()
			{
				baseURI="http://localhost";
				port=8084;
				
				when()
				.get("http://localhost")
				
				.then()
					.assertThat().time(Matchers.lessThan(2000L),TimeUnit.MILLISECONDS);
				
				
				
			}
}
