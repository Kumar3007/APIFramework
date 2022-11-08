package PojoExamples;

public class A_EmployeeDetails {

	//Step1:- Declare the variable globally
		String eName;
		String  eId;
		int phoneNo;
		String email;
		String address;
		
	//Step2:- Create Constructor for Initiliazation	
		public A_EmployeeDetails(String eName, String eId, int phoneNo, String email, String address)
		{
			this.eName = eName;
			this.eId = eId;
			this.phoneNo = phoneNo;
			this.email = email;
			this.address = address;
		}
	
	//Step3:- Triggering execution during serilization or deserilization
		public A_EmployeeDetails()
		{
			
		}
		
	//Step4:- Setter and Getter
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
