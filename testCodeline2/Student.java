package testCodeline2;

import java.util.ArrayList;

public class Student {
	
	private String studentName;
	private int studentId;
	private String studentCourses;
	//Course course1 = new Course();
	ArrayList<Course> courseList = new ArrayList<Course>();
	
	
////Teacher Name////
	public void setStudentName(String studentName) {
		this.studentName = studentName;		
	}
	public String getStudentName() {
		return studentName;
	}
	
////Teacher Id////
	public void setStudentID(int studentId) {
		this.studentId = studentId;
	}
	public int getStudentID() {
		return studentId;
	}
	
////Teacher Course////
	public void setStudentCourses(String studentCourses) {
		this.studentCourses = studentCourses;
	}
	public String getStudentCourses() {
		return studentCourses;
	}
	
	
//	void addCourse(String courseName) {
//		Course newCourse = new Course();
//		newCourse.setCourseName(courseName);
//		course.add(newCourse);
//	}
//	
	
	

}
