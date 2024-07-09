package model;

// Co-Pilot Idee

public enum Faculty {
    BUSINESS_ADMINISTRATION("Business Administration", "Wirtschaftswissenschaften"),
    COMPUTER_SCIENCE("Computer Science", "Informatik");
    
    String englishName;
    String germanName;

    private Faculty(String englishName, String germanName) {
        this.englishName = englishName;
        this.germanName = germanName;
    }

    public String toString() {
        return this.germanName;
    }
}