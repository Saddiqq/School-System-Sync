package testCodeline2;
import java.util.ArrayList;


public class School {
	private String schoolName;
	private String schoolLocation;
	private int schoolId;
	
	ArrayList<Department> Dep = new ArrayList<Department>();
	
	/////School Name/////
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	public String getSchoolName() {
		return schoolName;
	}

	/////School Location/////
	public void setSchoolLocation(String schoolLocation) {
		this.schoolLocation = schoolLocation;
	}
	public String getSchoolLocation() {
		return schoolLocation;
	}
	
	/////School ID/////
	public void setSchoolId(int schoolId) {
		this.schoolId = schoolId;
	}
	public int getSchoolId() {
		return schoolId;
	}
	
	
	
	void addDepartement(String departementName) {
		Department newDepartment = new Department("HR",511);
		newDepartment.setDepartementName(departementName);
		Dep.add(newDepartment);
	}
	
	
	
	
}