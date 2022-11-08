package PojoExamples;

import org.testng.annotations.Test;

public class I_AllocateUserPojoClassTest {
	public String designation;
	public String dob;
	public String email;
	public String empName;
	public int experience;
	public String mobileNo;
	public String project;
	public String role;
	public String username;
	
	public I_AllocateUserPojoClassTest(String designation, String dob, String email, String empName, int experience,
			String mobileNo, String project, String role, String username) {
		super();
		this.designation = designation;
		this.dob = dob;
		this.email = email;
		this.empName = empName;
		this.experience = experience;
		this.mobileNo = mobileNo;
		this.project = project;
		this.role = role;
		this.username = username;
	}

	
	
}
