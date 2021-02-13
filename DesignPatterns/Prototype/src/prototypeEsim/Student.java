package prototypeEsim;

public class Student implements Cloneable {
	private Subject subj;
	private String name;

	public Subject getSubj() {
		return subj;
	}

	public String getName() {
		return name;
	}

	public void setName(String s) {
		name = s;
	}

	public Student(String s, String sub) {
		name = s;
		subj = new Subject(sub);
	}

	public Student clone() {
		// syväkopio
		Student s = null;
		try {
			s = (Student) super.clone();
			s.subj = (Subject) subj.clone();
		} catch (CloneNotSupportedException e) {
		}
		return s;
	}
}
