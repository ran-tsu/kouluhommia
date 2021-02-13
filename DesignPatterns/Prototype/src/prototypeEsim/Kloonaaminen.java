package prototypeEsim;

public class Kloonaaminen {
	public static void main(String[] args) {
		Student s = new Student("Olli", "Suunnittelumallit");
		System.out.println(s.getName() + ":" + s.getSubj().getName());
		Student s2 = s.clone();
		System.out.println(s2.getName() + ":" + s2.getSubj().getName());
		s2.setName("Laura");
		s2.getSubj().setName("Kryptomatematiikka");
		System.out.println(s.getName() + ":" + s.getSubj().getName());
		System.out.println(s2.getName() + ":" + s2.getSubj().getName());
	}
}