package SeriliazationAndDeserilization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import PojoExamples.A_EmployeeDetails;
import io.restassured.config.ObjectMapperConfig;

public class A_SerializationOfEmpDetails 
{
	@Test
	
	public void SerializationOfEmpDetailsTest() throws Throwable, JsonMappingException, IOException
	{
		A_EmployeeDetails emp = new A_EmployeeDetails("Kumar","Tys0012",987466545,"kumar@gmail.com","hb2,mysore");
		
			ObjectMapper Obj = new ObjectMapper();
			
			Obj.writeValue(new File("./A_EmployeeDetails.json"), emp);
		
	}
}
