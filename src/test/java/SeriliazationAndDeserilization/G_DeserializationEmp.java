package SeriliazationAndDeserilization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

public class G_DeserializationEmp 
{
	@Test
	public void deserilizationOfEmp() throws JsonParseException, JsonMappingException, IOException 
	{
		ObjectMapper obj=new ObjectMapper();
			
	C_EmployeeDetailsWithObject e2 = obj.readValue(new File("./C_EmployeeDetailsWithObject.json"),C_EmployeeDetailsWithObject.class);
			
		
	}
}
