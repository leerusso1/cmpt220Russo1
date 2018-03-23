
public class Course {
	private String courseName; 
	private int numberOfStudents; 
	private String[] students = new String[100]; 
	
	
	public Course(String courseName) {
		this.courseName = courseName; 
	}
	
	public void addStudent(String student) {
		students[numberOfStudents] = student; 
		numberOfStudents++; 
	}
	
	public String[] getStudents() {
		String[] newstudents = new String[numberOfStudents]; 
		int i = 0; 
		while() {
			
		}
		return students; 
	}
	
	public int getNumberOfStudents() {
		return numberOfStudents; 
	}
	
	public String getCourseName() {
		return courseName;
	}
	
	public void dropStudent(String student) {
		
	}
	
}
