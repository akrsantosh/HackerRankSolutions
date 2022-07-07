package HackerRankSolutions;

import java.util.ArrayList;
import java.util.List;

public class CompareTheTriplets {

	public static void main(String[] args) {
		
		List<Integer> op = new ArrayList<Integer>();
		List<Integer> a = new ArrayList<Integer>();
		a.add(1);
		a.add(76);
		a.add(14);
		List<Integer> b = new ArrayList<Integer>();
		b.add(73);
		b.add(24);
		b.add(19);
		op = compareTriplets(a,b);
		System.out.println(op);
		
	}

	public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
	    
	    int ac =0,bc=0;
	   List<Integer> res = new ArrayList<Integer>();
	   
	   for(int i=0; i<=a.size()-1 && i<=b.size()-1;i++){
	    
	    if(a.get(i) > b.get(i)){
	        ac++;
	    }
	     if(b.get(i) > a.get(i)){
	        bc++;
	    }
	    
	    
	   }
	   res.add(0, ac);
	    res.add(1,bc);
	   return res;
	 }

}
