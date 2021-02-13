
class PokemonWartortle implements PokemonState{
	private int exp = 0;
	private String nimi = "Wartortle";
	
	
	public boolean taistele() {
		System.out.println("Olen " + nimi + " ja taistelen!");
		exp++;
		if (exp >= 3) {
			kerroKehitys();
			return true;
		}
		return false;
	}
	
	public void kerroKehitys() {
		System.out.print("Kehityn, minusta tulee ");
	}
	
	public String kerroNimi() {
		return nimi;
	}
	
}
