package prototypeEsim;

public class Subject implements Cloneable {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String s) {
		name = s;
	}

	public Subject(String s) {
		name = s;
	}

	public Object clone() {
		try {
			return super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return null;
	}
}