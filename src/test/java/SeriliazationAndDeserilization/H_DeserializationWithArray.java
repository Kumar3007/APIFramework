package SeriliazationAndDeserilization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import PojoExamples.B_EmployeeDataWithArray;

public class H_DeserializationWithArray 
{
	
				@Test
		public void DeserializationWithArrayTest() throws Throwable, Throwable, Throwable
		{
		//step1:- Create Object for Object repository		
			ObjectMapper obj = new ObjectMapper();
				
		//step2:-read the data from json file
			 B_EmployeeDataWithArray e2 = obj.readValue(new File("./B_EmployeeDataWithArray.json"), B_EmployeeDataWithArray.class);
				
				System.out.println(e2.geteName());
				System.out.println(e2.geteId());
				System.out.println(e2.getEmail());
				System.out.println(e2.getPhonoNo());
		}
	
}
