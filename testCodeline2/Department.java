package testCodeline2;

import java.util.ArrayList;

public class Department {
	private String departementName;
	private int    departementId;

	//Teacher teacher1 = new Teacher();
	ArrayList<Teacher> teacherList = new ArrayList<Teacher>(); //TODO: Initialize in where you use it not here


	//constructor//


/////Department Name/////
	public void setDepartementName(String departementName) {
		this.departementName = departementName;
		}
	public String getDepartementName() {
		return departementName;
	}
	
/////Department ID/////
	public void setDepartementId(int departementId) {
		this.departementId = departementId;
		}
	public int getDepartementId() {
		return departementId;
	}
	
	
	
//	void addTeacher(String teacherName) {
//		Teacher newTeach = new Teacher();
//		newTeach.setTeacherName(teacherName);
//		Teach.add(newTeach);
//	}
//	
	
}
