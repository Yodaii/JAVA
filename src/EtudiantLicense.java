
public class EtudiantLicense extends Etudiant{
	private String parcours;
	
	public EtudiantLicense(String no, String a, String par){
		super(no, a);
		parcours = par;
	}

	public String getParcours() {
		return parcours;
	}

	public void setParcours(String parcours) {
		this.parcours = parcours;
	}
	
	public String toString(){
		return ("Numero: " + getNum() + ", Nom: " + getNom() + ", Adresse: " + getAdresse() + ", Parcours: " + parcours);
	}
}
