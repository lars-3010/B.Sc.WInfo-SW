package model;

public enum Faculty {
	BUSINESS_ADMINISTRATION("Business Administration", "Betriebswirtschaft"),
	COMPUTER_SCIENCE("Computer Science", "Informatik");
	private String englishName;
	private String germanName;
	
	private Faculty(String englishName, String germanName) {
		this.englishName = englishName;
		this.germanName = germanName;
	}

	public String toString() {
		return this.germanName;
	}
}


