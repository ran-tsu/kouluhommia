
public class PokemonContext {
	private PokemonState state;
	
	public PokemonContext() {
		state = new PokemonSquirtle();
	}
	
	public void Seikkaile() {
		while (state.kerroNimi() != "eläkeläinen") {
			if (state.taistele() == true) kehity();
		}
	}
	
	public void kehity() {
		if (state.kerroNimi() == "Squirtle") {
			state = new PokemonWartortle();
			System.out.print(state.kerroNimi() + "!\n");
		}
		else if (state.kerroNimi() == "Wartortle") {
			state = new PokemonBlastoise();
			System.out.print(state.kerroNimi() + "!\n");
		} else {
			System.out.print(state.kerroNimi() + "!\n");
			System.out.println("Olen aivan liian vanha taistelemaan.");
		}
	}
}
