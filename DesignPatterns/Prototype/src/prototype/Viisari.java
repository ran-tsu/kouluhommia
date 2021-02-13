package prototype;

public class Viisari implements Cloneable {
	private int time;

	public int getTime() {
		return time;
	}

	public void setTime(int t) {
		time = t;
	}

	public Viisari(int t) {
		time = t;
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
