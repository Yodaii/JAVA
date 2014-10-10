package TD3;

public class Etudiant {
	private static int nombre = 0;
	private int num;
	private String nom;
	private String adresse;
	
	protected Etudiant(String no, String a){
		nombre ++;
		num = nombre;
		nom = no;
		adresse = a;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	
	public String toString(){
		return ("Numero: " + num + ", Nom: " + nom + ", Adresse: " + adresse);
	}
}
