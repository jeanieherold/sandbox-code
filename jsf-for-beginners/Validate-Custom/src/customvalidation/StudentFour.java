package customvalidation;

import javax.faces.bean.ManagedBean;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.ValidatorException;
import javax.faces.application.FacesMessage;

@ManagedBean
public class StudentFour {
	
	private String firstName;
	private String lastName;
	private String courseCode;
	
	//no-arg constructor
	public StudentFour() {
		
	}
	
	//getters and setters
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCourseCode() {
		return courseCode;
	}

	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}
	
	//custom validation method for courseCode
	public void validateCourseCode(FacesContext context, UIComponent component, Object value) throws ValidatorException {
		if (value == null) {
			return;
		}
		//data the user entered
		String data = value.toString();
		
		//course code must start with CSU ... if not throw exception
		if (!data.toUpperCase().startsWith("CSU")) {
			FacesMessage message = new FacesMessage("Course code must start with CSU");
			
			throw new ValidatorException(message);
		}
	}
	
	
}

