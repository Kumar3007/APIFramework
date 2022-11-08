package SeriliazationAndDeserilization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import PojoExamples.B_EmployeeDataWithArray;

public class B_SerializationOfEmpDetailsWithArray
{
		@Test
		public void SerializationOfEmpDetailsWithArrayTest() throws Throwable, Throwable, Throwable
		{
				int[] phonoNo= {1232545,215567891};	
			
				B_EmployeeDataWithArray emp = new B_EmployeeDataWithArray("Samantha", "TYS002", phonoNo, "samantha@gmail.com", "RamojiFilmCity");
			
				ObjectMapper Obj = new ObjectMapper();
				
				Obj.writeValue(new File("./B_EmployeeDataWithArray.json"), emp);
			
			
		}
}
