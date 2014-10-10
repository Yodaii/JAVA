package TD3;
import java.util.HashSet;
import java.util.Iterator;


public class CompareHashset<E> extends HashSet<E>{
	private static final long serialVersionUID = 1L;

	public HashSet<E> union(HashSet<E> hs){
		HashSet<E> res = new HashSet<E>();
		res.addAll(this);
		res.addAll(hs);
		
		return res;
	}
	
	public HashSet<E> intersection(HashSet<E> hs){
		HashSet<E> res = (HashSet<E>) hs.clone();
		res.retainAll(hs);
		
		return res;
	}
	
	public HashSet<E> diffEnsembliste(HashSet<E> hs){
		HashSet<E> res = this.union(hs);
		res.removeAll(hs);
		
		return res;
	}
	
	public HashSet<E> diffSymetrique(HashSet<E> hs){
		HashSet<E> res = this.union(hs);
		res.removeAll(this.intersection(hs));
		
		return res;
	}
}
