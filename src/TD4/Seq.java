package TD4;

import java.util.ArrayList;
import java.util.Collection;

public class Seq<E extends Comparable<E>> extends ArrayList<E>{
	private static final long serialVersionUID = 1L;

	public boolean occursAt(E s, int pos){
		return this.get(pos).equals(s);
	}
	
	public int find(E s){
		int res = -1;	
		for(int i=0; i<this.size(); i++){
			if(this.occursAt(s, i)){
				res = i;
				break;
			}
		}	
		return res;
	}
	
	public int countOccurence(E s){
		int res = 0;
		for(int i=0; i<this.size(); i++){
			if(this.occursAt(s, i)){
				res++;
			}
		}
		return res;
	}
	
	public void insert(int pos, Seq<E> sseq){
		this.addAll(pos, (Collection<E>)sseq);
	}
}
