package prototype;

import java.util.Scanner;

public class Test {
	static Scanner lukija = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println("Paljonko kello? (h):");
        int h = lukija.nextInt();
        System.out.println("Paljonko kello? (m):");
        int m = lukija.nextInt();
		
		Kello k = new Kello(h, m);
		System.out.print("Kello Suomessa: ");
		System.out.println(k.toString());
		Kello k2 = k.clone();
		System.out.print("Kello Japanissa: ");
		System.out.println(k2.toString());
		k2.setTime(k.getHr() + 7, k.getMin());
		
		System.out.println();
		
		System.out.print("Kello Suomessa: ");
		System.out.println(k.toString());
		System.out.print("Kello Japanissa: ");
		System.out.println(k2.toString());
		
		System.out.println();
		
		System.out.println("Suomikellon HashCode: " + System.identityHashCode(System.identityHashCode(k)));
		System.out.println("Japanikellon HashCode: " + System.identityHashCode(System.identityHashCode(k2)));
	}
}
