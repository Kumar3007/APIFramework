package PojoExamples;

public class G_ContactNum
{
  //step1:-declare variables globally
	String firstName;
	String lastName;
	String comp;
	int[] phoneNo;
	String email;
	String uRL;
	String address;
	String socialProfile;
	String[] nickName;
	Object family;
	
//Step2:- Create Constructor for initiliazation
	public G_ContactNum(String firstName, String lastName, String comp, int[] phoneNo, String email, String uRL,
			String address, String socialProfile, String[] nickName, Object family) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.comp = comp;
		this.phoneNo = phoneNo;
		this.email = email;
		this.uRL = uRL;
		this.address = address;
		this.socialProfile = socialProfile;
		this.nickName = nickName;
		this.family = family;
	}
	
	//step3:- trigger execution
	public G_ContactNum()
	{
		
	}
	//Step4:-Getters and Setters

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getComp() {
		return comp;
	}

	public void setComp(String comp) {
		this.comp = comp;
	}

	public int[] getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(int[] phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getuRL() {
		return uRL;
	}

	public void setuRL(String uRL) {
		this.uRL = uRL;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getSocialProfile() {
		return socialProfile;
	}

	public void setSocialProfile(String socialProfile) {
		this.socialProfile = socialProfile;
	}

	public String[] getNickName() {
		return nickName;
	}

	public void setNickName(String[] nickName) {
		this.nickName = nickName;
	}

	public Object getFamily() {
		return family;
	}

	public void setFamily(Object family) {
		this.family = family;
	}
	
	
	
	
	
	
	
}
