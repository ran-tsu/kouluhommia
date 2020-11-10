import java.util.List;

public class StrategyContext {
	
private ListConverter converter;
	
	public StrategyContext(ListConverter converter) {
		this.converter = converter;
	}
	
	public void printList(List<String> lista) {
		String tulostus = converter.listToString(lista);
		System.out.print(tulostus);
	}
	
	public void setStrategy(ListConverter converter) {
		this.converter = converter;
	}
}
