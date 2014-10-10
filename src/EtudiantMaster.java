
public class EtudiantMaster extends Etudiant{
	private String specialisation;

	public EtudiantMaster(String no, String a, String spe){
		super(no, a);
		specialisation = spe;
	}

	public String getSpecialisation() {
		return specialisation;
	}

	public void setSpecialisation(String specialisation) {
		this.specialisation = specialisation;
	}
	
	public String toString(){
		return ("Numero: " + getNum() + ", Nom: " + getNom() + ", Adresse: " + getAdresse() + ", Specialisation: " + specialisation);
	}
}
