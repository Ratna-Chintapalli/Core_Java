package com.case_study;

public class Project {
	int projectid;
	String projectname;
	double projectbudget;
	
	Project(int projectid){
		this(projectid,"Unkonon",0.0);
		
		
	}
	
	

	public Project(int projectid, String projectname) {
		this(projectid,projectname,0.0);
	}



	public Project(int projectid, String projectname, double projectbudget) {
		this.projectid = projectid;
		this.projectname = projectname;
		this.projectbudget = projectbudget;
	}
	public static void main(String[] args) {
		Project p=new Project(01);
		p.show();
		Project p1=new Project(01,"RedBus");
		p1.show();
		Project p2=new Project(01,"RedBus",500000.00);
		p2.show();
		

	}
	void show() {
		System.out.println("Project Id is :" +projectid);
		System.out.println("ProjectName is :" +projectname);
		System.out.println("Project Budget  :" +projectbudget);
	}

}
