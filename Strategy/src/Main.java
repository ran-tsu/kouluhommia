import java.util.List;
import java.util.ArrayList;

public class Main {
	
	public static void main(String[] args) {
		List<String> lista = new ArrayList<String>();
		StrategyContext context = new StrategyContext(new ListStrategy1());
		
		lista.add("Maalari");
		lista.add("maalaa");
		lista.add("taloa");
		lista.add("sinistä");
		lista.add("ja");
		lista.add("punaista");

		context.printList(lista);
		
		context.setStrategy(new ListStrategy2());
		context.printList(lista);
		
		context.setStrategy(new ListStrategy3());
		context.printList(lista);
		
	}
}