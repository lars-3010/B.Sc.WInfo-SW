package model;

public class StudentCollection {
	
	private Student[] students;
	
	public StudentCollection() {
		students = new Student[model.IdFactory.LAST_ID];
	}
	
	public String toString() {
		String result =
		"Currently available students are:";
		
		for (Student student : students) {
			if (student != null) {
				result += "\n - " + student.toString();
			}
		}
		return result;
	}

	public void add(Student student) {
		students[student.getId()] = student;
	}
	
	public void remove(Student student) {
		students[student.getId()] = null;
	}

}