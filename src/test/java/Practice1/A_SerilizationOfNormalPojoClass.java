package Practice1;

import java.io.File;
import java.io.IOException;

import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import Practice.A_NormalPojoClassCreation;

public class A_SerilizationOfNormalPojoClass {
	
	@Test
	public void A_SerilizationOfNormalPojoClass() throws Throwable, Throwable, Throwable
	{
		//step1:- Create an Object for Normal PojoClass
		//Step2:- Create an Object Mapper
		//step3:- writing into Object Mapper
		
		
	//step1:- Create an Object for Normal PojoClass
		A_NormalPojoClassCreation EmpDetails = new A_NormalPojoClassCreation("kumar", "kumhi", 987654321, "kumar3007@gmail.com", "Mysore");
	
		
		//Step2:- Create an Object Mapper
		ObjectMapper obj = new ObjectMapper();
		
		//step3:- writing into Object Mapper
			obj.writeValue(new File("./A_NormalPojoClassCreation.JSON"), EmpDetails);
		
	}

	
}
