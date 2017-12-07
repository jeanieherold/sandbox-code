package jsfmethodcall;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class CounterOne {
	
	private int value = 0;
	
	public String increment() {
		value++;
		
		return "counter_one";
	}
	
	//constructor
	public CounterOne() {
		
	}
	//getters and setters
	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	
	

}