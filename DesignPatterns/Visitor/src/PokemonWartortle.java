
class PokemonWartortle implements PokemonState{
	private int exp = 0;
	private String nimi = "Wartortle";
	
	public PokemonWartortle() {
		System.out.println("Nimeni on " + nimi + "!");
	}
	
	public boolean taistele() {
		System.out.println("Olen " + nimi + " ja taistelen!");
		exp++;
		System.out.println("Kokemuspisteeni ovat: " + exp);
		if (exp >= 6) {
			kerroKehitys();
			return true;
		}
		return false;
	}
	
	public void accept(Visitor visitor) {
		exp = visitor.visit(this);
	}
	
	public void kerroKehitys() {
		System.out.println("Kehityn!");
	}
	
	public String kerroNimi() {
		return nimi;
	}
	
	public int kerroExp() {
		return exp;
	}
	
	public void asetaExp(int asetus) {
		exp = asetus;
	}
}
