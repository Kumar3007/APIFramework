package SeriliazationAndDeserilization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import PojoExamples.E_Emp_Wife_Details;
import PojoExamples.F_SpouseDetails;

public class D_Emp_Wife_Details
{
		@Test
		public void E_Emp_Wife_DetailsD_Emp_Wife_DetailsTest() throws Throwable, Throwable, Throwable
		{
			//step1:-create an object for PojoClass
			int[] pno= {12345,67892};
			String[] email= {"kuma@gmail.com","kumn@gmail.com"};
			F_SpouseDetails sp = new F_SpouseDetails("samantha", 123456789, "Sam@gmail.com");		
			E_Emp_Wife_Details emp = new E_Emp_Wife_Details("Karthik", "tys0252", pno, email, sp);
			
				
			//step2:-create an Object for ObjectMapper
				ObjectMapper Obj = new ObjectMapper();
			
			
			//step3:-Write the data to json File
				
				Obj.writeValue(new File("./E_Emp_Wife_Details"), emp);
			
			
		}
}
