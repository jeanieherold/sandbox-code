package jsfmethodcall;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

@ManagedBean
@ApplicationScoped
public class CounterTwo {
	
	private int value = 0;
	
	public String increment() {
		value++;
		
		return "counter_two";
	}
	
	//constructor
	public CounterTwo() {
		
	}
	//getters and setters
	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	
	

}
