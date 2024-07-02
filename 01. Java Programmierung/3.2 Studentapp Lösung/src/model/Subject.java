package model;

public enum Subject {

    APPLIED_INFORMATIONS("Angewante Informatik", "Applied Informatics", Degree.BACHELOR),
    BUSNINESS_ADMINISTRATIONS("Betriebswirtschaftslehre", "Business Administration", Degree.BACHELOR),
    BUSNINESS_INFORMATICS("Wirtschaftsinformatik", "Business Informatics", Degree.BACHELOR),
    GENERAL_MANAGEMENT("Allgemeine Betriebswirtschaftslehre", "General Management", Degree.MASTER),;

    private String germanName;
    private String englishName;
    private Degree degree;

    private Subject(String germanName, String englishName, Degree degree) {
        this.germanName = germanName;
        this.englishName = englishName;
        this.degree = degree;
    }
    
    public Degree getDegree() {
        return this.degree;
    }

    public String getGermanName() {
        return this.germanName;
    }
    public String getEnglishName() {
        return this.englishName;
    }
    public String Degree() {
        if (germanName == "Allgemeine Betriebswirtschaftslehre") {
            return "Master";
        } else {
            return "Bachelor";
        }
    }
    public String toString() {
        return this.germanName +", "+ this.englishName +", "+ this.degree;
    }
}
