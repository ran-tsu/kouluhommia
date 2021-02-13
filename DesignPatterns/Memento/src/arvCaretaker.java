
public class arvCaretaker {
	private Object obj;
	
	public void liityPeliin(Arvuuttaja originator) {
		this.obj=originator.liityPeliin();
	}
	
	public void arvaus(Arvuuttaja originator, int arvaus) {
		if (originator.arvaus(obj, arvaus)) System.out.println("Oikein");
		else System.out.println("Väärin");
	}
	
	//Tarkista numero
	public int numero(Arvuuttaja originator) {
		return originator.numero(obj);
	}
}
