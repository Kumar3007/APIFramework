package SeriliazationAndDeserilization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import PojoExamples.D_Spouse;

public class C_EmployeeDetailsWithObject
{
	@Test
	public void EmployeeDetailsWithObjectTest() throws Throwable, Throwable, Throwable
	{
	int[] pNo= {12345,67893};
	String[] email= {"kumar@gmail.com","kukdkd@gmail.com"};
	D_Spouse sp = new D_Spouse("Samantha", 123456789, "Samantha@gmail.com");
//	C_EmployeeDetailsWithObject Emp = new C_EmployeeDetailsWithObject("Karthik", "tys0212", pNo, email,sp);
	
	PojoExamples.C_EmployeeDetailsWithObject emp = new PojoExamples.C_EmployeeDetailsWithObject("Karthik", "tys0212", pNo, email,sp);
	
		ObjectMapper Obj = new ObjectMapper();
		
		Obj.writeValue(new File("./C_EmployeeDetailsWithObject"), emp);
	}
}
