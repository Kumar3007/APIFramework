package PojoExamples;

public class E_Emp_Wife_Details 
{
	//step1:-declare variables globally
		String eName;
		String eId;
		int[] pno;
		String[] email;
		Object Spouse;
		
	//step2:- Create Constructor for initilization	
		public E_Emp_Wife_Details(String eName, String eId, int[] pno, String[] email, Object spouse) {
			//super();
			this.eName = eName;
			this.eId = eId;
			this.pno = pno;
			this.email = email;
			Spouse = spouse;
		}
		
	//step3:-Triggering Execution
		public void E_Emp_Wife_Details()
		{
			
		}
		
	//Step4:-getters and Setters
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

		public int[] getPno() {
			return pno;
		}

		public void setPno(int[] pno) {
			this.pno = pno;
		}

		public String[] getEmail() {
			return email;
		}

		public void setEmail(String[] email) {
			this.email = email;
		}

		public Object getSpouse() {
			return Spouse;
		}

		public void setSpouse(Object spouse) {
			Spouse = spouse;
		}
	
	
		
		
		
}
