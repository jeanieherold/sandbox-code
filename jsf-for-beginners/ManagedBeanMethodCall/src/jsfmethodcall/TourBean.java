package jsfmethodcall;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class TourBean {
	
	private String kindOfTour;
	
	//constructor
	public TourBean() {
		
	}

	//getters and setters
	public String getKindOfTour() {
		return kindOfTour;
	}

	public void setKindOfTour(String kindOfTour) {
		this.kindOfTour = kindOfTour;
	}
	
	//method to determine which page to goto when user chooses city or country from tour_form.xhtml
	//setting up a conditional navigation
	public String startTheTour() {
		if (kindOfTour != null && kindOfTour.equals("city")) {
			return "city_tour";
		} else {
			return "country_tour";
		}
	}
	
	
}
