package TD3;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class Ensemble {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		List<Etudiant> listEtudiant = new ArrayList<Etudiant>();
		
		listEtudiant.add(new EtudiantLicense("Arthur", "Thaon", "Miage"));
		listEtudiant.add(new EtudiantLicense("Yohann", "Epinal", "Miage"));
		listEtudiant.add(new EtudiantMaster("Helene", "Nancy", "SID"));
		
		Collections.sort(listEtudiant, new Comparator<Etudiant>(){
			@Override
			public int compare(Etudiant arg0, Etudiant arg1) {
				int res = arg0.getAdresse().compareTo(arg1.getAdresse());
				return res;
			}
		});
		
		for(Etudiant etu : listEtudiant){
			System.out.println(etu);
		}
	}

}
