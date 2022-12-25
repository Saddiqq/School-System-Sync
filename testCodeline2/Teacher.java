package testCodeline2;

import java.util.ArrayList;

public class Teacher {
	
	private String teacherName;
	private int teacherId;
	private String teacherCourse;
	//Student student1 = new Student();
	ArrayList<Student> studentList = new ArrayList<Student>();
	
	
	
////Teacher Name////
	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;		
	}
	public String getTeacherName() {
		return teacherName;
	}
	
////Teacher Id////
	public void setTeacherID(int teacherId) {
		this.teacherId = teacherId;
	}
	public int getTeacherID() {
		return teacherId;
	}
	
////Teacher Course////
	public void setTeacherCourse(String teacherCourse) {
		this.teacherCourse = teacherCourse;
	}
	public String getTeacherCourse() {
		return teacherCourse;
	}
	
	
//	void addStudent(String studentName) {
//		Student newStudent = new Student();
//		newStudent.setStudentName(studentName);
//		stud.add(newStudent);
//	}
//	
	
	
	
	
	

}
