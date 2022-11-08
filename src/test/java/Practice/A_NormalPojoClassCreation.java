package Practice;

public class A_NormalPojoClassCreation {
	
	//step1:- Declare the Variables Globally
	//step2:-Create the Constructor for Initilization
	//step3:- Triggering Execution during initlization
	//step4:-setter and getter methods for access
	
	//step1:- Declare the Variables Globally
	String eName;
	String eId;
	int phoneNo;
	String email;
	String address;
	
	//step2:-Create the Constructor for Initilization
	public A_NormalPojoClassCreation(String eName, String eId, int phoneNo, String email, String address) {
		super();
		this.eName = eName;
		this.eId = eId;
		this.phoneNo = phoneNo;
		this.email = email;
		this.address = address;
	}
	
	//step3:- Triggering Execution during initlization
	public A_NormalPojoClassCreation()
	{
		
	}
	
	//step4:-setter and getter methods for access 

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

	public int getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(int phoneNo) {
		this.phoneNo = phoneNo;
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
