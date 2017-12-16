package listandtabledemo;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

@ManagedBean
@ApplicationScoped
public class StudentDataUtil {
	
	private List<Student> students;
	
	//constructor
	public StudentDataUtil() {
		loadSampleData();
	}
	
	// we load up sample data
	public void loadSampleData() {
		students = new ArrayList<>();
		
		students.add(new Student("Mary", "Public", "mary@luv2code.com"));
		students.add(new Student("John", "Doe", "john@luv2code.com"));
		students.add(new Student("Ajay", "Rao", "ajay@luv2code.com"));
	}
	//getter
	//return sample data as a list of students
	public List<Student> getStudents() {
		return students;
	}
	
}
