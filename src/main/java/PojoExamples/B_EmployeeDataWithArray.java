package PojoExamples;

public class B_EmployeeDataWithArray 
{
	//step1:- Declare the variables globally
	String eName;
	String eId;
	int[] phonoNo;
	String email;
	String address;
	
	//step2:- Constructor for initliazation
	public B_EmployeeDataWithArray(String eName, String eId, int[] phonoNo, String email, String address) {
	
		this.eName = eName;
		this.eId = eId;
		this.phonoNo = phonoNo;
		this.email = email;
		this.address = address;
	}
	
	//step4:-create serilization
	public B_EmployeeDataWithArray() {
		
	}
	
	//step3:-create getters and setters

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

	public int[] getPhonoNo() {
		return phonoNo;
	}

	public void setPhonoNo(int[] phonoNo) {
		this.phonoNo = phonoNo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	
	

	
	
	
	
}
