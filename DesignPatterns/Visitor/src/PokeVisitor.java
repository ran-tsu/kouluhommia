
public class PokeVisitor implements Visitor {

	public int visit(PokemonSquirtle squirtle) {
		int palautus = squirtle.kerroExp() + 1;
		System.out.println("Bonuspiste! " + squirtle.kerroExp() + " + " + 1 + " = " + palautus);
		return palautus;
	}
	
	public int visit(PokemonWartortle wartortle) {
		int palautus = wartortle.kerroExp() + 1;
		System.out.println("Bonuspiste! " + wartortle.kerroExp() + " + " + 1 + " = " + palautus);
		return palautus;
	}
	
	public int visit(PokemonBlastoise blastoise) {
		int palautus = blastoise.kerroExp() + 1;
		System.out.println("Bonuspiste! " + blastoise.kerroExp() + " + " + 1 + " = " + palautus);
		return palautus;
	}
	
}
