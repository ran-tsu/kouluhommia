import java.util.Random;

public class PokemonContext {
	private PokemonState state;
	Random rng = new Random();
	PokeVisitor visitor = new PokeVisitor();
	
	public PokemonContext() {
		state = new PokemonSquirtle();
	}
	
	public void Seikkaile() {
		while (state.kerroNimi() != "eläkeläinen") {
			if (state.taistele() == true) kehity();
			if (rng.nextInt(9) > 4) state.accept(visitor); 
		}
	}
	
	public void kehity() {
		int exp = state.kerroExp();
		if (state.kerroNimi() == "Squirtle") {
			state = new PokemonWartortle();
		}
		else if (state.kerroNimi() == "Wartortle") {
			state = new PokemonBlastoise();
		} else {
			System.out.println("Olen aivan liian vanha taistelemaan.");
		}
		state.asetaExp(exp);
	}
}
