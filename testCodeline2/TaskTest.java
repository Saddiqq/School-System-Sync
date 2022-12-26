package testCodeline2;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class TaskTest {

	public static final String green = "\u001B[92m";
	public static final String ANSI_BLUE = "\u001B[96m";
	public static final String white = "\033[37m";
	public static final String ANSI_BLACK = "\u001B[30m";
	public static final String ANSI_purple = "\033[35m";
	public static final String cyan = "\033[36m";
	public static final String red = "\033[31m";

	public static void main(String[] args) {

		School school = new School();
		Scanner sc = new Scanner(System.in);
		ArrayList<Department> departmentList = new ArrayList<Department>();
		Stack<String> stackHistory = new Stack<String>();

		System.out.println(green + "#######      School Registry System    ######");
		System.out.println("                                       ");
		System.out.println("                                       ");

		System.out.print(ANSI_BLUE + "Enter School Name: ");
		String name = sc.next();
		school.setSchoolName(name);
		stackHistory.push(name);

		System.out.print(ANSI_BLUE + "Enter School location: ");
		String location = sc.next();
		school.setSchoolLocation(location);
		stackHistory.push(location);

		System.out.print(ANSI_BLUE + "Enter School ID: ");
		Integer id = sc.nextInt();
		school.setSchoolId(id);
		stackHistory.push(id.toString());

		Boolean condtion1 = true;
		Boolean condtion2 = true;
		Boolean condtion3 = true;
		Boolean condition4 = true;
		// Boolean condition5 = true;

		while (condtion1) {
			///////// Department//////////
			// ***constructor line****
			Department department1 = new Department("HR", 511);

			System.out.print(ANSI_BLUE + "Enter Department Name: ");
			String depName = sc.next();
			department1.setDepartementName(depName);
			stackHistory.push(depName);

			System.out.print(ANSI_BLUE + "Enter Department Size: ");
			String depSize = sc.next();
			department1.setDepartementId(sc.nextInt());
			stackHistory.push(depSize);

			//////////////// Teacher/////////////
			while (condtion2) {
				Teacher teacherr = new Teacher();
				System.out.print(ANSI_BLUE + "Enter Teacher Name: ");
				String teachName = sc.next();
				teacherr.setTeacherName(sc.next());
				stackHistory.push(teachName);

				System.out.print(ANSI_BLUE + "Enter Teacher id: ");
				Integer teachId = sc.nextInt();
				teacherr.setTeacherID(sc.nextInt());
				stackHistory.push(teachId.toString());

				/////////////// Student////////////////
				while (condtion3) {
					Student student = new Student();
					System.out.print(ANSI_BLUE + "Enter Student Name: ");
					String studName = sc.next();
					student.setStudentName(sc.next());
					stackHistory.push(studName);

					System.out.print(ANSI_BLUE + "Enter Student ID: ");
					Integer studId = sc.nextInt();
					student.setStudentID(sc.nextInt());
					stackHistory.push(studId.toString());

					///////// Course/////////
					while (condition4) {
						Course course1 = new Course();
						System.out.print(ANSI_BLUE + "Enter Course Name: ");
						String coursceNm = sc.next();
						course1.setCourseName(sc.next());
						stackHistory.push(coursceNm);

						System.out.print(ANSI_BLUE + "Enter Course ID: ");
						Integer courseIdScanner = sc.nextInt();
						course1.setCourseID(sc.nextInt());
						stackHistory.push(courseIdScanner.toString());

						///////// Mark//////////
						System.out.print(ANSI_BLUE + "Enter Math Mark: ");
						String mathMRK = sc.next();
						course1.mark1.setMathMark(sc.nextInt());
						stackHistory.push(mathMRK);					
						student.courseList.add(course1);
						
						System.out.println(green
								+ "Do you want to add another Course? Press (1) if yes, else Press (2) to continue.");
						int option4 = sc.nextInt();
						if (option4 != 1) {
							condition4 = false;
						}
					}
					teacherr.studentList.add(student);
					System.out.println(green
							+ "Do you want add to another Student? Press (1) if yes, else Press (2) to continue.");
					int option3 = sc.nextInt();
					if (option3 != 1) {
						condtion3 = false;
					}
					condition4 = true;
				}

				department1.teacherList.add(teacherr);
				System.out.println(
						green + "Do you want to add another Teacher? Press (1) if yes, else Press (2) to continue.");
				int option2 = sc.nextInt();
				if (option2 != 1) {
					condtion2 = false;
				}
				condtion3 = true;
			}

			departmentList.add(department1);
			System.out.println(
					green + "Do you want add another Department? Press (1) if yes, else Press (2)  to continue.");
			condtion2 = true;
			condtion3 = true;
			int option = sc.nextInt();
			if (option != 1) {
				condtion1 = false;

				System.out.println("                                       ");
				System.out.println("                                       ");
				System.out.println("                                       ");
				System.out.println("                                       ");
				System.out.println("                                       ");
				System.out.println("                                       ");
				System.out.println("                                       ");
				System.out.println(green + "                     ########   REPORT RESULT  ########");
				System.out.println("                                       ");
				System.out.println("                                       ");
				System.out.println("                                       ");
				System.out.println("                                       ");
				System.out.println(cyan + "************** School Details ************** ");
				System.out.println(white + "School location :" + school.getSchoolLocation());
				System.out.println(white + "School Name :" + school.getSchoolName());
				System.out.println(white + "School ID :" + school.getSchoolId());
				System.out.println(cyan + "==================== Department Details ====================");
				for (Department dept : departmentList) {
					System.out.println(white + " Department Name : " + dept.getDepartementName());
					System.out.println(white + " Department ID : " + dept.getDepartementId());

					for (Teacher teach : dept.teacherList) {
						System.out.println(cyan + "==================== Teacher Details ====================");
						System.out.println(white + " Teacher Name : " + teach.getTeacherName());
						System.out.println(white + " Teacher ID : " + teach.getTeacherID());
						// System.out.println("==================== Student List ====================");
						for (Student stdn : teach.studentList) {
							System.out.println(cyan + "==================== Student Details ====================");
							System.out.println(white + "Student Name : " + stdn.getStudentName());
							System.out.println(white + " Student ID :" + stdn.getStudentID());
							System.out.println(cyan + "==================== Course Details ====================");
							for (Course course : stdn.courseList) {
								System.out.println(white + "Course Name : " + course.getCourseName());
								System.out.println("Course ID : " + course.getCourseID());
								System.out.println("Enter Mark : " + course.mark1.getmathMark());

							}
						}
					}

					System.out.println("====================================================");
				}

				System.out.println("                                       ");
				System.out.println("                                       ");
				System.out.println("                                       ");
				System.out.println("                                       ");

				

			}
			System.out.println(white+ " Input History:");
			for (String stackkkk: stackHistory) {
				System.out.println(stackkkk);
			}
		
			System.out.println(red + " Program Terminated. ");
		}
		
		sc.close();

	}
}