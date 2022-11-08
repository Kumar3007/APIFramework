package PracticeExamples1;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import PracticeExamples.A_addProjectPojoClass;

public class B_DeserilizationOfaddProject {
			
			//step1:- create an object for Object Mapper
			//step2:- readTheValue from Object Mapper
	
	
			@Test
			public void B_Deserilization() throws Throwable, Throwable, Throwable
			{
					ObjectMapper proj1 = new ObjectMapper();
					
					A_addProjectPojoClass p1 = proj1.readValue(new File("./A_addProjectPojoClass"), A_addProjectPojoClass.class);
					
					p1.getCreatedBy();
					p1.getProjectName();
					p1.getStatus();
					p1.getTeamsize();
			}
	
}
