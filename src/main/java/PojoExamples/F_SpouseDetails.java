package PojoExamples;

public class F_SpouseDetails 
{
		String sName;
		int pNo;
		String email;
		
		public F_SpouseDetails(String sName, int pNo, String email)
		{
			//super();
			this.sName = sName;
			this.pNo = pNo;
			this.email = email;
		}
		
		public F_SpouseDetails()
		{
			
		}

		public String getsName() {
			return sName;
		}

		public void setsName(String sName) {
			this.sName = sName;
		}

		public int getpNo() {
			return pNo;
		}

		public void setpNo(int pNo) {
			this.pNo = pNo;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}
		
		
}
