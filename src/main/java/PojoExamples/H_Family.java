package PojoExamples;

public class H_Family {
	
	String FatherName;
	String MotherName;
	
	public H_Family()
	{
		
	}

	public H_Family(String fatherName, String motherName) {
		super();
		FatherName = fatherName;
		MotherName = motherName;
	}

	public String getFatherName() {
		return FatherName;
	}

	public void setFatherName(String fatherName) {
		FatherName = fatherName;
	}

	public String getMotherName() {
		return MotherName;
	}

	public void setMotherName(String motherName) {
		MotherName = motherName;
	}
	
	

}
