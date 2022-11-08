package PracticeExamples;

public class A_addProjectPojoClass {
	
	//step1:-Declare the variables globally
	//step2:- create a constructor for initiliazation
	//step3:-Trigger the Execution
	//step4:-getters and setters for access
	
	
//step1:-Declare the variables globally
	String createdBy;
	String projectName;
	String status;
	int teamsize;
	
	//step2:- create a constructor for initiliazation
	public A_addProjectPojoClass(String createdBy, String projectName, String status, int teamsize) {
		super();
		this.createdBy = createdBy;
		this.projectName = projectName;
		this.status = status;
		this.teamsize = teamsize;
	}
	
	//step3:-Trigger the Execution
	public A_addProjectPojoClass()
	{
		
	}
	
	//step4:-getters and setters for access
	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getTeamsize() {
		return teamsize;
	}

	public void setTeamsize(int teamsize) {
		this.teamsize = teamsize;
	}
	
	
	
	
	
}
