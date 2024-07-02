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
}