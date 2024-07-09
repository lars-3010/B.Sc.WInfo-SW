package model;

public class LecturerCollection {

    private Lecturer[] lecturers = new Lecturer[100];

    public String toString() {
        String result = "Currently available Lecturers are:";
        for (Lecturer lecturer : lecturers) {
            if (lecturer != null) {
                result += "\n - " + lecturer.toString();
            }
        }
        return result;
    }

    public boolean add(Lecturer lecturer) {
        for (int i = 0; i < lecturers.length; i++) {
            if (lecturers[i] == null) {
                lecturers[i] = lecturer;
                return true;
            }
        }
        return false;
    }
}
