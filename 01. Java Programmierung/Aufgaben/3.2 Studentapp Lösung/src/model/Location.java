package model;

public class Location {
	
	private String street;
	private int zip;
	private String town;
	
	public Location(String street, int zip, String town) {
		this.street = street;
		this.zip = zip;
		this.town = town;
	}

	/**
	 * @return the street
	 */
	public String getStreet() {
		return street;
	}

	/**
	 * @return the zip
	 */
	public int getZip() {
		return zip;
	}

	/**
	 * @return the town
	 */
	public String getTown() {
		return town;
	}

	@Override
	public String toString() {
		return "Location [street=" + street + ", zip=" + zip + ", town=" + town + "]";
	}

}
