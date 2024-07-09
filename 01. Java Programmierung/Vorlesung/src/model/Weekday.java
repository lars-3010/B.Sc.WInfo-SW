package model;

public enum Weekday {
	MONDAY ("Montag", 1),
	TUESDAY ("Dienstag", 2),
	WEDNESDAY ("Mittwoch", 3),
	THURSDAY ("Donnerstag", 4),
	FRIDAY ("Freitag", 5),
	SATURDAY ("Samstag", 6),
	SUNDAY ("Sonntag", 7);
	
	private String germanName;
	private int dayNumber;
	
	private Weekday(String germanName, int dayNumber) {
		this.germanName = germanName;
		this.dayNumber = dayNumber;
	}
	
	public String getGermanName() {
		return this.germanName;
	}
	
	public int getDayNumber() {
		return this.dayNumber;
	}
	
}
