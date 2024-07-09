package model;

public enum Faculty {
    BUSINESS_ADMINISTRATION("BWL", 1),
    COMPUTER_SCIENCE("Informatik", 2);	

    private String germanName;
    private int facultyNumber;

    private Faculty(String germanName, int facultyNumber) {
        this.germanName = germanName;
        this.facultyNumber = facultyNumber;
    }	

    public String tString() {
        return this.germanName;
    }
    
}
