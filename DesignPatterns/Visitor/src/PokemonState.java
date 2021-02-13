
public interface PokemonState {
	
	boolean taistele();
	void kerroKehitys();
	String kerroNimi();
	int kerroExp();
	void asetaExp(int asetus);
	void accept(Visitor visitor);
}
