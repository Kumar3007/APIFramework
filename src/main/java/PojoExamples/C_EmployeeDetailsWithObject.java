package PojoExamples;

public class C_EmployeeDetailsWithObject
{
//declare variables globally
	String eName;
	String eId;
	int[] pNo;
	String[] email;
	Object spouse;
	
//create constructor
	public C_EmployeeDetailsWithObject(String eName, String eId, int[] pNo, String[] email, Object spouse) 
	{
		this.eName = eName;
		this.eId = eId;
		this.pNo = pNo;
		this.email = email;
		this.spouse = spouse;
	}
	
//triggering
	public C_EmployeeDetailsWithObject()
	{
		
	}
	
//getters and setters
	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	public String geteId() {
		return eId;
	}

	public void seteId(String eId) {
		this.eId = eId;
	}

	public int[] getpNo() {
		return pNo;
	}

	public void setpNo(int[] pNo) {
		this.pNo = pNo;
	}

	public String[] getEmail() {
		return email;
	}

	public void setEmail(String[] email) {
		this.email = email;
	}

	public Object getSpouse() {
		return spouse;
	}

	public void setSpouse(String spouse) {
		this.spouse = spouse;
	}
	

	

	
	
}
