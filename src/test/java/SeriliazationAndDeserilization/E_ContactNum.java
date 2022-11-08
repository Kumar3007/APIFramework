package SeriliazationAndDeserilization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import PojoExamples.H_Family;
import PojoExamples.G_ContactNum;

public class E_ContactNum {

	@Test
	public void serilizationOfContactTest() throws Throwable, Throwable, Throwable
	{
		int[] phoneNo= {123456,7891011};
		String[] nickName= {"xyz","abc"};
		
		H_Family fam = new H_Family("Ramanji", "Gowramma");
		
		G_ContactNum con = new G_ContactNum("kumar", "ram", "tyss", phoneNo, "kuma@gmail.com", "www.kumar.com", "mysore", "firend", nickName, fam);
		
		ObjectMapper Obj = new ObjectMapper();
		
		Obj.writeValue(new File("./G_ContactNum"), con);
	}
	
}
