package FrameWork;
import org.testng.*;
import org.testng.annotations.Test;

import GenericUtility.BaseClass;
import GenericUtility.EndpointUtility;

public class EndToEnd {
	
			
		BaseClass bc=new BaseClass();
		EndpointUtility	Epu=new EndpointUtility();
		
		@Test
		public void get()
		{
			Epu.get().then().log().all();
		}
		
}
