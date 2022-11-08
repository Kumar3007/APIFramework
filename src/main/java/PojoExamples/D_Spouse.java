package PojoExamples;

public class D_Spouse
{
	String sName;
	int sPno;
	String sEmail;
	
	
	public D_Spouse(String sName, int sPno, String sEmail) 
	{
		super();
		this.sName = sName;
		this.sPno = sPno;
		this.sEmail = sEmail;
	}

	public D_Spouse()
	{
		
	}

	public String getsName() {
		return sName;
	}


	public void setsName(String sName) {
		this.sName = sName;
	}


	public int getsPno() {
		return sPno;
	}


	public void setsPno(int sPno) {
		this.sPno = sPno;
	}


	public String getsEmail() {
		return sEmail;
	}


	public void setsEmail(String sEmail) {
		this.sEmail = sEmail;
	}
	
	
	
}
