package GenericUtility;

import java.util.Random;

public class JavaUtility {
	public static int getRanDomNumber() {
		Random ranDom = new Random();
		int ranDomNum =  ranDom.nextInt(1000);
		return ranDomNum;
	
	}

}
