package Practice1;

import java.io.File;

import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

public class B_DeserilizationOfNormalPojoClass {
	
	//step1:- create object of objectmapper from jackson mapper
	//step2:- read data from json file
	
		@Test
	public void B_DeserilizationOfNormalPojoClass()
	{
			//step1:-create an object for objectMapper from jackson mapper
				ObjectMapper obj = new ObjectMapper();
				
			//step:- read the value from json file
			//Object e1 = obj.readValue(new File("./A_NormalPojoClassCreation"), obj);
			
				
	}

}
