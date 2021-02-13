import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		arvCaretaker caretaker = new arvCaretaker();
		
		Arvuuttaja arvuuttaja = new Arvuuttaja(1);
		Arvuuttaja arvuuttaja2 = new Arvuuttaja(2);
		
		caretaker.liityPeliin(arvuuttaja);
		System.out.println("Arvaus numero 1: ");
        String paatos = scanner.nextLine();
		caretaker.arvaus(arvuuttaja, Integer.parseInt(paatos));
		
		caretaker.liityPeliin(arvuuttaja2);
		System.out.println("Arvaus numero 2: ");
        paatos = scanner.nextLine();
		caretaker.arvaus(arvuuttaja2, Integer.parseInt(paatos));
	}
}