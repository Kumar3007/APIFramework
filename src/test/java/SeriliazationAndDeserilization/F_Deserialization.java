package SeriliazationAndDeserilization;

import java.io.File;

import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import PojoExamples.G_ContactNum;
import PojoExamples.H_Family;

public class F_Deserialization {
	
		@Test
		public void deserilizationOfContactTest() throws Throwable, Throwable, Throwable
		{
			//step1:- create object of objectmapper from jackson mapper
			ObjectMapper Obj = new ObjectMapper();
			
			//step2:- read dadtda from json file
		 G_ContactNum e1 = Obj.readValue(new File("./G_ContactNum"),G_ContactNum.class );
		 
		 System.out.println(e1.getFamily());
		 System.out.println(e1.getLastName());
		 System.out.println(e1.getFirstName());
		 System.out.println(e1.getComp());
		 System.out.println(e1.getEmail());
		 System.out.println(e1.getAddress());
		 System.out.println(e1.getPhoneNo());
		 System.out.println(e1.getSocialProfile());
		 System.out.println(e1.getuRL());
		 
		}
	}


