import java.util.List;
import java.util.ListIterator;
import java.util.Arrays;

public interface ListConverter {

	String listToString(List lista);
}

class ListStrategy1 implements ListConverter {
	
		 @Override
		 public String listToString(List lista) {
			String palautus = new String();
			ListIterator iteraattori = lista.listIterator();
			
			System.out.println("1. strategia");
			System.out.println("");
			
			while(iteraattori.hasNext()) {
				
				palautus += iteraattori.next() + "\n";
			}
			palautus += "\n";
			return palautus;
		}
}

class ListStrategy2 implements ListConverter {
	
	 @Override
	 public String listToString(List lista) {
		String palautus = new String();
		Object[] taulukko = lista.toArray();
		int a = 1;
		
		System.out.println("2. strategia");
		System.out.println("");
		
		for (Object o : taulukko) {
			palautus += o + "\n";
			if (a == 2) {
				palautus += "\n";
				a = 0;
			}
			a++;
		}
		palautus += "\n";
		return palautus;
	}
}

class ListStrategy3 implements ListConverter {
	
	 @Override
	 public String listToString(List lista) {
		String palautus = new String();
		int a = 1;
		
		System.out.println("3. strategia");
		System.out.println("");
		
		for (int i=0; i < lista.size(); i++) {
			palautus += lista.get(i) + "\n";
			if (a == 3) {
				palautus += "\n";
				a = 0;
			}
			a++;
		}
		palautus += "\n";
		return palautus;
	}
}

