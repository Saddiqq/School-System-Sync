package testCodeline2;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.util.ArrayList;

//TODO: Remove unused imports
public class Course {
	
	private int courseId; // int vs Integer; Boxing and Unboxing
	private String courseName;
	private int noOfChapters; // int vs Integer; Boxing and Unboxing
	Mark mark1 = new Mark(); // Never initialize in class
	
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
	
	
	//public static OutputStream newOutputStream(Path path,
         //   OpenOption... options)
       //             throws IOException 	
	
	
	
	
	
	
}
