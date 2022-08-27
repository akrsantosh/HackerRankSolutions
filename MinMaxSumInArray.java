package HackerRankSolutions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MinMaxSumInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> arry = new ArrayList<Integer>();
		arry.add(7);
		arry.add(69);
		arry.add(2);
		arry.add(221);
		arry.add(8974);
		
		
		miniMaxSum(arry);
	}
		
public static void miniMaxSum(List<Integer> arr) {
        
        Long min = 0l , max = 0l;
   
        Collections.sort(arr);
        for(int i=0;i<arr.size()-1;i++) {
        	min = min +arr.get(i);
        }
        for(int i=1;i<arr.size();i++) {
        	max = max + arr.get(i);
        }
       System.out.println(min+" "+max);
    }

}
