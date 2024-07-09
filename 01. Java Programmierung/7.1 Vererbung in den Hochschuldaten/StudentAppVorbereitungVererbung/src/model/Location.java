package model;

//Implementation of StudentApp, Übung 1.11
//Katrin Witting (basierend auf einem Konzept von Peter Ruckmann)

public class Location {
	//Instanzvariablen
	private String street;
	private int zip;
	private String town;
	
	//Instanzmethoden
	public Location(String street, int zip, String town) {
		this.street = street;
		this.zip = zip;
		this.town = town;
	}
	
	public String getStreet() {
		return street;
	}
	
	public int getZip() {
		return zip;
	}
	
	public String getTown() {
		return town;
	}
	
	public void setStreet(String street) {
		this.street = street;
	}
	
	public void setTown(String town) {
		this.town = town;
	}

	public void setZip(int zip) {
		this.zip = zip;
	}	
	
	//Überschreibe toString()
	public String toString() {
		return "Location [street=" + street + ", zip=" + zip + ", town=" + town + "]";
	}

}

