package model;

ppublic class StudentCollection {
	private Student[] students;
	
	public StudentCollection() {
		students = new Student[model.IdFactory.LAST_ID];
	}
	
	public void add(Student student) {
		students[student.getId()] = student;
	}
	
	public void remove(Student student) {
		students[student.getId()] = null;
	}
	
	public Student getStudentData(String name) {
		for (Student student : students) {
			if ((student != null) && (student.getName() == name)) {
				return student;
			}
		}
		return null;		
	}
	
	public boolean entryExists(int id) {
		// if (students[id] != null) {
		// return true;
		// }
		// else {
		// return false;
		// }
		//Kurzform:  //y = (Ausdruck) ? var1 : var0 
		    return (students[id] != null) ? true:false;
	}

	
	public String toString() {
		String result = "Currently available students are:";
		for (Student student : students) {
			if (student != null) {
				result += "\n - " + student.toString();
			}
		}
		return result;
	}

}
