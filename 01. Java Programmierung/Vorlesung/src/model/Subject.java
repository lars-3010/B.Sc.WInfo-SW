package model;

public enum Subject {
	APPLIED_INFORMATICS("Applied Informatics", "Angewandte Informatik", Degree.BACHELOR), 
	BUSINESS_ADMINISTRATION("Business Administration", "Betriebswirtschaft", Degree.BACHELOR), 
	BUSINESS_INFORMATICS("Business Informatics", "Wirtschaftsinformatik", Degree.BACHELOR), 
	GENERAL_MANAGEMENT("General Management", "General Management", Degree.MASTER);
  
	private String englishName;
	private String germanName;
	private Degree degree;
	
	private Subject(String englishName, String germanName, Degree degree) {
		this.englishName = englishName;
		this.germanName = germanName;
		this.degree = degree;
	}
	
	public String getEnglishName() {
		return englishName;
	}
  
	public String getGermanName() {
		return germanName;
	}
	
	public Degree getDegree() {
		return degree;
	}
  
	public String toString() {
		return englishName + " (" + degree + ")";
	}
	
	public static Subject parseSubject(String text) {
		switch (text) {
			case "Applied Informatics":
				return APPLIED_INFORMATICS;
		    case "Business Administration":
		    	return BUSINESS_ADMINISTRATION;
		    case "Business Informatics":
		    	return BUSINESS_INFORMATICS;
		    case "Angewandte Informatik":
		    	return APPLIED_INFORMATICS;
		    case "Betriebswirtschaft":
		    	return BUSINESS_ADMINISTRATION;
		    case "Wirtschaftsinformatik":
		    	return BUSINESS_INFORMATICS;
		    case "General Management":
		    	return GENERAL_MANAGEMENT;
		    default:
		    	return null;
		  }
	}

}

