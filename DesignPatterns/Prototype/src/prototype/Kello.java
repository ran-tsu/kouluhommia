package prototype;

public class Kello implements Cloneable {
	private Viisari tunti;
	private Viisari minuutti;

	public int getHr() {
		return tunti.getTime();
	}

	public int getMin() {
		return minuutti.getTime();
	}

	public void setTime(int hr, int min) {
		while (min > 59) {
			min = 0 + (min - 60);
			hr++;
		}
		while (hr > 23) {
			hr = 0 + (hr - 24);
		}

		tunti.setTime(hr);
		minuutti.setTime(min);
	}

	public Kello(int hr, int min) {
		while (min > 59) {
			min = 0 + (min - 60);
			hr++;
		}
		while (hr > 23) {
			hr = 0 + (hr - 24);
		}

		tunti = new Viisari(hr);
		minuutti = new Viisari(min);
	}
	
	public String toString() {
		String palautus = new String();
		if (getHr() < 10) palautus += "0";
		palautus += getHr() + ":";
		if (getMin() < 10) palautus += "0";
		palautus += getMin();
		return palautus;
	}

	public Kello clone() {
		Kello k = null;
		try {
			k = (Kello) super.clone();
			k.tunti = (Viisari) tunti.clone();
			k.minuutti = (Viisari) minuutti.clone();
		} catch (CloneNotSupportedException e) {
		}
		return k;
	}

}
