package TD3;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class TriList{

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static List<List> trierList(List<List> list){
		List res = list;
		
		Collections.sort(res, new Comparator<List>(){
			@Override
			public int compare(List arg0, List arg1) {
				int diff = arg0.size() - arg1.size();
				
				if(diff < 0){
					diff = -1;
				}else if(diff > 0){
					diff = 1;
				}
				
				return diff;
			}
		});
		
		return res;
	}
}
