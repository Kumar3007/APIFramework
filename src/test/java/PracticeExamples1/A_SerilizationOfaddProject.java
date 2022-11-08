package PracticeExamples1;

import java.io.File;
import java.io.IOException;

import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import PracticeExamples.A_addProjectPojoClass;

public class A_SerilizationOfaddProject {
	
	//step1:-create an object for POJO class
	//step2:-create an obejct for ObjectMappper
	//step3:-writeTheValue to 
	
				@Test
				public void A_SerilizationOfaddProject() throws Throwable, Throwable, Throwable
				{
					
				A_addProjectPojoClass obj = new A_addProjectPojoClass("Samantha", "samzzz", "completed", 10);
						ObjectMapper objmap = new ObjectMapper();
						objmap.writeValue(new File("./A_addProjectPojoClass"), obj);
				
				
				}

}
