package testCodeline2;

import java.util.ArrayList;

public class Department {
	private String departementName;
	private int    departementId;
	

	
	//constructor//
	public Department(String departementName, int departementId) {
		System.out.printf("This is a Constructor    " +departementName+ "    " +departementId);
		this.departementName = departementName;
		this.departementId = departementId;
	}
	
	//Teacher teacher1 = new Teacher();
	ArrayList<Teacher> teacherList = new ArrayList<Teacher>();
	
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
