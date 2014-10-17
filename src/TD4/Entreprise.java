package TD4;

import java.util.Iterator;
import java.util.LinkedList;

public class Entreprise extends LinkedList<Employe> implements Iterable<Employe>{
	private static final long serialVersionUID = 1L;
	private String nom;
	
	public void suppEmploye(Employe e){
		int pos=this.posEmploye(e);
		if(pos !=-1){
			this.remove(this.posEmploye(e));
		}
	}
	
	public void ajoutEmploye(Employe e){
		this.add(e);
	}
	
	public int posEmploye(Employe e){
		int res = -1;
		for(int i=0; i<this.size(); i++){
			if(e.equals(this.get(i))){
				res = i;
			}
		}
		return res;
	}
	
	public String toString(){
		String res = this.nom + "\n Employe(s): \n";
		for (Employe e : this) {
			res += e.getNom() + "\n";
		}
		return res;
	}
	
	public Iterator<Employe> iterator(){
		return this.iterator();
	}
}
