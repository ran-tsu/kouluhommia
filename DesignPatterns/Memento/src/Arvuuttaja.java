import java.util.Random;

public class Arvuuttaja {
	private int pelaaja;
	Random rng = new Random();
	
	public Arvuuttaja(int pelaaja) {
		this.pelaaja = pelaaja;
	}
	
	public Object liityPeliin() {
		int arvo = rng.nextInt(99) + 1;
		return new arvMemento(pelaaja, arvo);
	}
	
	public int numero(Object obj) {
		arvMemento memento = (arvMemento) obj;
		return memento.luku;
	}
	
	public boolean arvaus(Object obj, int arvaus) {
		arvMemento memento = (arvMemento) obj;
		this.pelaaja = memento.pelaaja;
		if (arvaus == memento.luku) {
			return true;
		}
		System.out.println("Oikea luku olisi ollut " + memento.luku);
		return false;
	}
	
	private class arvMemento {
		private int luku = 0;
		private int pelaaja = 0;
		
		public arvMemento(int pelaaja, int luku) {
			this.pelaaja = pelaaja;
			this.luku = luku;
		}
	}
}