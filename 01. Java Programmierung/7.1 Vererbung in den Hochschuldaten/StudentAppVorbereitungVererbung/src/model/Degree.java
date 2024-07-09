package model;

public enum Degree {
	BACHELOR("Bachelor"), 
	MASTER("Master");
	
	private String englishName;
	
	private Degree(String englishName) {
		this.englishName = englishName;
	}
	
	public String toString() {
		return englishName;
	}
}