package testCodeline2;

import java.util.ArrayList;

public class Course {
	
	private int courseId;
	private String courseName;
	private int noOfChapters;
	Mark mark1 = new Mark();
	
	//ArrayList<Mark> markList = new ArrayList<Mark>();
	
////Course Name////
	public void setCourseName(String courseName) {
		this.courseName = courseName;		
	}
	public String getCourseName() {
		return courseName;
	}
	
////Course ID////
	public void setCourseID(int courseId) {
		this.courseId = courseId;		
	}
	public int getCourseID() {
		return courseId;
	}
	
////Number Of Chapters////
	public void setnoOfChapter(int noOfChapters) {
		this.noOfChapters = noOfChapters;		
	}
	public int getnoOfChapter() {
		return noOfChapters;
	}
	
	
//	void addMark(int mathMark) {
//		Mark newMark = new Mark();
//		newMark.setMark(studentName);
//		marks.add(newMark);
//	}
//	
	
	
	
	
	
	
	
}
